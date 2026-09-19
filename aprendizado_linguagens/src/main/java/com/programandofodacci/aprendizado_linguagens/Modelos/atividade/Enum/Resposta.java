package com.programandofodacci.aprendizado_linguagens.Modelos.atividade.Enum;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author UltraLuminatio13
 */
public enum Resposta {
    SOMATORIO(1),
    CODIGO(2),
    ESCOLHA(3),
    MULTIPLA_ESCOLHA(4);

    private int id;
    
    private Resposta(int id) {
        this.id = id;
    }
    
    private static Resposta getEnum(int id) throws IllegalArgumentException{
        
        if(id == 1) return Resposta.SOMATORIO;
        else if(id==2) return Resposta.CODIGO;
        else if(id==3) return Resposta.ESCOLHA;
        else if(id==4) return Resposta.MULTIPLA_ESCOLHA;
        else throw new IllegalArgumentException("Enum invalido");
    }
    
    private static ArrayList<String> getTipoRetorno(int id) throws IllegalArgumentException, AssertionError {
        Resposta tipo = getEnum(id);
        switch (tipo) {
            case SOMATORIO -> {
                return new ArrayList<>(Arrays.asList("soma_total"));
            }
            case ESCOLHA ->{
                return new ArrayList<>(Arrays.asList("escolha_unitaria"));
            }
            case MULTIPLA_ESCOLHA->{
                return new ArrayList<>(Arrays.asList("escolha_array"));
            }
            case CODIGO->{
                return new ArrayList<>(Arrays.asList("codigo_completo"));
            }
            default->{
                throw new AssertionError("Enum inexistente");
            }
        }
    }
}
