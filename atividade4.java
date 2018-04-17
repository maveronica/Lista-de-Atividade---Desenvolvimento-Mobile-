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
public class atividade4 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para A");
        a = sc.nextInt();
        System.out.println("Digite um valor para B");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("O valor de A é:" +a);
          System.out.println("O valor de B é:" +b);
    }
}
