/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
package Laundry;

import java.util.ArrayList;


public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Petugas(){
        this.namaPetugas.add("Administrator Cuci Kering");
        this.alamat.add("Mars");
        this.telepon.add("089********");
        this.jabatan.add(1);
        
        this.namaPetugas.add("Administrator Cuci Lipat");
        this.alamat.add("Jupiter");
        this.telepon.add("081*********");
       this.jabatan.add(2);
       
        this.namaPetugas.add("Administrator Cuci Setrika ");
        this.alamat.add("Saturnus");
        this.telepon.add("081*********");
        this.jabatan.add(3);
        
        this.namaPetugas.add("Administrator Cuci Karpet");
        this.alamat.add("Uranus");
        this.telepon.add("081*********");
        this.jabatan.add(4);
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
    }

    @Override
    public void setJabatan(Integer jabatan) {
      this.jabatan.add(jabatan);
      
    }

    @Override
    public Integer getJabatan(int id) {
       return this.jabatan.get(id); 
}
   }
//get: mendapatkan/memanggil
//set: merubah/menyetting value
//poly
    
