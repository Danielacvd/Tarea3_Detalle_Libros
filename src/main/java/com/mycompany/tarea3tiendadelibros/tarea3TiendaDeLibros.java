/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea3tiendadelibros;

import java.util.Scanner;

/**
 * Tarea n°3 Tienda De Libros
 * @author daniel
 */
public class tarea3TiendaDeLibros {
    public static void main(String args[]){
        var scanner = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println(nombre);
        System.out.println("Proporciona el id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(id);
        System.out.println("Proporciona el precio: ");
        double precio = Integer.parseInt(scanner.nextLine());
        System.out.println(precio);
        System.out.println("Proporciona el simbolo :");
        char symbol = scanner.nextLine().charAt(0);
        System.out.println(symbol);
        System.out.println("Proporciona el envio gratuito :");
        boolean envio = scanner.nextBoolean();
        System.out.println(envio);
        System.out.println(nombre + " " + "#" + id);
        System.out.println("Precio : " + symbol + precio);
        System.out.println("Envio gratuito :" + envio);
        
    }
}
