/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author Sam-Pc
 */
public class TrianguloEquilatero {
    
    private double Base1;
    private double Altura1;

    public TrianguloEquilatero(double base, double altura) {
        this.Base1 = base;
        this.Altura1 = altura;
    }

    public TrianguloEquilatero() {
        this(0, 0);
    }

    public double getBase() {
        return Base1;
    }
    
    public void setBase(double base) {
        this.Base1 = base;
    }
    
    public double getAltura() {
        return Altura1;
    }
   
    public void setAltura(double altura) {
        this.Altura1 = altura;
    } 
    
    public double getArea() {
        return (this.Base1 * this.Altura1)/2;
    }
   
    public double getPerimetro() {
        return 3 * this.Base1;
    }
    
}
