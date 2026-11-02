package com.shelton.structuredata.test;
import com.shelton.structuredata.vetor.Vetor;
public class Lesson03 {
    static void main() {

        Vetor vetor = new Vetor(2);

        try {
            vetor.adiciona("Shelton");
            vetor.adiciona("Belga");
            vetor.adiciona("Yola");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
