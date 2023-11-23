package com.example.loginregistro.models;
public class Programa {
    private String codigo;
    private String nombre;
    private String nivel;
    private String version;
    private int duracion;
    private int intensidad_horaria;
    private int __v;


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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getIntensidad_horaria() {
        return intensidad_horaria;
    }

    public void setIntensidad_horaria(int intensidad_horaria) {
        this.intensidad_horaria = intensidad_horaria;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }


}
