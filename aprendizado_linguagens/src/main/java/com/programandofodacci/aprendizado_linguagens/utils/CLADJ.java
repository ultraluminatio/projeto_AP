package com.programandofodacci.aprendizado_linguagens.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

/**
 * <h1><strong>Criação, Leitura, Alteração, Deletação de Json</strong></h1>
 * <p>Essa classe tem como um objetivo de ler, alterar, criar e deletar Strings em formatos JSON</p>
 * @version 0.0.1
 * 
 * @see Gson
 * @see GsonBuilder
 * @see JsonSyntaxException
 * 
 * 
 * 
 * @author Ultra Luminatio 13
 */
public class CLADJ {
    private static Gson gson;
    
    
    public <T extends Object> T getClasse(String json, Class<T> classe){
        try{
            gson = new GsonBuilder().create();
            T saida = new Gson().fromJson(json, classe);
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    
    public String toJson(Object objeto){
        try{
            gson = new GsonBuilder().
                    setPrettyPrinting().
                    excludeFieldsWithoutExposeAnnotation().
                    create();
            String saida = gson.toJson(objeto, objeto.getClass());
            
            gson = null;
            return saida;
        }
        catch(JsonSyntaxException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        return null;
    }
    
}
   