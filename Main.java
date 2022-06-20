package com.Openbootcamp.POO.Interfaces.ConInterfaz;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CocheCrudImpl cocheCrud = new CocheCrudImpl("Ford", "k", "rojo");

        List<CocheCrudImpl> coche = cocheCrud.findAll();
        cocheCrud.delete(cocheCrud);
        cocheCrud.save(cocheCrud);

    }
}
