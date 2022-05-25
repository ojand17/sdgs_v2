package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usaha_funding")
public class UsahaFunding implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private Integer id;
    
    @Column(nullable = false, length = 11)
    private Integer id_usaha_indicator;
    
    @Column(nullable = false, length = 11)
    private Integer id_monper;
    
    @Column(nullable = false, length = 250)
    private String baseline;
    
    @Column(nullable = false, length = 250)
    private String funding_source;

	public UsahaFunding() {
	}

	public UsahaFunding(Integer id, Integer id_usaha_indicator, Integer id_monper, String baseline, String funding_source) {
		super();
		this.id = id;
		this.id_usaha_indicator = id_usaha_indicator;
		this.id_monper = id_monper;
		this.baseline = baseline;
		this.funding_source = funding_source;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public Integer getId_usaha_indicator() {
        return id_usaha_indicator;
    }

    public void setId_usaha_indicator(Integer id_usaha_indicator) {
        this.id_usaha_indicator = id_usaha_indicator;
    }

	

	public Integer getId_monper() {
		return id_monper;
	}

	public void setId_monper(Integer id_monper) {
		this.id_monper = id_monper;
	}

	public String getBaseline() {
		return baseline;
	}

	public void setBaseline(String baseline) {
		this.baseline = baseline;
	}

	public String getFunding_source() {
		return funding_source;
	}

	public void setFunding_source(String funding_source) {
		this.funding_source = funding_source;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
