/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author Cata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // nombreClase nombreObjeto = new nombreClase(parametros);
        Rectangulo rectangulo1 = new Rectangulo(5,9);
        
        //llamar un metodo
        //nombreObjeto.nombreMetodo(parametros);
        
        rectangulo1.area();
        rectangulo1.perimetro();
        
        //getters -> obtener valor de variable
        System.out.println("ancho de rectangulo1: " + rectangulo1.getAncho() );
        
        //setters -> Modificar/cambiar el valor de una atributo
        rectangulo1.setAncho(5);
        System.out.println("nuevo ancho de rectangulo1: " + rectangulo1.getAncho() );
        
        rectangulo1.area();
        rectangulo1.perimetro();
   
        Triangulo triangulo1 = new Triangulo(5,7,3,4);
        triangulo1.area();
        triangulo1.perimetro();
        
    }
    
}
