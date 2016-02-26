package com.fantastic4.nitiaayog.nitiayog.model;

/**
 * Created by admin-17 on 26/2/16.
 */
public class NGO {
    String nameofNGO;
    String state;
    String district;
    String address;
    String sector;

    public String getNameofNGO() {
        return nameofNGO;
    }

    public void setNameofNGO(String nameofNGO) {
        this.nameofNGO = nameofNGO;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getChief_person() {
        return Chief_person;
    }

    public void setChief_person(String chief_person) {
        Chief_person = chief_person;
    }

    public String getContact_num() {
        return contact_num;
    }

    public void setContact_num(String contact_num) {
        this.contact_num = contact_num;
    }

    String Chief_person;
    String contact_num;
}
