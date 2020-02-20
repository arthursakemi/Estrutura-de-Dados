/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_vetores;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author arthur.msakemi
 */
public class Ex04_Inverter {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);

        exibeVetor(v);
        inverteVetor(v);
        exibeVetor(v);
    }

    public static int leInteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("Informe o tamanho do vetor: ");
            n = input.nextInt();
        } while (n <= 0 && n > 100);

        return n;
    }

    public static int[] leVetor(int n) {
        Scanner input = new Scanner(System.in);
        int v[] = new int[n];

        for (int i = 0; i < v.length; i++) {
            System.out.printf("v[%d]: ", i);
            v[i] = input.nextInt();
        }

        return v;
    }

    public static int[] leVetorAleatorio(int n) {
        Random rng = new Random();
        int v[] = new int[n];

        for (int i = 0; i < v.length; i++) {
            v[i] = rng.nextInt(50);
        }

        return v;
    }

    public static void exibeVetor(int[] v) {
        System.out.println("Os elementos do vetor são;");
        System.out.print("{");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);

            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void exibeVetor(int[] v, int n) {
        System.out.println("Os elementos do vetor são;");
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void inverteVetor(int v[]) {
        int temp;

        for (int i = 0; i < v.length / 2; i++) {
            temp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = temp;
        }
    }

}
