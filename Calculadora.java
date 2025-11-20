/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author kiko
 */
public class Calculadora {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Elige la operación (+, -, *, /): ");
        String operacion = scanner.next();
//comentario desde github

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

       
        double resultado = 0;
        boolean operacionValida = true;  

        if (operacion.equals("+")) {
            resultado = num1 + num2;
        } else if (operacion.equals("-")) {
            resultado = num1 - num2;
        } else if (operacion.equals("*")) {
            resultado = num1 * num2;
        } else if (operacion.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir entre 0");
                operacionValida = false;
            }
        } else {
            System.out.println("Operación no válida");
            operacionValida = false;
        }

    
        if (operacionValida) {
            System.out.println("Resultado: " + resultado);
        }    
        scanner.close();
    }
}
