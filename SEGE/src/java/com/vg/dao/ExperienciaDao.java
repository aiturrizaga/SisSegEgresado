package com.vg.dao;

import com.vg.model.Experiencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExperienciaDao extends Dao {

    public List<Experiencia> listarExperiencia() throws Exception {
        List<Experiencia> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT \n"
                    + "\"PRACTICAS\".\"COD_PRAC\" as \"Codigo\",\n"
                    + "\"ALUMNO\".\"NOM_ALUM\" as \"Nombre\",\n"
                    + "\"ALUMNO\".\"APE_ALUM\" as \"Apellido\",\n"
                    + "\"ALUMNO\".\"DNI_ALUM\" as \"DNI\",\n"
                    + "\"EMPRESA\".\"NOM_EMP\" as \"Empresa\",\n"
                    + "\"PRACTICAS\".\"FCH_INI_PRAC\" as \"F.IniPrac\",\n"
                    + "\"PRACTICAS\".\"FCH_FIN_PRAC\" as \"F.FinPrac\"	\n"
                    + "FROM \"PRACTICAS\" \n"
                    + "	INNER JOIN \"ALUMNO\" ON \n"
                    + "	 \"PRACTICAS\".\"COD_ALUM\" = \"ALUMNO\".\"COD_ALUM\" \n"
                    + "	INNER JOIN \"EMPRESA\" ON \n"
                    + "	 \"PRACTICAS\".\"COD_EMP\" = \"EMPRESA\".\"COD_EMP\" \n"
                    + "     ORDER BY \"PRACTICAS\".COD_PRAC";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Experiencia egre;
            while (rs.next()) {
                egre = new Experiencia();
                egre.setCodigo(rs.getString("Codigo"));
                egre.setNombre(rs.getString("Nombre"));
                egre.setApellido(rs.getString("Apellido"));
                egre.setDNI(rs.getString("DNI"));
                egre.setEmpresa(rs.getString("Empresa"));
                egre.setFIniPrac(rs.getDate("F.IniPrac"));
                egre.setFFinPrac(rs.getDate("F.FinPrac"));
                lista.add(egre);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }

}
