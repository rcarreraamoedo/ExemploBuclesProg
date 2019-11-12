/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobucles;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Metodos {
    private int num;
    Scanner sc = new Scanner(System.in);
    
    public void verDatos(){
        System.out.print("Teclea numero: ");
        num= sc.nextInt();
        while(num!=0){
            System.out.println(num);
            System.out.print("Teclea numero: ");
            num= sc.nextInt();
        }
        System.out.println("rematamos");
    }
    
}
