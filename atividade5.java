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
public class atividade5 {
    public static void main(String[] args) {
       int num1;
       double quadrado;
       
       Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero");
        num1=sc.nextInt();
        
        quadrado = num1*num1;
        
        System.out.println("O  quadrado do número é:" + quadrado);
           
       }
       
        
}

