package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ref_badan_hukum")
public class RefBadanHukum implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column
    private String nm_badan_hukum;

    public RefBadanHukum() {
    }

    public RefBadanHukum(Integer id, String nm_badan_hukum) {
            super();
            this.id = id;
            this.nm_badan_hukum = nm_badan_hukum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm_badan_hukum() {
        return nm_badan_hukum;
    }

    public void setNm_badan_hukum(String nm_badan_hukum) {
        this.nm_badan_hukum = nm_badan_hukum;
    }

    
    

}
