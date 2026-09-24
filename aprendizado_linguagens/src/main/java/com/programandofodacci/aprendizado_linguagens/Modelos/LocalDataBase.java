package com.programandofodacci.aprendizado_linguagens.Modelos;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author UltraLuminatio
 */
public class LocalDataBase implements Serializable{
    @Expose private static final long serialVersionUID = 3L; 

    
    private String password;
    private String bd_nome;
    private String url;
    private String user;

    //Contrutores
    public LocalDataBase(String password, String url, String user, String nome_banco){
        this.bd_nome = nome_banco;
        this.password = password;
        this.url = url;
        this.user = user;
    }
    
    
    //Getters
    public String getPassword() {
        return password;
    }
    public String getBd_nome() {
        return bd_nome;
    }
    public String getUrl() {
        return url;
    }
    public String getUser() {
        return user;
    }
    public Connection getConnection(){
        try(Connection conn = DriverManager.getConnection(url, user, password)){
            return conn;
        }
        catch(SQLException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return null;
        }
    }
    
    //Setters
    public void setPassword(String password) {
        this.password = password;
    }
    public void setBd_nome(String bd_nome) {
        this.bd_nome = bd_nome;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setUser(String user) {
        this.user = user;
    }
    
    //Funções extras
    public String query(String sql){
        try{
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            return """
                {
                   "mensage" : "Query com sucesso",
                   "query" : """+ps.execute()+"""
                }
                   """;
        }
        catch(NullPointerException | SQLException e){
            return "{\"error\":\"Não foi possivel executar a query\"}";
        }
        finally{
        }
        
    }

}
