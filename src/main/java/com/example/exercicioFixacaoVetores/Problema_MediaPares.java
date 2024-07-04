package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

public class Problema_MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos elemetnos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] pares = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Digite o numero: ");
            pares[i] = sc.nextInt();
        }
        int sum = 0, npares = 0;
        double media;
        for(int i = 0; i<n;i++){
            if(pares[i] % 2 == 0){
                sum = sum + pares[i];
                npares++;
            }
        }

        media = sum / n;
        if(npares == 0){
            System.out.println("Nenhum para digitado");

        }else {
            media = (double)sum /npares ;
            System.out.printf("Media: %.1f\n", media);
        }
    }
}
