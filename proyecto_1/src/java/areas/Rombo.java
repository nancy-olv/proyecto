/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;


public class Rombo {
    private int base;
    private int baseMayor;
    public Rombo(){
        
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }
    public int getArea(){
        return this.base*this.baseMayor;
    }
}
