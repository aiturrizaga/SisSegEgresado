package com.vg.controller;

import com.vg.dao.UsuariosDao;
import com.vg.model.Usuarios;
import com.vg.services.Funciones;
import com.vg.services.SessionUtils;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "usuariosController")
@SessionScoped
public class UsuariosController implements Serializable {

    Usuarios users = new Usuarios();
    private String us;
    private String pass;

    public void iniciarSesion() {
        FacesContext contex = FacesContext.getCurrentInstance();
        UsuariosDao dao;
        try {
            dao = new UsuariosDao();
            String clave = Funciones.encriptar(pass);
            users = dao.validar(us, clave);
            if (users == null || users.getNombre().length() < 1) {     //si no existe...
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "Usuario/Contraseña incorrecto"));
            } else {
                HttpSession session = SessionUtils.getSession();
                session.setAttribute("username", users);
                switch (users.getNivel()) {
                    case "admin":
                        contex.getExternalContext().redirect("/SEGE/faces/view/content/dashboard.xhtml");
                        break;
                    case "user":
                        contex.getExternalContext().redirect("/SEGE/faces/view/content/profile.xhtml");
                        break;
                    default:    //Si no tiene privilegios niega el acceso
                        contex.getExternalContext().redirect("/SEGE/facesview/login.xhtml");
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "Usuario denegado"));
                        break;
                }
            }
        } catch (IOException e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error en metodo iniciarsesion", String.valueOf(e)));
        }
    }

    public Usuarios getUsers() {
        return users;
    }

    public void setUsers(Usuarios users) {
        this.users = users;
    }

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
