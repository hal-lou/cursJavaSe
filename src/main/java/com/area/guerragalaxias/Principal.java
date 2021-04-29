package com.area.guerragalaxias;

/**
 *
 * @author Ordinador
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("EJERCICIO 2");

        Jedi luleSkywalker = new Jedi("Luke Skywalker", "azul");
        Jedi maceWindu = new Jedi("MaceWindu", "morado");
        Jedi yoda = new Jedi("Yoda", "verde");
        Jedi quigonJinn = new Jedi("Qui-Gon Jinn", "verde");
        Jedi obiwankenobi = new Jedi("Obi-Wan kenobi", "azul");
        luleSkywalker.mostrar();
        maceWindu.mostrar();
        yoda.mostrar();
        quigonJinn.mostrar();
        obiwankenobi.mostrar();

    }
}
