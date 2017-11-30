/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.dao;

import com.megaerikasakti.hargaPaket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TarifFileDAO {
    public static List<hargaPaket> getHarga(){
        List<hargaPaket>hargaList = new ArrayList<>();
        try{
            Scanner scan = new Scanner(new File("C:/Java/latihan1/tarifpaket.txt"));
        while (scan.hasNextLine()){
            hargaPaket harga = new hargaPaket();
            String line = scan.nextLine();
            String[] data = line.split(",");
            
            harga.setKotatujuan(data[0]);
            harga.setReguler(Double.parseDouble(data[1]));
            harga.setKilat(Double.parseDouble(data[2]));
            harga.setSds(Double.parseDouble(data[3]));
            harga.setOns(Double.parseDouble(data[4]));
            harga.setHds(Double.parseDouble(data[5]));
            
            hargaList.add(harga);
            
        }
        }catch (FileNotFoundException ex){
            System.out.println("File Tidak ada");
        }
        return hargaList;
    }
}
