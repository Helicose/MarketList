package com.example.marketlist.model;

public class Market {

    private int id;
    private String mName;
    private String mAdress;
    private String mPhone;
    private String mCountry;

    public Market(int id, String name, String adress, String phone, String country){
        setId(id);
        setName(name);
        setAdress(adress);
        setPhone(phone);
        setCountry(country);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public  String getAdress() {
        return mAdress;
    }

    public void setAdress(String adress) {
        mAdress = adress;
    }

    public  String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public  String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }
}
