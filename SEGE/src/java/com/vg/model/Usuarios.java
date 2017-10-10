package com.vg.model;

public class Usuarios {

    private int codigo;
    private String nombre;
    private String pass;
    private String nivel;
    
    private String Template = "Template.xhtml";

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTemplate() {
        return Template;
    }

    public void setTemplate(String Template) {
        this.Template = Template;
    }

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
