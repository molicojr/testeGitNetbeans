/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testegitnetbeans;

import java.util.Scanner;

/**
 *
 * @author molico
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = teclado.next();
        System.out.println("Digite a idade da pessoa: ");
        int idade = teclado.nextInt();
        Pessoa pessoa01 = new Pessoa(nome,idade);
        System.out.println(pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");
        System.out.println("Essa pessoa fez aniversário");
        pessoa01.fazerAniversario();
        System.out.println("Agora " + pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");
        
        
        
        
    }
}
