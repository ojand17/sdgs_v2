package com.jica.sdg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class Usahaprofile2 implements Serializable {

   
    private Integer id_usaha;
    private Integer id_role;
    private String nm_usaha;
    private String achieve_usaha;
    private String loc_usaha;
    private String beneficiaries;
    private Integer year_impl;
    private String major_part;
    private String id_prov;

    public Usahaprofile2() {
    }

    public Usahaprofile2(Integer id_usaha, Integer id_role, String nm_usaha, String achieve_usaha, String loc_usaha, String beneficiaries, Integer year_impl, String major_part, String id_prov) {
        this.id_usaha         = id_usaha;
        this.id_role        = id_role;
        this.nm_usaha         = nm_usaha;
        this.achieve_usaha    = achieve_usaha;
        this.loc_usaha        = loc_usaha;
        this.beneficiaries  = beneficiaries;
        this.year_impl      = year_impl;
        this.major_part     = major_part;
        this.id_prov        = id_prov;
    }
    
    public Integer getId_usaha() {
		return id_usaha;
	}

	public void setId_usaha(Integer id_usaha) {
		this.id_usaha = id_usaha;
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

    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
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

    public String getId_prov() {
        return id_prov;
    }

    public void setId_prov(String id_prov) {
        this.id_prov = id_prov;
    }
}
