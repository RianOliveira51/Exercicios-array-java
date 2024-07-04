package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.

public class Problema_DadosPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for(int i =0; i<n; i++){
            sc.nextLine();
            System.out.printf("Altura da pessoa %da:\n ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da pessoa %da:\n ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        double maior = altura[0];
        int posicaomaior = 0;
        double menor = altura[0];
        int posicaomenor=0;

        for(int i =0; i<n; i++){
            if(altura[i]> maior){
                maior = altura[i];
                posicaomaior = i;
            }
            if(altura[i]<menor){
                menor = altura[i];
                posicaomenor = i;
            }
        }

        int qtdhmoens  = 0;
        int qtdmulheres = 0;
        double alturafemtotal = 0;

        for(int i =0; i <n; i++){
            if(genero[i]== 'M'){
                qtdhmoens++;
            }
            else{
                qtdmulheres++;
                alturafemtotal = alturafemtotal + altura[i];
            }
        }
        double alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura: %.2f\n", altura[posicaomenor]);
        System.out.printf("Maior altura: %.2f\n", altura[posicaomaior]);
        System.out.printf("Media das alturas  das mulheres %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens %d\n", qtdhmoens);

    }
}
