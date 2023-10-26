
package com.model;


import com.controller.DataBases;

 class Dosen extends person_parent{
    DataBases db = new DataBases();
    
    String NIP;

    public Dosen(String NIP, String Nama, String Alamat, String No_Hp, String Email) {
        super(Nama, Alamat, No_Hp, Email);
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

//    public boolean create(){
//        
//    
   
}
