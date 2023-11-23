package com.example.loginregistro.models;
public class Competencia {
    private String programa;
    private Cocompetencia[] competencias;
    private int __v;

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Cocompetencia[] getCompetencias() {
        return competencias;
    }

    public void setCompetencias(Cocompetencia[] competencias) {
        this.competencias = competencias;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
