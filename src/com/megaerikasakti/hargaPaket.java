/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaerikasakti;

/**
 *
 * @author user
 */
public class hargaPaket {
    
    private double reguler;
    private double kilat;
    private double sds;
    private double ons;
    private double hds;
    private String kotatujuan;

    public hargaPaket() {
    }

    public hargaPaket(double reguler, double kilat, double sds, double ons, double hds, String kotatujuan) {
        this.reguler = reguler;
        this.kilat = kilat;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
        this.kotatujuan = kotatujuan;
    }

    /**
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the kilat
     */
    public double getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(double kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    /**
     * @return the kotatujuan
     */
    public String getKotatujuan() {
        return kotatujuan;
    }

    /**
     * @param kotatujuan the kotatujuan to set
     */
    public void setKotatujuan(String kotatujuan) {
        this.kotatujuan = kotatujuan;
    }
    
}
