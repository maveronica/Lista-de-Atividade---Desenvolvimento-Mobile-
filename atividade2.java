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
public class atividade2 {
    public static void main(String[] args) {
        double f;
        double c;
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor em ºC");
        c=sc.nextInt();;
        
        f=(9 * c+160)/5;
        System.out.println(" O resultado é"+f);
    }

    

}

