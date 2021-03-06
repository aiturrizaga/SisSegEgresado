package com.vg.dao;

import com.vg.model.Empresas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpresasDao extends Dao{
    
    public void AgregarEmpresa(Empresas emp){
        this.Conexion();
        try {
          String sql = "INSERT INTO EMPRESA (COD_EMP,NOM_EMP,ENC_EMP,TELF1_EMP,TELF2_AMP,DIR_EMP,DOC_EMP,EST_EMP) values (?,?,?,?,?,?,?,?)";
          PreparedStatement ps = this.getCn().prepareCall(sql);
          ps.setString(1, emp.getCOD_EMP());
          ps.setString(2, emp.getNOM_EMP());
          ps.setString(3, emp.getENC_EMP());
          ps.setInt(4, emp.getTELF1_EMP());
          ps.setInt(5, emp.getTELF2_EMP());
          ps.setString(6, emp.getDIR_EMP());
          ps.setString(7, emp.getDOC_EMP());
          ps.setString(8,"A");
          ps.executeUpdate();
        } catch (SQLException e) {
        }
            
    
    }
    
    public List<Empresas> listarEmpresasActivas() throws Exception{
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
    public List<Empresas> listarEmpresasInactivas() throws Exception{
        List<Empresas> lista;
        ResultSet rs;
        try {
            this.Conexion();
            String sql = "SELECT * FROM EMPRESA WHERE EST_EMP = 'I'";
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
    public void habilitarEmpresa(Empresas ep) {
        this.Conexion();
        try {
            String  sql = "UPDATE EMPRESA SET EST_EMP = ? WHERE COD_EMP =?";
            PreparedStatement st= this.getCn().prepareCall(sql);
            st.setString(1,"A");
            st.setString(2,ep.getCOD_EMP());
            st.executeUpdate();
        } catch (SQLException e) {
        }
    
    }
}
