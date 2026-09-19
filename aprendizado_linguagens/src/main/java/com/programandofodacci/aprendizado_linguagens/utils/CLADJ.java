package com.programandofodacci.aprendizado_linguagens.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
/**
 *
 * @author Ultra Luminatio 13
 */
public class CLADJ {
    private static Gson gson;
    
    
    public static <T extends Object> T getClasse(String json, Class<T> classe){
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
    
    public static String toJson(Object objeto){
        try{
            gson = new GsonBuilder().setPrettyPrinting().create();
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
   