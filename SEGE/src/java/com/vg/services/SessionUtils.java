package com.vg.services;

import com.vg.model.Usuarios;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {

    public static HttpSession getSession() {
        return (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
    }

    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance()
                .getExternalContext().getRequest();
    }

    public static Usuarios getUserName() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(false);
        return (Usuarios) session.getAttribute("username");
    }

    public static Usuarios getUserId() {
        HttpSession session = getSession();
        if (session != null) {
            return (Usuarios) session.getAttribute("userid");
        } else {
            return null;
        }
    }
}
