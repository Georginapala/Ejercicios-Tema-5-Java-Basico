package com.Openbootcamp.POO.Interfaces.ConInterfaz;
import java.util.List;
 public interface CocheCrud {
    /* se declaran los metodos pero no se implementan
     * La interfaz actua como un contrato, dice lo que hay que hacer pero no lo hace */
    void save(CocheCrudImpl cocheCrudImpl);

    List<CocheCrudImpl> findAll();

    void delete(CocheCrudImpl cocheCrudImpl);

}