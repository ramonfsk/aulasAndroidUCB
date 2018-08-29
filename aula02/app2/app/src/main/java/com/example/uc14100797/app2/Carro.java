package com.example.uc14100797.app2;

import java.io.Serializable;

/**
 * Created by UC14100797 on 29/08/2018.
 */

public class Carro implements Serializable {
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
}
