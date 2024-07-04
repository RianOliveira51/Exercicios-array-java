package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
public class Problema_SomaVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i=0; i<n; i ++){
            vetor[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for(int i=0; i<n; i++){
            System.out.printf(" VALORES = %.2f\n", vetor[i]);
            sum += vetor[i];
        }
        System.out.printf("Soma: %.2f \n", sum);
        double media = sum / n;
        System.out.printf("Media: %.2f ", media);
    }
}
