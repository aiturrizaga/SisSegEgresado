package com.vg.dao;

import com.vg.model.Egresados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EgresadosDao extends Dao {

    public List<Egresados> listarAlumnos() throws Exception{
        List<Egresados> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM ALUMNOS WHERE EST_ALUM = 'A'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Egresados egre;
            while(rs.next()){
                egre = new Egresados();
                egre.setCodigo(rs.getInt("COD_ALUM"));
                egre.setNombre(rs.getString("NOM_ALUM"));
                egre.setApellido(rs.getString("APE_ALUM"));
                egre.setDni(rs.getInt("DNI_ALUM"));
                egre.setFing(rs.getDate("INGR_ALUM"));
                egre.setTipingr(rs.getString("INGR_ALUM"));
                egre.setCorreo(rs.getString("CORREO_ALUM"));
                egre.setTelf1(rs.getInt("TELF1_ALUM"));
                egre.setTelf2(rs.getInt("TELF2_ALUM"));
                egre.setEstado(rs.getString("EST_ALUM"));
                egre.setCarrera(rs.getString("CAR_ALUM"));
                lista.add(egre);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    
    public List<Egresados> listarEgresados() throws Exception{
        List<Egresados> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM ALUMNO WHERE EST_ALUM = 'A'";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Egresados egre;
            while(rs.next()){
                egre = new Egresados();
                egre.setCodigo(rs.getInt("COD_ALUM"));
                egre.setNombre(rs.getString("NOM_ALUM"));
                egre.setApellido(rs.getString("APE_ALUM"));
                egre.setDni(rs.getInt("DNI_ALUM"));
                egre.setFing(rs.getDate("FCH_NAC_ALUM"));
                egre.setTipingr(rs.getString("INGR_ALUM"));
                egre.setCorreo(rs.getString("CORREO_ALUM"));
                egre.setTelf1(rs.getInt("TELF1_ALUM"));
                egre.setTelf2(rs.getInt("TELF2_ALUM"));
                egre.setEstado(rs.getString("EST_ALUM"));
                egre.setCarrera(rs.getString("CAR_ALUM"));
                lista.add(egre);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    
}
