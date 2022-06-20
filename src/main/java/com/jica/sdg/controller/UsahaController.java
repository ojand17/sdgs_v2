package com.jica.sdg.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jica.sdg.model.Provinsi;
import com.jica.sdg.model.RefBidangUsaha;
import com.jica.sdg.model.RefSkalaUsaha;
import com.jica.sdg.model.RefKatUsaha;
import com.jica.sdg.model.RefKodeUsaha;
import com.jica.sdg.model.Role;
import com.jica.sdg.model.Usahadetail;
import com.jica.sdg.model.Usahaprofile;
import com.jica.sdg.model.Usahaprofile2;
import com.jica.sdg.service.IProvinsiService;
import com.jica.sdg.service.IRoleService;
import com.jica.sdg.service.IUsahaDetailService;
import com.jica.sdg.service.IUsahaProfileService;

@Controller
public class UsahaController {
	
    @Autowired
    private IProvinsiService provinsiService;
    
    @Autowired
    private IUsahaProfileService nsaProfilrService;
    
    @Autowired
    private IUsahaDetailService nsaDetailService;
    
    @Autowired
    IRoleService roleService;
    
    @Autowired
    private EntityManager em;
    
    @GetMapping("admin/corporation/profile")
    public String nsa_profile(Model model, HttpSession session) {
    	Integer id_role = (Integer) session.getAttribute("id_role");
        model.addAttribute("lang", session.getAttribute("bahasa"));
        model.addAttribute("name", session.getAttribute("name"));
        model.addAttribute("id_role", session.getAttribute("id_role"));
        model.addAttribute("listNsaProfile", nsaProfilrService.findRoleNsa());
    	Optional<Role> list = roleService.findOne(id_role);
    	String id_prov      = list.get().getId_prov();
    	String privilege    = list.get().getPrivilege();
    	if(id_prov.equals("000")) {
    		model.addAttribute("listprov", provinsiService.findAllProvinsi());
    	}else {
    		Optional<Provinsi> list1 = provinsiService.findOne(id_prov);
    		list1.ifPresent(foundUpdateObject1 -> model.addAttribute("listprov", foundUpdateObject1));
    	}
        model.addAttribute("id_prov", id_prov);
        model.addAttribute("privilege", privilege);
        return "admin/usaha/usaha_profile";
    }
    
    @GetMapping("admin/list-getid-corporation-profil/{id}")
    public @ResponseBody Map<String, Object> nsaProfilListid(@PathVariable("id") String id) {
        
        String id_role = id.equals("all")?"":" and a.id_role = '"+id+"' ";
        
        String sql = "select a.*,b.id_prov from usaha_profile a "
                     + "left join ref_role b on b.id_role = a.id_role where 1=1 "+id_role+" ";
        
        Query list = em.createNativeQuery(sql);
        List<Object[]> rows = list.getResultList();
        List<Usahaprofile2> result = new ArrayList<>(rows.size());
        Map<String, Object> hasil = new HashMap<>();
        for (Object[] row : rows) {
            Short num = new Short((short)1);
            result.add(
                    new Usahaprofile2(
                                      (Integer)row[0]
                                    , (Integer)row[1]
                                    , (String) row[2]
                                    , (String) row[3]
                                    , (String) row[4]
                                    , (String) row[5]
                                    , Integer.parseInt(row[6].toString())
                                    , (String) row[7]
                                    , (String) row[8]
                                    )
                    );
        }
        hasil.put("content",result);
        return hasil;
    }
    
    @GetMapping("admin/list-corporation-profil-detail/{id}")
    public @ResponseBody Map<String, Object> nsaProfilListiddetailjadi(@PathVariable("id") String id) {
        List<Usahadetail> list = nsaDetailService.findId(id);
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content",list);
        return hasil;
    }
    
    @GetMapping("admin/list-corporation-profil-detail-jadi/{id}/{id_prov}")
    public @ResponseBody Map<String, Object> nsaProfilListiddetail(@PathVariable("id") String id,@PathVariable("id_prov") String id_prov) {
    	String role = "";
    	String prov = "";
    	if(!id.equals("00")) {role=" and a.id_role = '"+id+"' ";}
    	if(!id_prov.equals("all")) {prov=" and b.id_prov = '"+id_prov+"' ";}
    	String sql = "select a.id_usaha,a.nm_usaha,a.achieve_usaha,a.loc_usaha,a.beneficiaries,a.year_impl,a.major_part, "
    			+ "c.usaha_type,c.web_url,c.head_office,c.name_pic,c.pos_pic,c.email_pic,c.hp_pic,a.id_role, e.nm_prov,"
                        + "a.no_telp, a.website, a.id_skala_usaha, a.id_bidang_usaha, a.id_kat_usaha, a.kode_usaha, a.nama_perusahaan,"
                        + "f.nm_skala_usaha, g.nm_bidang_usaha, h.nm_kategori "
    			+ "from usaha_profile a "
    			+ "left join usaha_detail c on a.id_usaha=c.id_usaha "
    			+ "left join ref_role d on a.id_role = d.id_role "
    			+ "left join ref_province e on d.id_prov = e.id_prov "
    			+ "left join ref_skala_usaha f on a.id_skala_usaha = f.id "
    			+ "left join ref_bidang_usaha g on a.id_bidang_usaha = g.id "
    			+ "left join ref_kat_usaha h on a.id_kat_usaha = h.id "
                + "left join ref_role b on b.id_role = a.id_role where 1=1 "+prov+" "+role;
        System.out.println(sql);
    	Query query = em.createNativeQuery(sql);
    	List list = query.getResultList();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content",list);
        return hasil;
    }
    
    @GetMapping("admin/list-corporation-profil")
    public @ResponseBody Map<String, Object> nsaProfilList() {
        List<Usahaprofile> list = nsaProfilrService.findAll();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content",list);
        return hasil;
    }
    
    @GetMapping("admin/listcorporation/{id_prov}")
    public @ResponseBody Map<String, Object> listnsa(@PathVariable("id_prov") String idprov) {
    	String sql  = "select a.id_role as idrole, b.*, c.nm_org, c.usaha_type, c.web_url, c.head_office, "
    			+ "c.name_pic, c.pos_pic, c.email_pic, c.hp_pic from ref_role a left join "
    			+ "usaha_profile b on b.id_role = a.id_role left join "
    			+ "usaha_detail c on c.id_role = a.id_role "
    			+ "where a.cat_role = 'CORPORATION' and a.id_prov = :id_prov and b.nm_usaha is not null  and c.nm_org is not null "
    			+ "order by a.id_role asc";
	    Query query = em.createNativeQuery(sql);
	    query.setParameter("id_prov", idprov);
	    List list   = query.getResultList();
	    Map<String, Object> hasil = new HashMap<>();
	    hasil.put("content",list);
	    return hasil;
	}
    
    @GetMapping("admin/listcorporationbyid/{id_role}")
    public @ResponseBody Map<String, Object> listnsabyid(@PathVariable("id_role") int idrole) {
    	String sql  = "select a.*, b.nm_org, b.usaha_type, b.web_url, b.head_office, b.name_pic, b.pos_pic, b.email_pic, b.hp_pic "
    			+ "from usaha_profile a left join usaha_detail b on b.id_role = a.id_role "
    			+ "where a.id_role = :id_role and a.nm_usaha is not null and b.nm_org is not null";
	    Query query = em.createNativeQuery(sql);
	    query.setParameter("id_role", idrole);
	    List list   = query.getResultList();
	    Map<String, Object> hasil = new HashMap<>();
	    hasil.put("content",list);
	    return hasil;
	}
    
    @GetMapping("admin/list-get-option-role-corporation-profil/{id}")
    public @ResponseBody Map<String, Object> getOptionNsaProfilList(@PathVariable("id") String id) {
        String id_prov = id.equals("all")?"":" and a.id_prov = '"+id+"' ";
        String sql  = "select * from ref_role as a where cat_role = 'CORPORATION' "+id_prov;
        Query query = em.createNativeQuery(sql);
        List list   = query.getResultList();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content",list);
        return hasil;
    }
    
    @GetMapping("admin/getallcorporation")
    public @ResponseBody List<Object> getallnsa() {
    	String sql  = "select a.id_role as idrl, b.* from ref_role a left join "
    			+ "usaha_profile b on b.id_role = a.id_role where a.cat_role = 'CORPORATION' order by a.id_role asc";
        Query query = em.createNativeQuery(sql);
        List list   = query.getResultList();
        return list;
    }
    
    @GetMapping("admin/list-corporation-profil-detail")
    public @ResponseBody Map<String, Object> nsaProfilListDetail() {
        List<Usahadetail> list = nsaDetailService.findAll();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content1",list);
        return hasil;
    }
    
    @GetMapping("admin/corporation/getrefSkalaUsaha")
    public @ResponseBody Map<String, Object> getSkalaUsaha(HttpSession session) {
    	List<RefSkalaUsaha> listSkalaUsaha;
        listSkalaUsaha = nsaProfilrService.findAllSkalaUsaha();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content", listSkalaUsaha);
        return hasil;
    }
    
    @GetMapping("admin/corporation/getrefBidangUsaha")
    public @ResponseBody Map<String, Object> getBidangUsaha(HttpSession session) {
    	List<RefBidangUsaha> listBidangUsaha;
        listBidangUsaha = nsaProfilrService.findAllBidangUsaha();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content", listBidangUsaha);
        return hasil;
    }
    
    @GetMapping("admin/corporation/getrefKatUsaha")
    public @ResponseBody Map<String, Object> getKatUsaha(HttpSession session) {
    	List<RefKatUsaha> listKatUsaha;
        listKatUsaha = nsaProfilrService.findAllKatUsaha();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content", listKatUsaha);
        return hasil;
    }
    
    @GetMapping("admin/corporation/getrefKodeUsaha")
    public @ResponseBody Map<String, Object> getKodeUsaha(HttpSession session) {
    	List<RefKodeUsaha> listKodeUsaha;
        listKodeUsaha = nsaProfilrService.findAllKodeUsaha();
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content", listKodeUsaha);
        return hasil;
    }
    
    @GetMapping("admin/corporation/getrefNamaKodeUsaha/{kode_usaha}")
    public @ResponseBody Map<String, Object> getrefNamaKodeUsaha(HttpSession session, @PathVariable("kode_usaha") String kode_usaha) {
        List<RefKodeUsaha> listKodeUsaha = nsaProfilrService.findNamaKodeUsahaByKode(kode_usaha);
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content", listKodeUsaha);
        return hasil;
    }
    
    @PostMapping(path = "admin/save-corporation-profil", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Map<String, Object> saveNsaProfil(@RequestBody Usahaprofile nsaprofil) {
        nsaProfilrService.saveNsaProfil(nsaprofil);
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("v_id_nsa",nsaprofil.getId_usaha());
        return hasil;
    }
    
    @PostMapping(path = "admin/save-corporation-detail", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public void saveNsaDetail(@RequestBody Usahadetail nsadetil) {
        nsaDetailService.saveNsaDetail(nsadetil);
    }
    
    @GetMapping("admin/get-id-corporation-detail/{id_usaha}")
    public @ResponseBody Map<String, Object> getNsaDetail(@PathVariable("id_usaha") String id_usaha) {
        List<Usahadetail> list = nsaDetailService.findId(id_usaha);
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content",list);
        return hasil;
    }
    
    @GetMapping("admin/get-id-corporation-detail1/{id_usaha}")
    public @ResponseBody Map<String, Object> getNsaDetail1(@PathVariable("id_usaha") String id_usaha) {
        List<Usahadetail> list = nsaDetailService.findIdNsa(id_usaha);
        Map<String, Object> hasil = new HashMap<>();
        hasil.put("content",list);
        return hasil;
    }
    
    @DeleteMapping("admin/delete-corporation-profil/{id}")
    @ResponseBody
    public void deletensa(@PathVariable("id") Integer id) {
        nsaDetailService.deleteIdNsa(id);
        nsaProfilrService.deleteNsaProfil(id);
    }
    
    //========================== Export to Excell ========================
    @GetMapping("admin/corporation/download_profil/{id_prov}/{id_role}")
    @ResponseBody
    public void download_profil(HttpServletResponse response, @PathVariable("id_prov") String idprov, 
    		@PathVariable("id_role") int idrole) throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=Corporation_Profile-"+idrole+".xlsx");
        ByteArrayInputStream stream = exprofil(idprov, idrole);
        IOUtils.copy(stream, response.getOutputStream());
    }
    
    private ByteArrayInputStream exprofil(String idprov, int idrole) {
		try(Workbook workbook = new XSSFWorkbook()) {
			Sheet sheet = workbook.createSheet("Profile");
			
			Row row = sheet.createRow(3);
	        CellStyle headerCellStyle = workbook.createCellStyle();
	        headerCellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
	        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
	        headerCellStyle.setWrapText(true);
	        // Creating header
	        Cell cell = row.createCell(0);
	        cell.setCellValue("No.");
	        cell.setCellStyle(headerCellStyle);
	        
	        cell = row.createCell(1);
	        cell.setCellValue("Nama Organisasi");
	        cell.setCellStyle(headerCellStyle);
	
	        cell = row.createCell(2);
	        cell.setCellValue("Institusi");
	        cell.setCellStyle(headerCellStyle);
	
	        cell = row.createCell(3);
	        cell.setCellValue("Atribut");
	        cell.setCellStyle(headerCellStyle);
	        
	        cell = row.createCell(4);
	        cell.setCellValue("Situs");
	        cell.setCellStyle(headerCellStyle);
	        
	        cell = row.createCell(5);
	        cell.setCellValue("Lokasi");
	        cell.setCellStyle(headerCellStyle);
	        
	        cell = row.createCell(6);
	        cell.setCellValue("Detail Perwakilan");
	        cell.setCellStyle(headerCellStyle);
	        
	        Row row2 = sheet.createRow(0);
	        CellStyle headerCellStyle2 = workbook.createCellStyle();
	        headerCellStyle2.setFillForegroundColor(IndexedColors.AQUA.getIndex());
	        headerCellStyle2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        headerCellStyle2.setAlignment(HorizontalAlignment.CENTER);
	        headerCellStyle2.setWrapText(true);
	        // Creating header
	        Cell cell2 = row2.createCell(0);
	        cell2.setCellValue("No.");
	        cell2.setCellStyle(headerCellStyle);
	        
	        cell2 = row2.createCell(1);
	        cell2.setCellValue("Pencapaian");
	        cell2.setCellStyle(headerCellStyle);
	
	        cell2 = row2.createCell(2);
	        cell2.setCellValue("Lokasi");
	        cell2.setCellStyle(headerCellStyle);
	
	        cell2 = row2.createCell(3);
	        cell2.setCellValue("Penerima Manfaat");
	        cell2.setCellStyle(headerCellStyle);
	        
	        cell2 = row2.createCell(4);
	        cell2.setCellValue("Tahun Implementasi");
	        cell2.setCellStyle(headerCellStyle);
	        
	        cell2 = row2.createCell(5);
	        cell2.setCellValue("Partner");
	        cell2.setCellStyle(headerCellStyle);
	        
	        //=================== Isi tabel atas =================
	        
	        String sql = "SELECT a.nm_usaha, a.loc_usaha, b.web_url, b.name_pic FROM usaha_profile a LEFT JOIN "
	          		+ "usaha_detail b ON b.id_usaha = a.id_usaha "
	          		+ "WHERE a.id_role = :id_role";
	        Query query = em.createNativeQuery(sql);
	        query.setParameter("id_role", idrole);
	        Map<String, Object> mapDetail = new HashMap<>();
	        mapDetail.put("mapDetail",query.getResultList());
	        JSONObject objDetail = new JSONObject(mapDetail);
	        JSONArray  arrayDetail = objDetail.getJSONArray("mapDetail");
	        JSONArray  finalDetail = arrayDetail.getJSONArray(0);
	        
	    	Row dataRow = sheet.createRow(4);
	    	dataRow.createCell(0).setCellValue("1.");
	    	dataRow.createCell(1).setCellValue(finalDetail.getString(0));
	    	dataRow.createCell(2).setCellValue("Civil Society Organization/Organisasi Kepemudaan/Komunitas");
	    	dataRow.createCell(3).setCellValue("");
	    	dataRow.createCell(4).setCellValue(finalDetail.getString(2));
	    	dataRow.createCell(5).setCellValue(finalDetail.getString(1));
	    	dataRow.createCell(6).setCellValue(finalDetail.getString(3));
	        
	    	//================ Data table ke 2 =================
	        String sql2 = "SELECT a.achieve_usaha, a.loc_usaha, a.beneficiaries, a.year_impl, a.major_part "
	        		+ "FROM usaha_profile a WHERE id_role = :id_role";
	        Query query2 = em.createNativeQuery(sql2);
	        query2.setParameter("id_role", idrole);
	        Map<String, Object> mapDetail2 = new HashMap<>();
	        mapDetail2.put("mapDetail2",query2.getResultList());
	        JSONObject objDetail2 = new JSONObject(mapDetail2);
	        JSONArray  arrayDetail2 = objDetail2.getJSONArray("mapDetail2");
	        JSONArray  finalDetail2 = arrayDetail2.getJSONArray(0);
	        
	        Row dataRow2 = sheet.createRow(1);
	    	dataRow2.createCell(0).setCellValue("1.");
	    	dataRow2.createCell(1).setCellValue(finalDetail2.getString(0));
	    	dataRow2.createCell(2).setCellValue(finalDetail2.getString(1));
	    	dataRow2.createCell(3).setCellValue(finalDetail2.getString(2));
	    	dataRow2.createCell(4).setCellValue(finalDetail2.getInt(3));
	    	dataRow2.createCell(5).setCellValue(finalDetail2.getString(4));
	
	        sheet.autoSizeColumn(0);
	        sheet.autoSizeColumn(1);
	        sheet.autoSizeColumn(2);
	        sheet.autoSizeColumn(3);
	        sheet.autoSizeColumn(4);
	        sheet.autoSizeColumn(5);
	        sheet.autoSizeColumn(6);
	        
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        workbook.write(outputStream);
	        return new ByteArrayInputStream(outputStream.toByteArray());
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
    }
}
