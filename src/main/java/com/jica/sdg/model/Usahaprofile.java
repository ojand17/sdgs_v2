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
