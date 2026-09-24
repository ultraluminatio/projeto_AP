package com.programandofodacci.aprendizado_linguagens.Modelos;

import com.google.gson.annotations.Expose;
import com.programandofodacci.aprendizado_linguagens.Modelos.atividade.Questao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ultra Luminatio 13
 */
public class Atividade implements Serializable{
    @Expose private static final long serialVersionUID = 1L; 
    
    private int[] id_atividade;
    private ArrayList<Questao> questoes = new ArrayList<>();
    private int pontuacao;
    
    //Construtores
    public Atividade(int[] id_atividade , int pontuacao) {
        this.id_atividade = id_atividade;
        this.pontuacao = pontuacao;
    }
    public Atividade(List<Integer> id_atividade , int pontuacao) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
    }
    public Atividade(ArrayList<Integer> id_atividade , int pontuacao) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
    }
    
    public Atividade(int[] id_atividade , int pontuacao, Questao[] questoes) {
        this.id_atividade = id_atividade;
        this.questoes = new ArrayList(Arrays.asList(questoes));
        this.pontuacao = pontuacao;
    }
    public Atividade(List<Integer> id_atividade , int pontuacao, Questao[] questoes) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
        this.questoes = new ArrayList(Arrays.asList(questoes));
    }
    public Atividade(ArrayList<Integer> id_atividade , int pontuacao, Questao[] questoes) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
        this.questoes = new ArrayList(Arrays.asList(questoes));
    }
    
    public Atividade(int[] id_atividade , int pontuacao, List<Questao> questoes) {
        this.id_atividade = id_atividade;
        this.questoes = new ArrayList(Arrays.asList(questoes));
        this.pontuacao = pontuacao;
    }
    public Atividade(List<Integer> id_atividade , int pontuacao, List<Questao> questoes) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
        this.questoes = new ArrayList(Arrays.asList(questoes));
    }
    public Atividade(ArrayList<Integer> id_atividade , int pontuacao, List<Questao> questoes) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
        this.questoes = new ArrayList(Arrays.asList(questoes));
    }
    
    public Atividade(int[] id_atividade , int pontuacao, ArrayList<Questao> questoes) {
        this.id_atividade = id_atividade;
        this.questoes = questoes;
        this.pontuacao = pontuacao;
    }
    public Atividade(List<Integer> id_atividade , int pontuacao, ArrayList<Questao> questoes) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
        this.pontuacao = pontuacao;
    }
    public Atividade(ArrayList<Integer> id_atividade , int pontuacao, ArrayList<Questao> questoes) {
        this.id_atividade = new int[id_atividade.size()];
        int i = 0;
        for(int valor: id_atividade){
            this.id_atividade[i] = valor;
            i++;
        }
        this.pontuacao = pontuacao;
        this.pontuacao = pontuacao;
    }
    
    //Getters
    public ArrayList<Questao> getQuestoesAL(){
        return this.questoes;
    }
    public List<Questao> getQuestoesL(){
        return Arrays.asList((Questao[])questoes.toArray());
    }
    public Questao[] getQuetoesV(){
        return (Questao[])questoes.toArray();
    }
    public int getPontuacao() {
        return pontuacao;
    }
    
    
    
    private Questao getQuestao(int local_questao){
        if(local_questao <= 0 || local_questao > questoes.size()-1) throw new IllegalArgumentException("Fora do alcance essa questao");
        return this.questoes.get(local_questao);
    }
}
