package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ref_pemda")
public class RefPemda implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id_pemda;
    
    @Column
    private Integer kd_satker;
    
    @Column
    private Integer kd_prov;
    
    @Column
    private Integer kd_pemda;
    
    @Column
    private String nm_pemda;
    
    @Column
    private String kd_sikd;
    
    @Column
    private String kd_bps;
    
    @Column
    private String debitur;

    public RefPemda() {
    }

	public RefPemda(Integer id_pemda, Integer kd_satker, Integer kd_prov, Integer kd_pemda, String nm_pemda,
			String kd_sikd, String kd_bps, String debitur) {
		super();
		this.id_pemda = id_pemda;
		this.kd_satker = kd_satker;
		this.kd_prov = kd_prov;
		this.kd_pemda = kd_pemda;
		this.nm_pemda = nm_pemda;
		this.kd_sikd = kd_sikd;
		this.kd_bps = kd_bps;
		this.debitur = debitur;
	}

	public Integer getId_pemda() {
		return id_pemda;
	}

	public void setId_pemda(Integer id_pemda) {
		this.id_pemda = id_pemda;
	}

	public Integer getKd_satker() {
		return kd_satker;
	}

	public void setKd_satker(Integer kd_satker) {
		this.kd_satker = kd_satker;
	}

	public Integer getKd_prov() {
		return kd_prov;
	}

	public void setKd_prov(Integer kd_prov) {
		this.kd_prov = kd_prov;
	}

	public Integer getKd_pemda() {
		return kd_pemda;
	}

	public void setKd_pemda(Integer kd_pemda) {
		this.kd_pemda = kd_pemda;
	}

	public String getNm_pemda() {
		return nm_pemda;
	}

	public void setNm_pemda(String nm_pemda) {
		this.nm_pemda = nm_pemda;
	}

	public String getKd_sikd() {
		return kd_sikd;
	}

	public void setKd_sikd(String kd_sikd) {
		this.kd_sikd = kd_sikd;
	}

	public String getKd_bps() {
		return kd_bps;
	}

	public void setKd_bps(String kd_bps) {
		this.kd_bps = kd_bps;
	}

	public String getDebitur() {
		return debitur;
	}

	public void setDebitur(String debitur) {
		this.debitur = debitur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
