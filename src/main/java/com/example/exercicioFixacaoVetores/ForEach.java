package com.example.exercicioFixacaoVetores;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i=0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("---------------");
        //for each
        // tipo do vetor: String
        //apelido: objeto (qualquer nome)
        // colecao: vetor
        for (String obj : vect){
            System.out.println(obj);
        }

    }
}
