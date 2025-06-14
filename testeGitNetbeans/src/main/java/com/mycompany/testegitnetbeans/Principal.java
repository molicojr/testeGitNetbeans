/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testegitnetbeans;

/**
 *
 * @author molico
 */
public class Principal {

    public static void main(String[] args) {
        
        Pessoa pessoa01 = new Pessoa("Darth Vader", 30);
        System.out.println(pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");
        System.out.println("Essa pessoa fez aniversário");
        pessoa01.fazerAniversario();
        System.out.println("Agora " + pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");
        
        
        
        
    }
}
