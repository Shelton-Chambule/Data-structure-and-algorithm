package com.shelton.structuredata.test;
import com.shelton.structuredata.vetor.Vetor;

public class Lesson06 {
    static void main() throws Exception {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("Shelton");
        vetor.adiciona("Belga");
        vetor.adiciona("Yola");

        System.out.println(vetor.VerificarElemento("Shelton"));

    }
}
