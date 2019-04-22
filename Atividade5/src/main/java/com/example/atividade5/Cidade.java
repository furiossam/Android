package com.example.atividade5;

public class Cidade {
    private String nome;
    private int pop;
    private double densDem,area;

    public Cidade(String nome,int pop,double densDem,double area){
        this.nome=nome;
        this.pop=pop;
        this.densDem=densDem;
        this.area=area;
    }

    public String getNome() {
        return nome;
    }

    public int getPop() {
        return pop;
    }

    public double getDensDem() {
        return densDem;
    }

    public double getArea() {
        return area;
    }
}
