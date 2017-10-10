package com.vg.dao;

import com.vg.model.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersD extends Dao{

    public List<Users> listarUsuarios() throws Exception{
        List<Users> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM USUARIOS";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Users users;
            while(rs.next()){
                users = new Users();
                users.setCodUser(rs.getInt("COD_USER"));
                users.setNomUser(rs.getString("NOM_USER"));
                users.setPassUser(rs.getString("PASS_USER"));
                users.setNivelUser(rs.getString("NIVEL_USER"));
                lista.add(users);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
}
