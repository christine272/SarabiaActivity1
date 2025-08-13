/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micheal.hello2;

import java.util.Scanner;

/**
 *
 * @author PC 30
 */
public class airfare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      int kelo , clas;
         double total = 0;
         
         System.out.print("Distance(km):");
         kelo = sc.nextInt();
         System.out.print("Class:");
         clas = sc.nextInt();
         
         if (clas == 1) {
             total = kelo * 250;
         }else if (clas == 2 ) {
             total = kelo * 500;
         }else {
             System.out.println("your input is not inputing");
             return ;
         }
         
         if (kelo > 1000){
             total *= 0.9;
         }
         
        System.out.println(" ");
        System.out.printf("Total Fare: %.2f%n", total);     
        
        
    }
}
