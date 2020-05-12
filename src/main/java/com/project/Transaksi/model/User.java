package com.project.Transaksi.model;

public class User {
    private int id;
    private String nama;
    private String email;
    private String password;
    private String nohp;
    private float saldo;

    public User() {
    }

    public User(int id, String nama, String email, String password, String nohp, float saldo) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.nohp = nohp;
        this.saldo = saldo;
    }


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


}
