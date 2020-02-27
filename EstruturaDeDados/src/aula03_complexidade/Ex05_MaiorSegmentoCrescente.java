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
public class Ex05_MaiorSegmentoCrescente {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetor(n);
        int tamanho = 1;
        exibeVetor(v);

        tamanho = maiorSegCrescente(v);

        System.out.println(tamanho);
    }

    public static int maiorSegCrescente(int[] v) {
        int max = 1;
        int count = 1;

        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] < v[i + 1]) {
                count++;
            } else if (count > max) {
                max = count;
                count = 1;
            }
        }
        if (count > max) {
            max = count;
        }

        return max;
    }

}
