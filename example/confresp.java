package org.example;

import java.util.Scanner;

public class confresp {

    Scanner id = new Scanner(System.in);

    String[] resplida = new String[5];

        public void digitaquestao(){
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite a resposta da questão: " + (i+1));
            resplida[i] = id.next();
        }
    }

    Perguntas perg = new Perguntas();
    int contador = 0;

    public int conf (String[] a){
        for (int i = 0; i < 5; i++){
          if(a[i].equals(perg.getResposta(i))){
              contador = contador + 1;
          }
        }
        return contador;
    }
}
