/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author TOCAYO-Pc
 */
public class Elipse {
    private double A;
    private double B;
    
    public Elipse(double SemiEjeMayor, double SemiEjeMenor) {
        this.A = SemiEjeMayor;
        this.B = SemiEjeMenor;        
    }
    
     public Elipse() {
        this(0, 0);
    }
     public double getA() {
        return A;
    }
    
    public void setA(double SemiEjeMayor) {
        this.A = SemiEjeMayor;
    }
    
    public double getB() {
        return B;
    }
   
    public void setB(double SemiEjeMenor) {
        this.B = SemiEjeMenor;
    } 
    
    public double getArea() {
        return Math.PI * this.A * this.B;
    }
   
    public double getPerimetro() {
        return Math.PI * (this.A + this.B);
    }

}
