package com.example.exercicioFixacaoVetores;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

public class Problema_Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        //Criando vetores
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        //inicializando os vetores
        for(int i=0; i<n;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        // validação da media
        System.out.println("Alunos aprovador: ");
        double media;
        for(int i=0; i<n; i++){
            media = (nota1[i] + nota2[i]) / 2;
            if(media > 6.0){
                System.out.printf("%s\n", nome[i]);
            }
        }

    }
}
