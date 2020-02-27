/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_complexidade;

import static aula02_vetores.Ex04_Inverter.exibeVetor;
import static aula02_vetores.Ex04_Inverter.leInteiroPositivo;
import static aula02_vetores.Ex04_Inverter.leVetorAleatorio;
import static aula03_complexidade.Ex03_TrocaPosicaoMaiorMenor.encontrarMaiorMenor;

/**
 *
 * @author arthur.msakemi
 */
public class Ex04_MaiorDiferenca {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        int dif;
        exibeVetor(v);

        dif = maiorDiferenca(v);

        System.out.println(dif);

    }

    public static int maiorDiferenca(int[] v) {
        int[] indices = encontrarMaiorMenor(v);

        return v[indices[1]] - v[indices[0]];
    }

}
