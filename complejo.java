/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obligatorio;

/**
 *
 * @author ikerx
 */
public class complejo {
    private double r;
    private double i;

    public complejo(){
        r=0;
        i=0;
    }
    public complejo(double r){
        i=0;
    }
    public complejo(double r, double i){
        this.i = i;
        this.r = r;
    }
    public void setImag(double i){
        this.i = i;
    }
    public void setReal(double r){
        this.r = r;
    }
    public double getImag() {
        return i;
    }
    public double getReal(){
        return r;
    }
    public complejo sumar(complejo num){
        double rr = this.r + num.getReal();
        double ri = this.i + num.getImag();
        complejo rsuma = new complejo(rr, ri);
        return rsuma;
    }
    public complejo restar(complejo num){
        double rr = this.r - num.getReal();
        double ri = this.i - num.getImag();
        complejo rresta = new complejo(rr, ri);
        return rresta;
    }
    public complejo multiplicar (complejo num){
        double rr = (this.r * num.getReal()) - (this.i * num.getImag());
        double ri = (this.r * num.getImag()) - (this.i * num.getReal());
        complejo rmulti = new complejo(rr, ri);
        return rmulti;
    }
    public complejo multiplicar (double num){
        double rr = this.r * num;
        double ri = this.i * num;
        complejo rmulti = new complejo(rr, ri);
        return rmulti;
    }
    public complejo dividir (complejo num){
        double rr = ((this.r * num.getReal()) - (this.i * num.getImag()))/(((num.getReal() * num.getReal()) + (num.getImag() * num.getImag())));
        double ri = 
    }
}
