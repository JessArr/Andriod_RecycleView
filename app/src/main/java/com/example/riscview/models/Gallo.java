package com.example.riscview.models;

public class Gallo extends Animal{

            private String nombre;
            private String Raza;
            private Pico pico;

    public Gallo(String nombre, String raza, Pico pico) {
        this.nombre = nombre;
        Raza = raza;
        this.pico = pico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public Pico getPico() {
        return pico;
    }

    public void setPico(Pico pico) {
        this.pico = pico;
    }
}
