package com.programandofodacci.aprendizado_linguagens.Modelos.atividade;

import com.programandofodacci.aprendizado_linguagens.Modelos.atividade.Enum.Resposta;

/**
 *
 * @author UltraLuminatio13
 */
public abstract class Questao {
    private String enunciado;
    private Resposta resposta;

    
    //Getters
    public String getEnunciado() {
        return enunciado;
    }
    public Resposta getResposta() {
        return resposta;
    }
    
    //Setters
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }
    
    public abstract boolean confirmarEntrada();
}
