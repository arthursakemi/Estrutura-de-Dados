/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_complexidade;

import static aula02_vetores.Ex04_Inverter.exibeVetor;
import static aula02_vetores.Ex04_Inverter.leInteiroPositivo;
import static aula02_vetores.Ex04_Inverter.leVetorAleatorio;

/**
 *
 * @author arthur.msakemi
 */
public class Ex03_TrocaPosicaoMaiorMenor {

    public static void main(String[] args) {

        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);

        exibeVetor(v);
        trocaPosMaiorMenorVetor(v);

        exibeVetor(v);

    }

    public static void trocaPosMaiorMenorVetor(int[] v) {
        int[] indices = encontrarMaiorMenor(v);
        int iMaior = indices[1],
                iMenor = indices[0],
                aux;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > v[iMaior]) {
                iMaior = i;
            }
            if (v[i] < v[iMenor]) {
                iMenor = i;
            }
        }

        aux = v[iMenor];
        v[iMenor] = v[iMaior];
        v[iMaior] = aux;

    }

    public static int[] encontrarMaiorMenor(int[] v) {
        int[] indices = new int[2];

        for (int i = 0; i < v.length; i++) {
            if (v[i] < v[indices[0]]) {
                indices[0] = i;
            }
            if (v[i] > v[indices[1]]) {
                indices[1] = i;
            }
        }
        return indices;
    }

}
