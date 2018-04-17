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
public class Atividade1 {

    public static void main(String[] args) {
        int num1;
        int num2;
        double soma;
        double diferenca;
        double produto;
        double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro número");
        num1=sc.nextInt();
        System.out.println("Entre com o segundo numero");
        num2=sc.nextInt();
        
        soma=num1+num2;
        diferenca=num1-num2;
        produto = num1*num2;
        media=(num1+num2)/2;
        
        System.out.println("soma:" +soma);
        System.out.println("diferenca:" +diferenca);
        System.out.println("produto:" +produto);
        System.out.println("media:" +media);
    }

}
