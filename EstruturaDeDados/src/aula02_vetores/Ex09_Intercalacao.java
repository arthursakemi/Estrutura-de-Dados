/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_vetores;

import static aula02_vetores.Ex04_Inverter.exibeVetor;
import static aula02_vetores.Ex04_Inverter.leInteiroPositivo;
import static aula02_vetores.Ex04_Inverter.leVetorAleatorio;
import static aula02_vetores.Ex08_Inters_Uniao.inter2Vetores;

/**
 *
 * @author arthur.msakemi
 */
public class Ex09_Intercalacao {

    public static void main(String[] args) {
        int t1, t2, v1[], v2[], intercalado[];

        System.out.println("V1:");
        t1 = leInteiroPositivo();
        v1 = leVetorAleatorio(t1);
        System.out.println("");

        System.out.println("V1:");
        t2 = leInteiroPositivo();
        v2 = leVetorAleatorio(t2);
        System.out.println("");

        intercalado = new int[t1 + t2];

        System.out.println("V1:");
        bubbleSort(v1);
        exibeVetor(v1);
        System.out.println("");

        System.out.println("V2:");
        bubbleSort(v2);
        exibeVetor(v2);
        System.out.println("");

        System.out.println("Intercalacao V1 V2:");

        System.out.println("");
    }

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j--) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void intercalar2Vetores(int[] v1, int[] v2, int[] intercala) {
        int i = 0, j = 0, k = 0;

        while (i < v1.length && j < v2.length) {
            if (v1[i] < v2[j]) {
                intercala[k] = v1[i];
                i++;
                k++;
            } else {
                intercala[k] = v2[j];
                j++;
                k++;
            }
        }
    }

}
