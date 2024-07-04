package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

public class Problema_Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantas Pessoas seram digitadas? ");
        int n = sc.nextInt();
        double menores = 0.0;

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf ("dados da %d pessoa: \n",  i+1);
            sc.nextLine();
            System.out.println("Nome: ");
            nome[i] = sc.nextLine();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Altura");
            altura[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i =0; i <n; i++){
            sum += altura[i];
            if(idade[i]<16){
                menores++;
            }
        }

        double media = sum / n;
        System.out.printf("Altura media: %.2f\n", media);
        double porcentualMenores = ((double)menores/n) *100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%\n", porcentualMenores);

        for(int i =0; i <n; i++){
            if(idade[i] <16){
                System.out.printf("%s\n" ,nome[i]);
            }
        }
    }
}
