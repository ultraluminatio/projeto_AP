package com.programandofodacci.aprendizado_linguagens.Modelos;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author UltraLuminatio
 */
public class Usuario implements Serializable{
    @Expose private static final long serialVersionUID = 2L;
    
    @SerializedName(value = "nome_usuario") private String nome;
    @SerializedName(value = "email_usuario") private String email;
    @SerializedName(value = "xp_usuario") private double xp;
    @SerializedName(value = "telefone_usuario") private String telefone;
    @SerializedName(value = "aniversario_usuario") private String data_nascimento;
    
    //Construtores
    public Usuario(String nome, String email, String telefone, String data_nascimento) {
        this.nome = nome;
        this.email = email;
        this.xp = 0;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }
    
    
    //Getters
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public double getXp() {
        return xp;
    }
    public String getTelefone() {
        return telefone;
    }
    public long getLevel(){
        long level = 0;
        long max_xp_level = 100;
        
        while(this.xp >= max_xp_level){
            level += 1;
            max_xp_level += (long) (max_xp_level + (max_xp_level*0.15));
        }
        
        return level;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Funções extras
    public void addXp(double xp){
        this.xp += xp;
    }
}
