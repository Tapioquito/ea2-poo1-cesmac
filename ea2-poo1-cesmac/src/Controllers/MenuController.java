package Controllers;

import Model.Entities.Filme;
import Model.Entities.Ingresso;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {


    public Filme selecionarFilme(Filme[] filmes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione dentre os filmes a seguir:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + " - " + filmes[i]);
        }
        int f = sc.nextInt();
        sc.close();
        return filmes[f - 1];

    }

    public Double comprarIngresso() {
        double sum = 0.0;
        // Ingresso ingresso;
        /// ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
        int count = 0;
        while (true) {
            System.out.println("Selecione os tipos de ingresso:");

            System.out.println("1 - Inteira (24.00)");

            System.out.println(" 2- Meia (12.00)");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            switch (i) {
                case 1:

                    sum += 24.0;
                    count++;
                    break;
                case 2:
                    sum += 12.0;
                    count++;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Gostaria de sair?");
            System.out.println("1 - Sim\n" +
                    "2 - Não");
            int opt = sc.nextInt();
            if (opt == 1) {
                break;
            } else {
                System.out.println("Selecione os tipos de ingresso:");

                System.out.println("1 - Inteira (24.00)");

                System.out.println(" 2- Meia (12.00)");

                i = sc.nextInt();
            }


        }
        System.out.println("Número de ingressos comprados: " + count);
        System.out.println("Valor da compra:" + sum);
        return sum;

    }


}