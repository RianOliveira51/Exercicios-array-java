package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

public class Problema_MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] reais = new double[n];

        for(int i=0; i<n; i++){
            reais[i] = sc.nextDouble();
        }
        double maior = reais[0];
        int posmaior = 0;

        for(int i=0; i<n; i++){
            if(reais[i] > maior){
                maior = reais[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POsicao do maior valor = %d\n", posmaior);

        sc.close();
    }
}
