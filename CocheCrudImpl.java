package com.Openbootcamp.POO.Interfaces.ConInterfaz;

import com.Openbootcamp.POO.Interfaces.ConInterfaz.CocheCrud;

import java.util.List;

public class CocheCrudImpl implements CocheCrud {
    String marca;
    String modelo;
    String color;

    public CocheCrudImpl(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public void save(CocheCrudImpl cocheCrudImpl) {
        System.out.println("Save " + cocheCrudImpl.toString());

    }

    @Override
    public List<CocheCrudImpl> findAll() {
        System.out.println("Find All");
        return null;

    }

    @Override
    public void delete(CocheCrudImpl cocheCrudImpl) {
        System.out.println("Delete " + cocheCrudImpl.toString());

    }

    @Override
    public String toString() {
        return "CocheCrudImpl{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

