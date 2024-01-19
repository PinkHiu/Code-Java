/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loptriangle1;

public class Triangle 
{
    private Point A, B, C;
    private double AB, AC, BC;
    
    public Triangle(Point A, Point B, Point C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
        this.AB = A.distance(B);
        this.AC = A.distance(C);
        this.BC = B.distance(C);
    }
    
    public boolean valid()
    {
        if(this.AB + this.AC <= this.BC) return false;
        if(this.AB + this.BC <= this.AC) return false;
        if(this.AC + this.BC <= this.AB) return false;
        return true;
    }
    
    public String getPerimeter()
    {
        return String.format("%.3f" ,this.AB + this.AC + this.BC);
    }
}
