package com.vg.model;

import java.sql.Date;

public class Egresados {

    private int codigo;
    private String nombre;
    private String apellido;
    private int dni;
    private Date fing;
    private String correo, tipingr;
    private int telf1;
    private int telf2;
    private String estado;
    private String carrera;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFing() {
        return fing;
    }

    public void setFing(Date fing) {
        this.fing = fing;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelf1() {
        return telf1;
    }

    public void setTelf1(int telf1) {
        this.telf1 = telf1;
    }

    public int getTelf2() {
        return telf2;
    }

    public void setTelf2(int telf2) {
        this.telf2 = telf2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTipingr() {
        return tipingr;
    }

    public void setTipingr(String tipingr) {
        this.tipingr = tipingr;
    }
    
    
}
