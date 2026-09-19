package com.programandofodacci.aprendizado_linguagens.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 *
 * @author UltraLuminatio
 */
//Criação, Leitura, Alteração, Deletação de Arquivo

/**
 * <h1><strong>Criação, Leitura, Alteração, Deletação de Arquivo</strong></h1>
 * <p>Essa classe tem como um objetivo de ler, alterar, criar e deletar arquivos do projeto</p>
 * @version 0.0.2
 * 
 * @see BufferedReader
 * @see FileReader
 * @see IOException
 * @see ArrayList
 * 
 * 
 * 
 * @author Ultra Luminatio 13
 */
public class CLADA {
    public static String lerArquivos(String local){
        String conteudo = "";
        try(BufferedReader br = new BufferedReader(new FileReader(local))) {
            String linha = br.readLine();
            conteudo += linha;
            while(linha != null){
                linha = br.readLine();
                conteudo += linha;
            }
        } 
        catch (IOException e) {
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }

        return conteudo;
    }
    
    public static ArrayList<String> lerLinhas(String local){
        ArrayList<String> linhas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(local))) {
            String linha = br.readLine();
            linhas.add(linha);
            while(linha != null){
                linha = br.readLine();
                linhas.add(linha);
            }
            
            return linhas;
        } 
        catch (IOException e) {
            //TODO: Adicionar uma classe para armazenar algumas exceptions
        }
        
        return null;
    }
    
    public static boolean criarArquivoPequeno(String local){
        Path caminho = Paths.get(local);
        try{
            Files.createFile(caminho);
            return true;
        }
        catch(FileAlreadyExistsException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public static boolean editarArquivoPequeno(String local, String conteudo){
        Path caminho = Paths.get(local);
        try{
            Files.write(caminho, conteudo.getBytes());
            return true;
        }
        catch(FileAlreadyExistsException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    public static boolean editarArquivoPequeno(String local, String conteudo, StandardOpenOption configuracao){
        Path caminho = Paths.get(local);
        try{
            Files.write(caminho, conteudo.getBytes(), configuracao);
            return true;
        }
        catch(FileAlreadyExistsException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
    private static boolean editarAqruivoGrande(String local, String conteudo){
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(local))){
            bw.write(conteudo);
            return true;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    private static boolean editarAqruivoGrande(String local, String conteudo, StandardOpenOption configuracao){
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(local), configuracao)){
            bw.write(conteudo);
            return true;
        }
        catch(IOException e){
            //TODO: Adicionar uma classe para armazenar algumas exceptions
            return false;
        }
    }
    
}
