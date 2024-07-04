package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

public class Problema_AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetorA = new double[n];

        for(int i=0; i<n; i++){
            vetorA[i]= sc.nextDouble();
        }

        double sum =0;
        double media = 0.0;

        for(int i=0; i <n; i++){
            sum += vetorA[i];
        }
        media = sum / n;
        System.out.printf("MEDIA DO VETOR: %.3f\n", media);

        for(int i=0; i<n; i++){
            if(vetorA[i] < media){
                System.out.printf("%.2f\n",vetorA[i]);
            }
        }
    }
}
