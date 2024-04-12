/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author alejo
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba su nombre: ");
        String nom = scanner.next();
        
        
    
 
        System.out.println("Hola "+ nom);
                System.out.print("Escriba un numero: ");
        int a = scanner.nextInt();
        System.out.print("Escriba un numero: ");
        int b = scanner.nextInt();
        System.out.println("Elija que operacion matematica desea realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Cerrar aplicación");
        
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:  
               int c= a + b;
        System.out.println("El resultado de la suma es: "+ c);
                 break;
            case 2: 
                c = a - b;
                System.out.println("El resultado de la resta es: "+ c);
                break;
            case 3:
                c = a * b;
                System.out.println("El resultado de la multiplicación es "+ c);
                break;
            case 4:
                c = a % b;
                System.out.println("El resultado de la division es "+ c);
                break;
            case 5: 
                System.exit(0);

            default:
                
        }
        
        

        
     
        
    }
        
    }

    

