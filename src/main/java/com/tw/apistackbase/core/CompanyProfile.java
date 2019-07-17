package com.tw.apistackbase.core;

import javax.persistence.*;

@Entity
@Table
public class CompanyProfile {

    @Id
    private Long id;

    private String certId;

    private Long registeredCapital;

    public CompanyProfile() {

    }

    public Long getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Long registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }
}
