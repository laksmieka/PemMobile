package com.example.pemmobile.Model;

public class m_barang {
    String nama_barang, satuan, id, stok;
    int img, harga;


    public m_barang(String id, String nama_barang, int img, String satuan, int harga) {
        this.id = id;
        this.nama_barang = nama_barang;
        this.img = img;
        this.harga = harga;
        this.stok = stok;
        this.satuan = satuan;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String  getStok(){return stok;}

    public void setStok(String stok){this.stok = stok}
}
