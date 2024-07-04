package com.example.exercicioFixacaoVetores;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Locale;
import java.util.Scanner;

public class Problemas_Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos numeros você quer digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i =0; i < n; i++){
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos");

        for(int i=0; i<n; i++){
            if(vect[i] < 0){
                System.out.printf("%d\n", vect[i]);
            }
        }
        sc.close();
    }
}
