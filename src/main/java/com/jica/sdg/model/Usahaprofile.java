package com.jica.sdg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "usaha_profile")
public class Usahaprofile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private Integer id_usaha;
    @Column(name = "id_role")
    private Integer id_role;
    @Column(name = "nm_usaha")
    private String nm_usaha;
    @Column(name = "achieve_usaha")
    private String achieve_usaha;
    @Column(name = "loc_usaha")
    private String loc_usaha;
    @Column(name = "beneficiaries")
    private String beneficiaries;
    @Column(name = "year_impl")
    private Integer year_impl;
    @Column(name = "major_part")
    private String major_part;
    
    @Column(name = "no_telp")
    private String no_telp;
    @Column(name = "website")
    private String website;
    
    @Column(name = "id_skala_usaha")
    private Integer id_skala_usaha;
    
    @Column(name = "id_bidang_usaha")
    private Integer id_bidang_usaha;
    @Column(name = "id_kat_usaha")
    private Integer id_kat_usaha;
    @Column(name = "id_badan_hukum")
    private Integer id_badan_hukum;
    
    @Column(name = "kode_usaha")
    private String kode_usaha;
    @Column(name = "nama_perusahaan")
    private String nama_perusahaan;

    public Usahaprofile() {
    }

    public Usahaprofile(Integer id_usaha, Integer id_role, String nm_usaha, String achieve_usaha, String loc_usaha, String beneficiaries, Integer year_impl, String major_part) {
        this.id_usaha         = id_usaha;
        this.id_role        = id_role;
        this.nm_usaha         = nm_usaha;
        this.achieve_usaha    = achieve_usaha;
        this.loc_usaha        = loc_usaha;
        this.beneficiaries  = beneficiaries;
        this.year_impl      = year_impl;
        this.major_part     = major_part;
    }

    public Usahaprofile(Integer id_usaha, Integer id_role, String nm_usaha, String achieve_usaha, String loc_usaha, String beneficiaries, Integer year_impl, String major_part,
                        String no_telp, String website, Integer id_skala_usaha, Integer id_bidang_usaha, Integer id_kat_usaha, String kode_usaha, String nama_perusahaan, Integer id_badan_hukum) {
        this.id_usaha         = id_usaha;
        this.id_role        = id_role;
        this.nm_usaha         = nm_usaha;
        this.achieve_usaha    = achieve_usaha;
        this.loc_usaha        = loc_usaha;
        this.beneficiaries  = beneficiaries;
        this.year_impl      = year_impl;
        this.major_part     = major_part;
        
        this.no_telp     = no_telp;
        this.website     = website;
        this.id_skala_usaha     = id_skala_usaha;
        this.id_bidang_usaha     = id_bidang_usaha;
        this.id_kat_usaha     = id_kat_usaha;
        this.kode_usaha     = kode_usaha;
        this.nama_perusahaan     = nama_perusahaan;
        this.id_badan_hukum     = id_badan_hukum;
    }

    public Integer getId_badan_hukum() {
        return id_badan_hukum;
    }

    public void setId_badan_hukum(Integer id_badan_hukum) {
        this.id_badan_hukum = id_badan_hukum;
    }

    
    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getId_skala_usaha() {
        return id_skala_usaha;
    }

    public void setId_skala_usaha(Integer id_skala_usaha) {
        this.id_skala_usaha = id_skala_usaha;
    }

    public Integer getId_bidang_usaha() {
        return id_bidang_usaha;
    }

    public void setId_bidang_usaha(Integer id_bidang_usaha) {
        this.id_bidang_usaha = id_bidang_usaha;
    }

    public Integer getId_kat_usaha() {
        return id_kat_usaha;
    }

    public void setId_kat_usaha(Integer id_kat_usaha) {
        this.id_kat_usaha = id_kat_usaha;
    }

    public String getKode_usaha() {
        return kode_usaha;
    }

    public void setKode_usaha(String kode_usaha) {
        this.kode_usaha = kode_usaha;
    }

    public String getNama_perusahaan() {
        return nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
    }
    
    

    public Integer getId_usaha() {
        return id_usaha;
    }

    public void setId_usaha(Integer id_usaha) {
        this.id_usaha = id_usaha;
    }

    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
    }

    public String getNm_usaha() {
        return nm_usaha;
    }

    public void setNm_usaha(String nm_usaha) {
        this.nm_usaha = nm_usaha;
    }

    public String getAchieve_usaha() {
        return achieve_usaha;
    }

    public void setAchieve_usaha(String achieve_usaha) {
        this.achieve_usaha = achieve_usaha;
    }

    public String getLoc_usaha() {
        return loc_usaha;
    }

    public void setLoc_usaha(String loc_usaha) {
        this.loc_usaha = loc_usaha;
    }

    public String getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(String beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public Integer getYear_impl() {
        return year_impl;
    }

    public void setYear_impl(Integer year_impl) {
        this.year_impl = year_impl;
    }

    public String getMajor_part() {
        return major_part;
    }

    public void setMajor_part(String major_part) {
        this.major_part = major_part;
    }

    
    
    
}
