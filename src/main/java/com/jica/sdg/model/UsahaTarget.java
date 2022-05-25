package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usaha_target")
public class UsahaTarget implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private Integer id;
    
    @Column(nullable = false, length = 11)
    private Integer id_usaha_indicator;
    
    @Column(nullable = false, length = 4)
    private Integer id_role;
    
    @Column(nullable = false, length = 4)
    private Integer year;
    
    @Column(nullable = false, length = 11)
    private Integer value;

	public UsahaTarget() {
	}

	public UsahaTarget(Integer id, Integer id_usaha_indicator, Integer id_role, Integer year, Integer value) {
		super();
		this.id = id;
		this.id_usaha_indicator = id_usaha_indicator;
		this.id_role = id_role;
		this.year = year;
		this.value = value;
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

	

	public Integer getId_role() {
		return id_role;
	}

	public void setId_role(Integer id_role) {
		this.id_role = id_role;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
