package com.programandofodacci.aprendizado_linguagens.Modelos.atividade;

import com.programandofodacci.aprendizado_linguagens.Modelos.atividade.Enum.Resposta;

/**
 *
 * @author UltraLuminatio
 */
public class QuestaoSomatorio extends Questao {
    
    private int resultado;
    
    //Construtores
    public QuestaoSomatorio(String enunciado, Resposta resposta, int resultado) {
        super(enunciado, resposta);
        this.resultado = resultado; 
    }
    
    

    
    
    //Override
    @Override
    public boolean confirmarEntrada(String entrada) {
        
        return false;
    }
    
    
}
