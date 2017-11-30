/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaerikasakti;

public class Courier {
    private int berat;
    private String tujuan;
    private String tipepaket;
    private double hargapaket;
    private double ansuransi;
    private double hargaTipeLayanan;

    public Courier() {
    }

    public Courier(int berat, String tujuan, String tipepaket, double hargapaket, double ansuransi, double hargaTipeLayanan) {
        this.berat = berat;
        this.tujuan = tujuan;
        this.tipepaket = tipepaket;
        this.hargapaket = hargapaket;
        this.ansuransi = ansuransi;
        this.hargaTipeLayanan = hargaTipeLayanan;
    }
    

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

    /**
     * @return the tujuan
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * @param tujuan the tujuan to set
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    /**
     * @return the tipepaket
     */
    public String getTipepaket() {
        return tipepaket;
    }

    /**
     * @param tipepaket the tipepaket to set
     */
    public void setTipepaket(String tipepaket) {
        this.tipepaket = tipepaket;
    }

    /**
     * @return the hargapaket
     */
    public double getHargapaket() {
        return hargapaket;
    }

    /**
     * @param hargapaket the hargapaket to set
     */
    public void setHargapaket(double hargapaket) {
        this.hargapaket = hargapaket;
    }

    /**
     * @return the ansuransi
     */
    public double getAnsuransi() {
        return ansuransi;
    }

    /**
     * @param ansuransi the ansuransi to set
     */
    public void setAnsuransi(double ansuransi) {
        this.ansuransi = ansuransi;
    }

    /**
     * @return the hargaTipeLayanan
     */
    public double getHargaTipeLayanan() {
        return hargaTipeLayanan;
    }

    /**
     * @param hargaTipeLayanan the hargaTipeLayanan to set
     */
    public void setHargaTipeLayanan(double hargaTipeLayanan) {
        this.hargaTipeLayanan = hargaTipeLayanan;
    }
}
