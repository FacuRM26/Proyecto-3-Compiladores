package com.compiladores;

import java_cup.runtime.Symbol;

import java.io.*;
import java.util.ArrayList;


public class App
{
    public static String nombreArchivo;
    public static void main( String[] args ) throws Exception
    {
        String archivoFuente = "src/main/java/com/compiladores/fuente.txt";
        String [] nombreArchivo1 = archivoFuente.split("/");
        nombreArchivo = nombreArchivo1[nombreArchivo1.length-1];
        nombreArchivo = nombreArchivo.replace(".txt","");
        testParser(archivoFuente); //Llamada a la funcion que ejecuta el parser

    }


    public static void testParser(String archivoFuente) throws Exception {

        Reader reader = new BufferedReader(new FileReader(archivoFuente));
        Lexer lexer = new Lexer(reader);
        //semanticoFun(lexer);
        //intermedioFun(lexer);
        mipsCodeFun(lexer);

    }
    public static void semanticoFun(Lexer lexer) throws Exception { //Funcion que ejecuta el parser
        semantico seman = new semantico(lexer);
        seman.parse();
    }

    public static void intermedioFun(Lexer lexer) throws Exception {
        Intermedio inter = new Intermedio(lexer);
        inter.parse();
        //Escribir en archivo de codigo intermedio
        intermediateCode(inter.getIntermediateCode());
    }

    public static void mipsCodeFun(Lexer lexer) throws Exception {
        parser mips = new parser(lexer);
        mips.parse();
        //Escribir en archivo de codigo MIPS
        MipsCode(mips.getmipsCode());
    }
    public static void MipsCode(StringBuffer mipsCode) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/java/com/compiladores/"+nombreArchivo+".s"));

            escritor.write(mipsCode.toString());

            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void intermediateCode(StringBuffer intermediateCode) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/java/com/compiladores/Intermedio.txt"));

            escritor.write(intermediateCode.toString());

            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}