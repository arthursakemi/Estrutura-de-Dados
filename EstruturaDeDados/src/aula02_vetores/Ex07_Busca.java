/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_vetores;

import static aula02_vetores.Ex04_Inverter.exibeVetor;
import static aula02_vetores.Ex04_Inverter.leInteiroPositivo;
import static aula02_vetores.Ex04_Inverter.leVetorAleatorio;
import java.util.Scanner;

/**
 *
 * @author arthur.msakemi
 */
public class Ex07_Busca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = leInteiroPositivo();
        int v[] = leVetorAleatorio(t);
        int n;
        int index;
        exibeVetor(v);

        System.out.print("Qual valor deseja buscar? ");

        n = input.nextInt();

        index = buscaLinear(v, n);

        if (index >= 0) {
            System.out.printf("Valor encontrado na posição: %d\n", index);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static int buscaLinear(int[] v, int n) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                return i;
            }
        }
        return -1;
    }

}
