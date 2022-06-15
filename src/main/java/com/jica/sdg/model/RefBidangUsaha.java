package com.jica.sdg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ref_bidang_usaha")
public class RefBidangUsaha implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column
    private String nm_bidang_usaha;

    public RefBidangUsaha() {
    }

    public RefBidangUsaha(Integer id, String nm_bidang_usaha) {
            super();
            this.id = id;
            this.nm_bidang_usaha = nm_bidang_usaha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm_bidang_usaha() {
        return nm_bidang_usaha;
    }

    public void setNm_bidang_usaha(String nm_bidang_usaha) {
        this.nm_bidang_usaha = nm_bidang_usaha;
    }

    
    
    

}
