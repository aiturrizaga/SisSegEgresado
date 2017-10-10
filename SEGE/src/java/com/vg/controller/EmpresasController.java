package com.vg.controller;

import com.vg.dao.EgresadosDao;
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
    private List<Empresas> lstEmpresa;
    
    @PostConstruct
    public void inicio() {
        dao = new EmpresasDao();
        try {
            listarEmpresa();
        } catch (Exception e) {
        }
            
    }
     
    public void listarEmpresa() throws Exception{
        try {
            lstEmpresa = dao.listarEmpresas();
        } catch (Exception e) {
            throw  e;
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

    public List<Empresas> getLstEmpresa() {
        return lstEmpresa;
    }

    public void setLstEmpresa(List<Empresas> lstEmpresa) {
        this.lstEmpresa = lstEmpresa;
    }
    
}
