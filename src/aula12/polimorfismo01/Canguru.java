/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.polimorfismo01;

/**
 *
 * @author hamil
 */
public class Canguru extends Mamifero{
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }
    
}
