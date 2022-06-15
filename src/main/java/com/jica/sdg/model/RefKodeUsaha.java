package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ref_kode_usaha")
public class RefKodeUsaha implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column
    private String kode_usaha;
    @Column
    private String nm_usaha;

    public RefKodeUsaha() {
    }

    public RefKodeUsaha(Integer id, String kode_usaha, String nm_usaha) {
            super();
            this.id = id;
            this.kode_usaha = kode_usaha;
            this.nm_usaha = nm_usaha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKode_usaha() {
        return kode_usaha;
    }

    public void setKode_usaha(String kode_usaha) {
        this.kode_usaha = kode_usaha;
    }

    public String getNm_usaha() {
        return nm_usaha;
    }

    public void setNm_usaha(String nm_usaha) {
        this.nm_usaha = nm_usaha;
    }

    
    

}
