package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;

@Entity
@Table(name = "usaha_program")
public class UsahaProgram implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private Integer id;
    
    @Column(nullable = false, length = 10)
    private String id_program;
    
    @Column(nullable = true)
    private String nm_program;
    
    @Column(nullable = true)
    private String nm_program_eng;
    
    @Column(nullable = false, length = 4)
    private Integer id_role;
    
    @Column(nullable = false, length = 11)
    private Integer id_monper;
    
    @Column(nullable = true, length = 10)
    private String rel_prog_id;
    
    @Column(nullable = false, length = 6)
    private Integer created_by;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date_created;
    
    @Column(nullable = true, length = 11)
    private Integer internal_code;
    
    @Column(nullable = false, length = 11)
    private Integer idkategori;
    
    @Column(nullable = false, length = 11)
    private Integer idpojk;
    
    @Column(nullable = false, length = 11)
    private Integer id_indicator;
    
    @Column(nullable = true, length = 255)
    private String kode;
    
    @Column(nullable = true, length = 255)
    private String uraian;
    
    @Column(nullable = true, length = 255)
    private String indicator_capaian;
    
    @Column(nullable = true, length = 255)
    private String unit;
    
    @Column(nullable = true, length = 500)
    private String kd_bps;

    @Column(nullable = true, length = 500)
    private String keterangan_lokasi;
    
    @Column(nullable = true)
    private BigInteger budget_allocation;

    @Column(nullable = true)
    private BigInteger new_budget_allocation;

    @Column(nullable = true, length = 800)
    private String target_jangka_panjang;
    
    @Column(nullable = false, length = 11)
    private Integer target1;
    
    @Column(nullable = false, length = 11)
    private Integer target2;
    
    @Column(nullable = false, length = 11)
    private Integer target3;
    
    @Column(nullable = false, length = 11)
    private Integer target4;
    
    @Column(nullable = false, length = 11)
    private Integer target5;
    
    @Column(nullable = true, length = 10)
    private String jangka_waktu;

    @Column(nullable = true, length = 500)
    private String tahun_jangka_panjang;

    @Column(nullable = true, length = 500)
    private String target_tahun_jangka_panjang;

    @Column(nullable = true, length = 500)
    private String lembaga_pelaksana;
    
    

	public UsahaProgram() {
	}

	public UsahaProgram(Integer id, String id_program, String nm_program, String nm_program_eng, Integer id_role,
			Integer id_monper, String rel_prog_id, Integer created_by, Date date_created, Integer internal_code) {
		super();
		this.id = id;
		this.id_program = id_program;
		this.nm_program = nm_program;
		this.nm_program_eng = nm_program_eng;
		this.id_role = id_role;
		this.id_monper = id_monper;
		this.rel_prog_id = rel_prog_id;
		this.created_by = created_by;
		this.date_created = date_created;
		this.internal_code = internal_code;
	}

	public UsahaProgram(Integer id, String id_program, String nm_program, String nm_program_eng, Integer id_role,
			Integer id_monper, String rel_prog_id, Integer created_by, Date date_created, Integer internal_code,
                        Integer idkategori, Integer idpojk, Integer id_indicator, String kode, String uraian,
                        String indicator_capaian, String unit, String kd_bps, BigInteger budget_allocation, BigInteger new_budget_allocation,
                        Integer target1, Integer target2, Integer target3, Integer target4, Integer target5, String keterangan_lokasi, String target_jangka_panjang, String tahun_jangka_panjang, String target_tahun_jangka_panjang, String lembaga_pelaksana) {
		super();
		this.id = id;
		this.id_program = id_program;
		this.nm_program = nm_program;
		this.nm_program_eng = nm_program_eng;
		this.id_role = id_role;
		this.id_monper = id_monper;
		this.rel_prog_id = rel_prog_id;
		this.created_by = created_by;
		this.date_created = date_created;
		this.internal_code = internal_code;
		this.idkategori = idkategori;
		this.idpojk = idpojk;
		this.id_indicator = id_indicator;
		this.kode = kode;
		this.uraian = uraian;
		this.indicator_capaian = indicator_capaian;
		this.unit = unit;
		this.kd_bps = kd_bps;
		this.budget_allocation = budget_allocation;
		this.new_budget_allocation = new_budget_allocation;
		this.target1 = target1;
		this.target2 = target2;
		this.target3 = target3;
		this.target4 = target4;
		this.target5 = target5;
		this.keterangan_lokasi = keterangan_lokasi;
		this.target_jangka_panjang = target_jangka_panjang;
		this.tahun_jangka_panjang = tahun_jangka_panjang;
		this.target_tahun_jangka_panjang = target_tahun_jangka_panjang;
		this.lembaga_pelaksana = lembaga_pelaksana;
	}
        
	public UsahaProgram(Integer id, String id_program, String nm_program, String nm_program_eng, Integer id_role,
			Integer id_monper, String rel_prog_id, Integer created_by, Date date_created, Integer internal_code,
                        Integer idkategori, Integer idpojk, Integer id_indicator, String kode, String uraian,
                        String indicator_capaian, String unit, String kd_bps, BigInteger budget_allocation, BigInteger new_budget_allocation,
                        Integer target1, Integer target2, Integer target3, Integer target4, Integer target5, String jangka_waktu, String keterangan_lokasi, String target_jangka_panjang, String tahun_jangka_panjang, String target_tahun_jangka_panjang, String lembaga_pelaksana) {
		super();
		this.id = id;
		this.id_program = id_program;
		this.nm_program = nm_program;
		this.nm_program_eng = nm_program_eng;
		this.id_role = id_role;
		this.id_monper = id_monper;
		this.rel_prog_id = rel_prog_id;
		this.created_by = created_by;
		this.date_created = date_created;
		this.internal_code = internal_code;
		this.idkategori = idkategori;
		this.idpojk = idpojk;
		this.id_indicator = id_indicator;
		this.kode = kode;
		this.uraian = uraian;
		this.indicator_capaian = indicator_capaian;
		this.unit = unit;
		this.kd_bps = kd_bps;
		this.budget_allocation = budget_allocation;
		this.new_budget_allocation = new_budget_allocation;
		this.target1 = target1;
		this.target2 = target2;
		this.target3 = target3;
		this.target4 = target4;
		this.target5 = target5;
		this.jangka_waktu = jangka_waktu;
		this.keterangan_lokasi = keterangan_lokasi;
		this.target_jangka_panjang = target_jangka_panjang;
		this.tahun_jangka_panjang = tahun_jangka_panjang;
		this.target_tahun_jangka_panjang = target_tahun_jangka_panjang;
		this.lembaga_pelaksana = lembaga_pelaksana;
	}


    public String getTarget_jangka_panjang() {
        return this.target_jangka_panjang;
    }

    public void setTarget_jangka_panjang(String target_jangka_panjang) {
        this.target_jangka_panjang = target_jangka_panjang;
    }
    

    public String getTahun_jangka_panjang() {
        return tahun_jangka_panjang;
    }

    public void setTahun_jangka_panjang(String tahun_jangka_panjang) {
        this.tahun_jangka_panjang = tahun_jangka_panjang;
    }

    public String getTarget_tahun_jangka_panjang() {
        return target_tahun_jangka_panjang;
    }

    public void setTarget_tahun_jangka_panjang(String target_tahun_jangka_panjang) {
        this.target_tahun_jangka_panjang = target_tahun_jangka_panjang;
    }

    public String getLembaga_pelaksana() {
        return lembaga_pelaksana;
    }

    public void setLembaga_pelaksana(String lembaga_pelaksana) {
        this.lembaga_pelaksana = lembaga_pelaksana;
    }




    public String getJangka_waktu() {
        return jangka_waktu;
    }

    public void setJangka_waktu(String jangka_waktu) {
        this.jangka_waktu = jangka_waktu;
    }
        
        

    public Integer getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(Integer idkategori) {
        this.idkategori = idkategori;
    }

    public Integer getIdpojk() {
        return idpojk;
    }

    public void setIdpojk(Integer idpojk) {
        this.idpojk = idpojk;
    }


    public Integer getId_indicator() {
        return id_indicator;
    }

    public void setId_indicator(Integer id_indicator) {
        this.id_indicator = id_indicator;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getUraian() {
        return uraian;
    }

    public void setUraian(String uraian) {
        this.uraian = uraian;
    }

    public String getIndicator_capaian() {
        return indicator_capaian;
    }

    public void setIndicator_capaian(String indicator_capaian) {
        this.indicator_capaian = indicator_capaian;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getKd_bps() {
        return kd_bps;
    }

    public void setKd_bps(String kd_bps) {
        this.kd_bps = kd_bps;
    }

    public String getKeterangan_lokasi() {
        return keterangan_lokasi;
    }

    public void setKeterangan_lokasi(String keterangan_lokasi) {
        this.keterangan_lokasi = keterangan_lokasi;
    }

    public BigInteger getBudget_allocation() {
        return budget_allocation;
    }

    public void setBudget_allocation(BigInteger budget_allocation) {
        this.budget_allocation = budget_allocation;
    }


    public BigInteger getNew_budget_allocation() {
        return new_budget_allocation;
    }

    public void setNew_budget_allocation(BigInteger new_budget_allocation) {
        this.new_budget_allocation = new_budget_allocation;
    }

    public Integer getTarget1() {
        return target1;
    }

    public void setTarget1(Integer target1) {
        this.target1 = target1;
    }

    public Integer getTarget2() {
        return target2;
    }

    public void setTarget2(Integer target2) {
        this.target2 = target2;
    }

    public Integer getTarget3() {
        return target3;
    }

    public void setTarget3(Integer target3) {
        this.target3 = target3;
    }

    public Integer getTarget4() {
        return target4;
    }

    public void setTarget4(Integer target4) {
        this.target4 = target4;
    }

    public Integer getTarget5() {
        return target5;
    }

    public void setTarget5(Integer target5) {
        this.target5 = target5;
    }

        
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getId_program() {
		return id_program;
	}

	public void setId_program(String id_program) {
		this.id_program = id_program;
	}

	public String getNm_program() {
		return nm_program;
	}

	public void setNm_program(String nm_program) {
		this.nm_program = nm_program;
	}

	public String getNm_program_eng() {
		return nm_program_eng;
	}

	public void setNm_program_eng(String nm_program_eng) {
		this.nm_program_eng = nm_program_eng;
	}

	public Integer getId_role() {
		return id_role;
	}

	public void setId_role(Integer id_role) {
		this.id_role = id_role;
	}

	public Integer getId_monper() {
		return id_monper;
	}

	public void setId_monper(Integer id_monper) {
		this.id_monper = id_monper;
	}

	public String getRel_prog_id() {
		return rel_prog_id;
	}

	public void setRel_prog_id(String rel_prog_id) {
		this.rel_prog_id = rel_prog_id;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Integer getInternal_code() {
		return internal_code;
	}

	public void setInternal_code(Integer internal_code) {
		this.internal_code = internal_code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
