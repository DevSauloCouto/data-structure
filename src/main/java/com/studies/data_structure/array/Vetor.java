package com.studies.data_structure.array;
/*
*  Vetor (Array) - estrutura de dados do tipo Lista, que armazena um conjunto de valores do mesmo tipo sequencialmente
   na memória. Possui um tamanho fixo, definido no momento de sua instância.
*  Seus valores podem ser acessados por um índice válido. A primeira posição começa em 0 e a última (n - 1) - 'n' é o tamanho
   do Vetor.
*  Podemos atribuir ou alterar um valor de um determinado índice do Vetor.
*  Podemos percorrer um Vetor com um loop, para buscar algum valor específico diante alguma condição ou para gerar uma
   saída de todos os elementos existentes no Vetor.
* */
public class Vetor {

    public static void main(String[] args) {
        int[] ages = new int[10];

        ages[9] = 18;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] == 18) {
                System.out.println((i + 1) + " " + ages[i]);
                break;
            }
        }
    }

}
