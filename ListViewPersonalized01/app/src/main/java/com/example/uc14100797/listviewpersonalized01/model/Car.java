package com.example.uc14100797.listviewpersonalized01.model;

/**
 * Created by UC14100797 on 05/09/2018.
 */

public class Car {
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String fabricante;
    private String modelo;

    public int getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(int codFabricante) {
        this.codFabricante = codFabricante;
    }

    private int codFabricante;
}
