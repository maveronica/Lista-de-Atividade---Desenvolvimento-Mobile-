/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author chave
 */
public class atividade3 {

    public static void main(String[] args) {
        double pi = 3.14;
        double raio;
        double altura;
        double volume;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        raio = sc.nextInt();
        System.out.println("Digite o valor da altura");
        altura = sc.nextInt();

        volume = pi * (raio * raio) * altura;
        System.out.println("O valor do volume é:" + volume);

    }

}
