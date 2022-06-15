package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ref_skala_usaha")
public class RefSkalaUsaha implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column
    private String nm_skala_usaha;

    public RefSkalaUsaha() {
    }

    public RefSkalaUsaha(Integer id, String nm_skala_usaha) {
            super();
            this.id = id;
            this.nm_skala_usaha = nm_skala_usaha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm_skala_usaha() {
        return nm_skala_usaha;
    }

    public void setNm_skala_usaha(String nm_skala_usaha) {
        this.nm_skala_usaha = nm_skala_usaha;
    }

    

}
