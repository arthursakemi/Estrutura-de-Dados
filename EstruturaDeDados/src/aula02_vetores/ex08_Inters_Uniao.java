/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_vetores;

import static aula02_vetores.Ex04_Inverter.exibeVetor;
import static aula02_vetores.Ex04_Inverter.leInteiroPositivo;
import static aula02_vetores.Ex04_Inverter.leVetorAleatorio;
import static aula02_vetores.ex07_Busca.buscaLinear;

/**
 *
 * @author arthur.msakemi
 */
public class ex08_Inters_Uniao {

    public static void main(String[] args) {
        int t1, t2, v1[], v2[], inter[], uniao[];

        System.out.println("V1:");
        t1 = leInteiroPositivo();
        v1 = leVetorAleatorio(t1);
        System.out.println("");

        System.out.println("V1:");
        t2 = leInteiroPositivo();
        v2 = leVetorAleatorio(t2);
        System.out.println("");

        inter = new int[t1];
        uniao = new int[t1 + t2];

        System.out.println("V1:");
        exibeVetor(v1);
        System.out.println("");

        System.out.println("V2:");
        exibeVetor(v2);
        System.out.println("");

        System.out.println("Interseccao V1 V2:");
        exibeVetor(inter, inter2Vetores(v1, v2, inter));
        System.out.println("");

        System.out.println("Uniao V1 V2:");
        exibeVetor(uniao, uniao2Vetores(v1, v2, uniao));

    }

    public static int inter2Vetores(int[] v1, int[] v2, int[] inter) {
        int k = 0;

        for (int i = 0; i < v1.length; i++) {
            if (buscaLinear(v2, v1[i]) >= 0) {
                inter[k] = v1[i];
                k++;
            }
        }

        return k;
    }

    public static int uniao2Vetores(int[] v1, int[] v2, int[] uniao) {
        int k = 0;

        for (int i = 0; i < v1.length; i++) {
            uniao[k] = v1[i];
            k++;
        }

        for (int i = 0; i < v2.length; i++) {
            if (buscaLinear(v1, v2[i]) < 0) {
                uniao[k] = v2[i];
                k++;
            }
        }

        return k;
    }

}
