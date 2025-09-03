package org.example;

public class PortoGrande extends BasePorto {

    @Override
    void atracarBarco(Barco barco) {
        if (barco.getTamanho() > 10){
            barcosAtracados.add(barco);
            System.out.println(barco.getNome() + " Atracado no " + this.getNome());
        }
    }

}
