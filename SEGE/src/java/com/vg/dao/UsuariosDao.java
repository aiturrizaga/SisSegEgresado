package com.vg.dao;

import com.vg.model.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuariosDao extends Dao {

    public Usuarios validar(String us, String pass) {
        this.Conexion();
        Usuarios users = new Usuarios();
        try {
            ResultSet rs;
            String sql = "SELECT * FROM USUARIOS WHERE NOM_USER like ? AND PASS_USER like ?";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, us);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            rs.next();
            users.setCodigo(rs.getInt("COD_USER"));
            users.setNombre(rs.getString("NOM_USER"));
            users.setPass(rs.getString("PASS_USER"));
            users.setNivel(rs.getString("NIVEL_USER"));
            switch (users.getNivel()) {
                case "admin":
                    users.setTemplate("TemplateAdmin.xhtml");
                    break;
                case "user":
                    users.setTemplate("TemplateUser.xhtml");
                    break;
            }
            return users;
        } catch (SQLException e) {
            return null;
        }
    }
}
