package org.example;

public class Perguntas {

  private String[] perguntas = {"perg1", "perg2", "perg3", "perg4", "perg5"};
  private String[][] pergalt = {{"alt1.1", "alt1.2", "alt1.3", "alt1.4", "alt1.5"}, {"alt2.1", "alt2.2", "alt2.3", "alt2.4", "alt2.5"}, {"alt3.1", "alt3.2", "alt3.3", "alt3.4", "alt3.5"},{"alt4.1", "alt4.2", "alt4.3", "alt4.4", "alt4.5"},{"alt5.1", "alt5.2", "alt5.3", "alt5.4", "alt5.5"}};

  private String[] resposta = {"a" , "e", "d", "b", "c"};
        public String getperguntas(int a){
            return perguntas[a];
        }

         public String getpergalt(int a, int b){
            return pergalt[b][a];
    }
        public String getResposta(int a){
            return resposta[a];
        }
}
