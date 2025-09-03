package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 2));
        barcos.add(new Barco("Barco 2", 5));
        barcos.add(new Barco("Barco 3", 7));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 20));

        PortoGrande portoGrande = new PortoGrande();
        PortoPequeno portoPequeno = new PortoPequeno();

        portoGrande.setNome("Porto Grande");
        portoPequeno.setNome("Porto Pequeno");

        for (Barco barco : barcos) {
            portoPequeno.atracarBarco(barco);
            portoGrande.atracarBarco(barco);
        }

    }
}