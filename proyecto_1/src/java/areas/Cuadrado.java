
package areas;


public class Cuadrado {

    private int lado;
    
    public Cuadrado(){}
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int getArea(){
        return this.lado*this.lado;
    }
}
