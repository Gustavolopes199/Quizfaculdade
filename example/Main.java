package org.example;

public class Main {
    public static void main(String[] args) {
        imprimirperguntas print = new imprimirperguntas();
        confresp conferir = new confresp();
        print.imprimirtudo();
        conferir.digitaquestao();
        System.out.println(conferir.conf(conferir.resplida));
    }
}