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
    private Empresas selected;
    private List<Empresas> lstEmpresaactiva;
    private List<Empresas> lstEmpresainactiva;
    
    @PostConstruct
    public void inicio() {
        dao = new EmpresasDao();
        try {
            listarEmpresaAciva();
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
           dao.DeshabilitarEmpresa(selected);
           listarEmpresaAciva();
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

    

    public Empresas getSelected() {
        return selected;
    }

    public void setSelected(Empresas selected) {
        this.selected = selected;
    }
    
}
