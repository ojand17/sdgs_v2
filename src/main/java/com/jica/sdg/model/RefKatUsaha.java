package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ref_kat_usaha")
public class RefKatUsaha implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column
    private String nm_kategori;

    public RefKatUsaha() {
    }

    public RefKatUsaha(Integer id, String nm_kategori) {
            super();
            this.id = id;
            this.nm_kategori = nm_kategori;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm_kategori() {
        return nm_kategori;
    }

    public void setNm_kategori(String nm_kategori) {
        this.nm_kategori = nm_kategori;
    }

    

}
