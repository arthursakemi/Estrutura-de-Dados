/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_complexidade;

import static aula02_vetores.Ex04_Inverter.exibeVetor;
import static aula02_vetores.Ex04_Inverter.leInteiroPositivo;
import static aula02_vetores.Ex04_Inverter.leVetor;

/**
 *
 * @author arthur.msakemi
 */
public class Ex06_Interseccao2vetores {

    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetor(n1);
        int n2 = leInteiroPositivo();
        int v2[] = leVetor(n2);

        exibeVetor(v1);
        exibeVetor(v2);
        inter2Vetores(v1, v2);
    }

    public static void inter2Vetores(int[] v1, int[] v2) {
        int i = 0;
        int j = 0;

        System.out.print("{");
        while (i < v1.length && j < v2.length) {
            if (v1[i] == v2[j]) {
                System.out.print(v1[i] + " ");
                i++;
                j++;
            } else if (v1[i] < v2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("}");
    }

}
