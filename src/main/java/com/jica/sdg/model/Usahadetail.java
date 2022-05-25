package com.jica.sdg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "usaha_detail")
public class Usahadetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private Integer id;
    @Column(name = "id_role")
    private Integer id_role;
    @Column(name = "id_usaha")
    private String id_usaha;
    @Column(name = "nm_org")
    private String nm_org;
    @Column(name = "usaha_type")
    private String usaha_type;
    @Column(name = "file_logo")
    private String file_logo;
    @Column(name = "web_url")
    private String web_url;
    @Column(name = "head_office")
    private String head_office;
    @Column(name = "name_pic")
    private String name_pic;
    @Column(name = "pos_pic")
    private String pos_pic;
    @Column(name = "email_pic")
    private String email_pic;
    @Column(name = "hp_pic")
    private String hp_pic;

    public Usahadetail() {
    }

    public Usahadetail(Integer id, Integer id_role, String id_usaha, String nm_org, String usaha_type, String file_logo, String web_url, String head_office, String name_pic, String pos_pic, String email_pic, String hp_pic) {
        this.id             = id;
        this.id_role        = id_role;
        this.id_usaha         = id_usaha;
        this.nm_org         = nm_org;
        this.usaha_type       = usaha_type;
        this.file_logo      = file_logo;
        this.file_logo      = web_url;
        this.file_logo      = head_office;
        this.file_logo      = name_pic;
        this.pos_pic        = pos_pic;
        this.email_pic      = email_pic;
        this.hp_pic         = hp_pic;
    }

    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    

    public String getNm_org() {
        return nm_org;
    }

    public void setNm_org(String nm_org) {
        this.nm_org = nm_org;
    }

    public String getId_usaha() {
        return id_usaha;
    }

    public void setId_usaha(String id_usaha) {
        this.id_usaha = id_usaha;
    }

    public String getUsaha_type() {
        return usaha_type;
    }

    public void setUsaha_type(String usaha_type) {
        this.usaha_type = usaha_type;
    }

    

    public String getFile_logo() {
        return file_logo;
    }

    public void setFile_logo(String file_logo) {
        this.file_logo = file_logo;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public String getHead_office() {
        return head_office;
    }

    public void setHead_office(String head_office) {
        this.head_office = head_office;
    }

    public String getName_pic() {
        return name_pic;
    }

    public void setName_pic(String name_pic) {
        this.name_pic = name_pic;
    }

    public String getPos_pic() {
        return pos_pic;
    }

    public void setPos_pic(String pos_pic) {
        this.pos_pic = pos_pic;
    }

    public String getEmail_pic() {
        return email_pic;
    }

    public void setEmail_pic(String email_pic) {
        this.email_pic = email_pic;
    }

    public String getHp_pic() {
        return hp_pic;
    }

    public void setHp_pic(String hp_pic) {
        this.hp_pic = hp_pic;
    }

    
    
}
