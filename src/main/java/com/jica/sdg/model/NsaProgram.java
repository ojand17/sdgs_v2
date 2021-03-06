package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "nsa_program")
public class NsaProgram implements Serializable {
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
    
    @Column(nullable = true)
    private BigInteger budget_allocation;

	public NsaProgram() {
	}

	public NsaProgram(Integer id, String id_program, String nm_program, String nm_program_eng, Integer id_role,
			Integer id_monper, String rel_prog_id, Integer created_by, Date date_created, Integer internal_code, BigInteger budget_allocation) {
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
		this.budget_allocation = budget_allocation;
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

	public BigInteger getBudget_allocation() {
		return budget_allocation;
	}

	public void setBudget_allocation(BigInteger budget_allocation) {
		this.budget_allocation = budget_allocation;
	}
}
