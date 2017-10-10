package com.vg.controller;

import com.vg.dao.EgresadosDao;
import com.vg.model.Egresados;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;

@Named(value = "egresadosController")
@SessionScoped
public class EgresadosController implements Serializable {

    Egresados egre = new Egresados();
    EgresadosDao dao;
    private List<Egresados> lstAlumnos;
    private List<Egresados> lstEgresados;

    @PostConstruct
    public void inicio() {
        dao = new EgresadosDao();
        try {
            listarEgresados();
        } catch (Exception ex) {
            Logger.getLogger(EgresadosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarAlumnos() throws Exception {
        try {
            lstAlumnos = dao.listarAlumnos();
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarEgresados() throws Exception {
        try {
            lstEgresados = dao.listarEgresados();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Egresados> getLstAlumnos() {
        return lstAlumnos;
    }

    public void setLstAlumnos(List<Egresados> lstAlumnos) {
        this.lstAlumnos = lstAlumnos;
    }

    public List<Egresados> getLstEgresados() {
        return lstEgresados;
    }

    public void setLstEgresados(List<Egresados> lstEgresados) {
        this.lstEgresados = lstEgresados;
    }

    public Egresados getEgre() {
        return egre;
    }

    public void setEgre(Egresados egre) {
        this.egre = egre;
    }

}
