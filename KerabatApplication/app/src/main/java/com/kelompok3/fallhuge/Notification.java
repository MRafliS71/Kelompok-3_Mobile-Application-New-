package com.kelompok3.fallhuge;

import java.sql.Date;
import java.sql.Time;

public class Notification {
    String judul, jenis ,waktu, tanggal;
    int ppAcount, bgNotif, ikonNotif;

    public Notification(String judul, String jenis, String waktu, String tanggal, int ppAcount, int bgNotif, int ikonNotif) {
        this.judul = judul;
        this.jenis = jenis;
        this.waktu = waktu;
        this.tanggal = tanggal;
        this.ppAcount = ppAcount;
        this.bgNotif = bgNotif;
        this.ikonNotif = ikonNotif;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getPpAcount() {
        return ppAcount;
    }

    public void setPpAcount(int ppAcount) {
        this.ppAcount = ppAcount;
    }

    public int getBgNotif() {
        return bgNotif;
    }

    public void setBgNotif(int bgNotif) {
        this.bgNotif = bgNotif;
    }

    public int getIkonNotif() {
        return ikonNotif;
    }

    public void setIkonNotif(int ikonNotif) {
        this.ikonNotif = ikonNotif;
    }
}
