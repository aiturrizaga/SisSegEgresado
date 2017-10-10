package com.vg.controller;

import com.vg.dao.UsersD;
import com.vg.model.Users;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named(value = "usersController")
@Dependent
public class UsersController implements Serializable{

    Users users = new Users();
    UsersD dao = new UsersD();
    private List<Users> lstUsers;
    
    @PostConstruct
    public void inicio(){
        try {
            listarUsers();
        } catch (Exception e) {
        }
    }
    
    public void listarUsers() throws Exception{
        try {
            lstUsers = dao.listarUsuarios();
        } catch (Exception e) {
            throw e;
        }
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersD getDao() {
        return dao;
    }

    public void setDao(UsersD dao) {
        this.dao = dao;
    }

    public List<Users> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(List<Users> lstUsers) {
        this.lstUsers = lstUsers;
    }
    
    
}
