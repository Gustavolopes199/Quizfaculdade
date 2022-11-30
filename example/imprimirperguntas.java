package org.example;

public class imprimirperguntas {
    Perguntas perguntas = new Perguntas();

    public void imprimirperg(int a){
        System.out.println(perguntas.getperguntas(a));
    }
    public void imprimiralt(int a){
        for(int i = 0; i < 5;i++){
            System.out.println(perguntas.getpergalt(i, a));
        }
    }
    public void imprimirtudo(){
        for(int i = 0; i < 5; i++){
            imprimirperg(i);
            imprimiralt(i);
        }
    }
}
