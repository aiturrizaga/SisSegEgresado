package com.vg.controller;

import com.vg.dao.ExperienciaDao;
import com.vg.model.Experiencia;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.primefaces.model.TreeNode;

@Named(value = "experienciaController")
@SessionScoped
public class ExperienciaController implements Serializable {
    
    Experiencia exp = new Experiencia();
    ExperienciaDao dao;
    private List<Experiencia> lstExperiencia;
    private TreeNode Experiencia;
    
    @PostConstruct
    public void inicio() {
        dao = new ExperienciaDao();
        try {
            listarExperiencia();
        } catch (Exception ex) {
            Logger.getLogger(ExperienciaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarExperiencia() throws Exception {
        try {
            lstExperiencia =   dao.listarExperiencia();
        } catch (Exception e) {
            throw e;
        }
    }

    public TreeNode getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(TreeNode Experiencia) {
        this.Experiencia = Experiencia;
    }
    
    
    public Experiencia getExp() {
        return exp;
    }

    public void setExp(Experiencia exp) {
        this.exp = exp;
    }

    public ExperienciaDao getDao() {
        return dao;
    }

    public void setDao(ExperienciaDao dao) {
        this.dao = dao;
    }

    public List<Experiencia> getLstExperiencia() {
        return lstExperiencia;
    }

    public void setLstExperiencia(List<Experiencia> lstExperiencia) {
        this.lstExperiencia = lstExperiencia;
    }
    
    
}
