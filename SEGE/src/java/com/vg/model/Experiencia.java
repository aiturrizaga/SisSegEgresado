package com.vg.model;

import java.sql.Date;

public class Experiencia {

    private String codigo;
    private Date fechinicio;
    private Date fechfin;
    private String cod_emp;
    private int cod_alum;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechinicio() {
        return fechinicio;
    }

    public void setFechinicio(Date fechinicio) {
        this.fechinicio = fechinicio;
    }

    public Date getFechfin() {
        return fechfin;
    }

    public void setFechfin(Date fechfin) {
        this.fechfin = fechfin;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    public int getCod_alum() {
        return cod_alum;
    }

    public void setCod_alum(int cod_alum) {
        this.cod_alum = cod_alum;
    }
    
    
}
