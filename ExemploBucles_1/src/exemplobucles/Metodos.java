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
    
    public int pedirDato(){
     System.out.print("Teclea numero: ");
     num= sc.nextInt();
     return num;
    }
            
    public void verDatos(){
//        System.out.print("Teclea numero: ");
//        num= sc.nextInt();
        pedirDato();
        while(num!=0){
            System.out.println(num);
            pedirDato();
//            System.out.print("Teclea numero: ");
//            num= sc.nextInt();
        }
        System.out.println("rematamos");
    }
    
}
