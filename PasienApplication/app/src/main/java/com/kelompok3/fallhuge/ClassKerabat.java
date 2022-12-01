package com.kelompok3.fallhuge;

public class ClassKerabat {

    private int ppKerabat;
    private String nameKerabat;
    private int dropdownButton;

    public ClassKerabat(int ppKerabat, String nameKerabat, int dropdownButton) {
        this.ppKerabat = ppKerabat;
        this.nameKerabat = nameKerabat;
        this.dropdownButton = dropdownButton;
    }

    public int getPpKerabat() {
        return ppKerabat;
    }

    public void setPpKerabat(int ppKerabat) {
        this.ppKerabat = ppKerabat;
    }

    public String getNameKerabat() {
        return nameKerabat;
    }

    public void setNameKerabat(String nameKerabat) {
        this.nameKerabat = nameKerabat;
    }

    public int getDropdownButton() {
        return dropdownButton;
    }

    public void setDropdownButton(int dropdownButton) {
        this.dropdownButton = dropdownButton;
    }
}
