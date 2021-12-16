/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double Cnsm;
       double Slr;
       double qwatts;
       double Total;
       double Desc;
       
       System.out.print("Qual consumo de quilowatt gasto nesta residencia? ");
       Cnsm = entrada.nextDouble();
       System.out.print("Qual o valor do salario minimo atual? ");
       Slr = entrada.nextDouble();
       
        qwatts = Slr/500;
        Total = qwatts*Cnsm;
        Desc = Total-(Total*17)/100;
        
        System.out.println("O valor total da conta é: R$"+Total);
        System.out.println("O valor será de: R$"+Desc+" com desconto de 17%"); 
        System.out.println("Cada quilowatt custa: R$"+qwatts);
        
    }
    
}
