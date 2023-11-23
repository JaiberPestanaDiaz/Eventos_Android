package com.example.loginregistro.models;

import java.util.ArrayList;

public class AutenticacionResModel {
    private String id;
    private String documento;
    private String nombre;
    private String apellido;
    private String correo;
    private ContratoResModel contrato;
    private ArrayList<String> roles;

    private String access_token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ContratoResModel getContrato() {
        return contrato;
    }

    public void setContrato(ContratoResModel contrato) {
        this.contrato = contrato;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public class ContratoResModel {
    private String numero;
    private String fechaInicio;
    private String fechaTerminacion;
    private String tipoVinculacion;

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getFechaInicio() {
            return fechaInicio;
        }

        public void setFechaInicio(String fechaInicio) {
            this.fechaInicio = fechaInicio;
        }

        public String getFechaTerminacion() {
            return fechaTerminacion;
        }

        public void setFechaTerminacion(String fechaTerminacion) {
            this.fechaTerminacion = fechaTerminacion;
        }

        public String getTipoVinculacion() {
            return tipoVinculacion;
        }

        public void setTipoVinculacion(String tipoVinculacion) {
            this.tipoVinculacion = tipoVinculacion;
        }
    }
}



//{
//  "id": "6539838be3d5e599f8b29e7a",
//  "documento": "1234567890",
//  "nombre": "ADSO",
//  "apellido": "2617684",
//  "correo": "adso2617684@sena.edu.co",
//  "contrato": {
//    "numero": "CON123456",
//    "fechaInicio": "2023-02-01",
//    "fechaTerminacion": "2023-12-15",
//    "tipoVinculacion": "contratista"
//  },
//  "programas": [
//    "653982f99f2956fae5ca3bc8"
//  ],
//  "centro": "65398167e3d5e599f8b29e77",
//  "roles": [
//    "Administrator",
//    "Instructor"
//  ],
//  "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2NTM5ODM4YmUzZDVlNTk5ZjhiMjllN2EiLCJjb3JyZW8iOiJhZHNvMjYxNzY4NEBzZW5hLmVkdS5jbyIsInJvbCI6WyJBZG1pbmlzdHJhdG9yIiwiSW5zdHJ1Y3RvciJdLCJpYXQiOjE3MDAwODI1MTAsImV4cCI6MTcwMDA4NjExMH0.maQns_6dcjkxowyq1objY1zP98_ZYJCJOqC-v4qdCvQ"
//}