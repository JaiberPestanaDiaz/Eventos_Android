package com.example.loginregistro.models;
public class Sede {
    private String id;
    private String nombre;
    private Centro centro;
    private String lugar_funcionamiento;
    private String departamento;
    private String municipio;
    private int __v;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Centro getCentro() {
        return centro;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    public String getLugar_funcionamiento() {
        return lugar_funcionamiento;
    }

    public void setLugar_funcionamiento(String lugar_funcionamiento) {
        this.lugar_funcionamiento = lugar_funcionamiento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
