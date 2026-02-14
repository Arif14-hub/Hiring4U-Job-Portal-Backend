package com.hiring4u.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class RecruiterDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String companyName;
    @Column(unique = true)
    private String email;
    private String password;

    private String HrName;
    private String HrPhone;
    private String weblink;
    private String HrLocation;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getHrName() {
        return HrName;
    }

    public void setHrName(String hrName) {
        HrName = hrName;
    }

    public String getHrPhone() {
        return HrPhone;
    }

    public void setHrPhone(String hrPhone) {
        HrPhone = hrPhone;
    }

    public String getWeblink() {
        return weblink;
    }

    public void setWeblink(String weblink) {
        this.weblink = weblink;
    }

    public String getHrLocation() {
        return HrLocation;
    }

    public void setHrLocation(String hrLocation) {
        HrLocation = hrLocation;
    }
}
