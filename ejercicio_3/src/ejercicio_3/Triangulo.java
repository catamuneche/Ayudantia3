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
public class Triangulo implements FiguraGeometrica  {
    //atribitos
    int ladoA; //base
    int ladoB;
    int ladoC;
    int altura;
    
    //constructor
    public Triangulo(int ladoA, int ladoB, int ladoC, int altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
    }
    
    //metodos
    @Override
    public void area(){
        int area = ladoA * altura / 2;
        System.out.println("el area del triangulo es: " + area);
    }
    
    @Override
    public void perimetro(){
        int perimetro = ladoA + ladoB + ladoC;
        System.out.println("el perimetro del triangulo es: " + perimetro);
    }
    
    //getters y setters
    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
