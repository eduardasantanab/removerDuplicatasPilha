package com.atividade;
public class Solucao {
    String s;
    PilhaEstatica p;

    public Solucao(String s) {
        this.s = s;
        this.p = new PilhaEstatica(s.length());
    }

    public String removerDuplicatas() {
        int tamanho;
        boolean adiciona = false;
        tamanho = s.length();

            for (int i = 0; i < tamanho; i++) { //lê a string para comparar
                do {
                    if (!p.isEmpty() && p.peek() == s.charAt(i)) { //compara o último caracter do vetor da pilha com char da string
                        p.pop(); //se for duplicado remove do vetor da pilha
                    } else { //se não duplicado adiciona no vetor da pilha
                        p.push(s.charAt(i));
                        adiciona = true;
                    }
                } while (!adiciona); //confere se existe mais alguma duplicata
            }

        return String.valueOf(p.elementos).trim();
    }
}
