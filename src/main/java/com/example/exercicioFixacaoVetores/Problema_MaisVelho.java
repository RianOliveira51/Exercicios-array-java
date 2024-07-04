package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

public class Problema_MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas vai digitar?");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for(int i=0;i<n;i++){
            System.out.printf("Dados da %da pessoa: \n", i +1);
            sc.nextLine();
            System.out.println("Nome: ");
            nome[i] = sc.nextLine();
            System.out.println("Idade");
            idade[i] = sc.nextInt();
        }

        int maior = idade[0];
        int posicaomaior = 0;

        for(int i=0; i<n; i++){
            // para saber maior numero
            if(idade[i]>maior){
                maior = idade[i];
                //armazenar a posicao do maior numero
                posicaomaior = i;
            }
        }
        System.out.printf("Pessoa Mais Velha: %s\n", nome[posicaomaior]);
    }
}
