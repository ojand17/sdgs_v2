package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
import javax.validation.constraints.Digits;

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

	@Digits(integer = 25, fraction=4)
    @Column
    private BigDecimal value;

	@Digits(integer = 25, fraction=4)
    @Column
    private BigDecimal new_value;

	public UsahaTarget() {
	}

	public UsahaTarget(Integer id, Integer id_usaha_indicator, Integer id_role, Integer year, BigDecimal value, BigDecimal new_value) {
		super();
		this.id = id;
		this.id_usaha_indicator = id_usaha_indicator;
		this.id_role = id_role;
		this.year = year;
		this.value = value;
		this.new_value = new_value;
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

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getNew_value() {
		return new_value;
	}

	public void setNew_value(BigDecimal new_value) {
		this.new_value = new_value;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
