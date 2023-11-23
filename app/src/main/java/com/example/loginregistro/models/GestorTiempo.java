package com.example.loginregistro.models;
public class GestorTiempo {
    private String ficha;
    private int duracion;
    private int acumulado;
    private CompetenciaGestorT[] competencias;
    private int __v;

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public CompetenciaGestorT[] getCompetencias() {
        return competencias;
    }

    public void setCompetencias(CompetenciaGestorT[] competencias) {
        this.competencias = competencias;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
