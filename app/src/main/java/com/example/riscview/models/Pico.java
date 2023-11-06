package com.example.riscview.models;

public class Pico {
    private String tamano;
    private String color;

    public Pico(String tamano, String color) {
        this.tamano = tamano;
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
