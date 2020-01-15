/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;


public class FigurasTest {
     public static void main(String ar[]){
        
                      
             Rombo figura1 = new Rombo();
         
         figura1.setBase(2);
         figura1.setBaseMayor(2);
        
        int res1 = figura1.getArea();
        
             System.out.println(res1);
             System.out.println();
             
             Cuadrado figura = new Cuadrado();
         
        figura.setLado(4);
        
        
        int res = figura.getArea();
        
             System.out.println(res);
             System.out.println();

            
             
        Triangulo figura2 = new Triangulo();
        figura2.setBase(4);
        figura2.setAltura(6);
        
        
        int res2 = figura2.getArea();
        
             System.out.println(res2);
             System.out.println(); 
             
              
    
            
    }
}
