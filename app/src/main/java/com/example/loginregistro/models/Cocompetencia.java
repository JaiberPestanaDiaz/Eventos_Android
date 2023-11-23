package com.example.loginregistro.models;
public class Cocompetencia {
    private String codigo;
    private String nombre;
    private int duracion;
    private Resultado[] resultados;

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
}
