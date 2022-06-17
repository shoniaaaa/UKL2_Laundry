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


public interface User {
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    public void setJabatan(Integer jabatan);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
    public Integer getJabatan(int id);
}
    




//interface adalah user kelas abstraknya itu, polymor, method abstrak
//get: asesor
//diimplementasikan memakai overriding di kelas client dan petugas
//modifier,tipe method