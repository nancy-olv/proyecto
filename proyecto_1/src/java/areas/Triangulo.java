/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;


public class Triangulo {
    private int base;
    private int altura;

   public Triangulo(){
       
   }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
   public int getArea(){
  return (this.base*this.altura)/2;
   
   }  
}
