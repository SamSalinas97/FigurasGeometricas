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
public class Rombo {
    private double DL;
    private double DC;
    private double Lado;
    
    public Rombo(double DiagonalLarga, double DiagonalCorta, double lado) {
        this.DL = DiagonalLarga;
        this.DC = DiagonalCorta;
        this.Lado = lado;
    }

    public Rombo() {
        this(0, 0, 0);
    }

    public double getDC() {
        return DC;
    }
    
    public void setDC(double DiagonalCorta) {
        this.DC = DiagonalCorta;
    }
    
    public double getDL() {
        return DL;
    }
   
    public void setDL(double DiagonalLarga) {
        this.DL = DiagonalLarga;
    } 
    
    public double getLado() {
        return Lado;
    }
   
    public void setLado(double lado) {
        this.Lado = lado;
    } 
    
    public double getArea() {
        return (this.DL * this.DC)/2;
    }
   
    public double getPerimetro() {
        return 4 * this.Lado;
    }
    
}
