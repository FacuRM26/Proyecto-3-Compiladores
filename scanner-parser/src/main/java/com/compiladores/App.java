package com.compiladores;

import java_cup.runtime.Symbol;

import java.io.*;
import java.util.ArrayList;


public class App
{
    public static void main( String[] args ) throws Exception
    {
        String archivoFuente = "src/main/java/com/compiladores/fuente.txt";
        testParser(archivoFuente); // PRUEBA PARSER

    }


    public static void testParser(String archivoFuente) throws Exception {

        Reader reader = new BufferedReader(new FileReader(archivoFuente));
        Lexer lexer = new Lexer(reader);
        parser p = new parser(lexer);
        p.parse();
        //Escribir en archivo de codigo intermedio
       //MipsCode(p.getmipsCode());
    }

    public static void MipsCode(StringBuffer mipsCode) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/java/com/compiladores/mips.s"));

            escritor.write(mipsCode.toString());

            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}