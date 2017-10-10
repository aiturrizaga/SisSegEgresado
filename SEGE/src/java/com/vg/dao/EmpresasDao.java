package com.vg.dao;

import com.vg.model.Empresas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpresasDao extends Dao{
    
    public List<Empresas> listarEmpresas() throws Exception{
        List<Empresas> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM EMPRESA WHERE EST_EMP = 'A'";
            PreparedStatement ps = this.getCn().prepareCall(sql);
            rs = ps.executeQuery();
            lista = new ArrayList();
            Empresas egre;
            while(rs.next()){
                egre = new Empresas();
                egre.setCOD_EMP(rs.getString("COD_EMP"));
                egre.setNOM_EMP(rs.getString("NOM_EMP"));
                egre.setENC_EMP(rs.getString("ENC_EMP"));
                egre.setTELF1_EMP(rs.getInt("TELF1_EMP"));
                egre.setDIR_EMP(rs.getString("DIR_EMP"));
                egre.setDOC_EMP(rs.getString("DOC_EMP"));
                egre.setDPTO_EMP(rs.getString("DPTO_EMP"));
                egre.setPROV_EMP(rs.getString("PROV_EMP"));
                egre.setDIS_EMP(rs.getString("DIS_EMP"));
                lista.add(egre);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lista;
    }
    
    public void DeshabilitarEmpresa(Empresas ep) {
        this.Conexion();
        try {
            String  sql = "UPDATE EMPRESA SET EST_EMP = ? WHERE COD_EMP =?";
            PreparedStatement st= this.getCn().prepareCall(sql);
            st.setString(1,"I");
            st.setString(2,ep.getCOD_EMP());
            st.executeUpdate();
        } catch (SQLException e) {
        }
    
    }
    
}
