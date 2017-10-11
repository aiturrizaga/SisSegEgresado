package com.vg.model;

import java.sql.Date;

public class Experiencia {

    private String Codigo,Nombre,Apellido,DNI,Empresa;
    private Date FIniPrac,FFinPrac;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public Date getFIniPrac() {
        return FIniPrac;
    }

    public void setFIniPrac(Date FIniPrac) {
        this.FIniPrac = FIniPrac;
    }

    public Date getFFinPrac() {
        return FFinPrac;
    }

    public void setFFinPrac(Date FFinPrac) {
        this.FFinPrac = FFinPrac;
    }
    
}
