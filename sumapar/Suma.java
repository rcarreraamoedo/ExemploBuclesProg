/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumapar;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Suma {
    private int num;
    private int suma;
    private int cont = 0;
    Scanner sc = new Scanner(System.in);
      
    //Metodo para pedir por teclado un valor
    public int pedirDatos(){
     System.out.print("Teclea numero: ");
     num= sc.nextInt();
     return num;
    }
    //Metodo usando Do...While
    public void sumaPar(){
    do{
      num=pedirDatos();
      if(num%2==0)
          suma = suma + num;
    cont++;
    }while(cont < 5);
        System.out.println(suma);
    }
    //Outro método usando FOR
    public void sumarParesFor(){
    int acu = 0;
//    int cont; 
    for(int cont=0;cont<5;cont++){
        num=pedirDatos();
        if(num%2==0)
            acu = acu+num;
    }
        System.out.println("** suma pares = "+acu);
    }
}
