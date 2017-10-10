package com.vg.controller;

import com.vg.dao.EmpresasDao;
import com.vg.model.Empresas;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;

@Named(value = "empresasController")
@SessionScoped
public class EmpresasController implements Serializable {
    
    Empresas emp = new Empresas();
    EmpresasDao dao;
    private Empresas selecteddes;
    private Empresas selectedac;
    private List<Empresas> lstEmpresaactiva;
    private List<Empresas> lstEmpresainactiva;
    
    @PostConstruct
    public void inicio() {
        dao = new EmpresasDao();
        try {
            listarEmpresaAciva();
            listarEmpresaAInactiva();
        } catch (Exception e) {
        }
            
    }
     
    public void listarEmpresaAciva() throws Exception{
        try {
            lstEmpresaactiva = dao.listarEmpresasActivas();
        } catch (Exception e) {
            throw  e;
        }
    
    }
    public void listarEmpresaAInactiva() throws Exception{
        try {
            lstEmpresainactiva = dao.listarEmpresasInactivas();
        } catch (Exception e) {
            throw  e;
        }
    
    }
    
    public void desabilitarEmpresa(){
        try {
           dao.DeshabilitarEmpresa(selecteddes);
           listarEmpresaAciva();
           listarEmpresaAInactiva();
        } catch (Exception e) {
        }
    }
    public void habilitarEmpresa(){
        try {
           dao.habilitarEmpresa(selectedac);
           listarEmpresaAciva();
           listarEmpresaAInactiva();
        } catch (Exception e) {
        }
    }
    
    public Empresas getEmp() {
        return emp;
    }

    public void setEmp(Empresas emp) {
        this.emp = emp;
    }

    public EmpresasDao getDao() {
        return dao;
    }

    public void setDao(EmpresasDao dao) {
        this.dao = dao;
    }

    public List<Empresas> getLstEmpresaactiva() {
        return lstEmpresaactiva;
    }

    public void setLstEmpresaactiva(List<Empresas> lstEmpresaactiva) {
        this.lstEmpresaactiva = lstEmpresaactiva;
    }

    public List<Empresas> getLstEmpresainactiva() {
        return lstEmpresainactiva;
    }

    public void setLstEmpresainactiva(List<Empresas> lstEmpresainactiva) {
        this.lstEmpresainactiva = lstEmpresainactiva;
    }

    public Empresas getSelecteddes() {
        return selecteddes;
    }

    public void setSelecteddes(Empresas selecteddes) {
        this.selecteddes = selecteddes;
    }

    public Empresas getSelectedac() {
        return selectedac;
    }

    public void setSelectedac(Empresas selectedac) {
        this.selectedac = selectedac;
    }

   
    
}
