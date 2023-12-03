package com.javm.convertidor.model;

public class Convertidor {

    double gradosF;
    double gradosC;

    public Convertidor(String gradosC){
        this.gradosC = Double.parseDouble(gradosC);
    }

    public void calcular(){
        gradosF =  gradosC *1.8+32.0;
    }

    public double getGradosF(){
        return gradosF;
    }
}
