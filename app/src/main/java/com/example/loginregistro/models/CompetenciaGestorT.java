package com.example.loginregistro.models;
public class CompetenciaGestorT {
    private String codigo;
    private String nombre;
    private int duracion;
    private Resultado[] resultados;
    private int acumulado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Resultado[] getResultados() {
        return resultados;
    }

    public void setResultados(Resultado[] resultados) {
        this.resultados = resultados;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }
}
