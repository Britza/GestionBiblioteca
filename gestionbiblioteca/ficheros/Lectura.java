/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca.ficheros;

import gestionbiblioteca.librosPrestados.LibrosPrestados;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lectura {
    
    public static void lerLibros(String nomeFicheiro){
        File fich;
        Scanner sc=null;
        String linea;
        ArrayList<LibrosPrestados> prestamos=new ArrayList<>();
        fich= new File(nomeFicheiro+".txt");
        try {
            sc=new Scanner(fich);
            while (sc.hasNextLine()){
                linea=sc.nextLine();
                String[]listaLibros=linea.split(",");
                LibrosPrestados lib= new LibrosPrestados(listaLibros[0], listaLibros[1], listaLibros[2],listaLibros[3],listaLibros[4],listaLibros[5]);
                prestamos.add(lib);
            }
        }catch (FileNotFoundException ex){
            System.out.println("erro lectura  "+ex.toString());
        }finally {
            sc.close();
        }
        for (int i=0;i< prestamos.size();i++){
            System.out.println(prestamos.get(i));
        }
    }
    
}
