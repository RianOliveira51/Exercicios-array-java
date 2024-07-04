package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Problema_NumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] pares = new int[n];
        int sum;
        for(int i=0; i<n; i++){
            pares[i] = sc.nextInt();
        }
        System.out.println("\nNumeros Pares: ");
        int par=0;
        for(int i =0; i < n; i++){
            if(pares[i] % 2 == 0){
                System.out.printf("%d\n", pares[i]);
                par++;
            }
        }
        System.out.printf("\n\nQuantiade de pares = %d", par);
    }
}
