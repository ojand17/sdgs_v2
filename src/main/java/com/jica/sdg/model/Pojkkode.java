package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pojk_kode")
public class Pojkkode implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    
    @Column
    private Integer idkategori;
    
    @Column
    private Integer id_indicator;
    
    @Column
    private String kode;
    
    @Column
    private String uraian;
    
    @Column
    private String indicator_capaian;
    
    @Column
    private String unit;

    public Pojkkode() {
    }

    public Pojkkode(Integer id, Integer idkategori, Integer id_indicator, String kode, String uraian,
            String indicator_capaian, String unit) {
            super();
            this.id = id;
            this.idkategori = idkategori;
            this.id_indicator = id_indicator;
            this.kode = kode;
            this.uraian = uraian;
            this.indicator_capaian = indicator_capaian;
            this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Integer getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(Integer idkategori) {
        this.idkategori = idkategori;
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

    

}
