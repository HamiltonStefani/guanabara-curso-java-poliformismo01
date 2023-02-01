/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12.polimorfismo01;

/**
 *
 * @author hamil
 */
public class Aula12Polimorfismo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Animal n = new Animal(); não pode ser Instanciado porque está classe é abstrata.
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        
       /* m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.emitirsom();*/
        
        /*a.locomover();
        p.locomover();*/
       /* r.locomover();
        r.alimentar();*/
       
       c.locomover();
       c.emitirsom();
       k.locomover();
       k.emitirsom();
       
    }
    
}
