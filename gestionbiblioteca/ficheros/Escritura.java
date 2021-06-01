/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca.ficheros;

/**
 *
 * @author Usuario
 */
import gestionbiblioteca.librosPrestados.LibrosPrestados;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class Escritura {
    
 
    public static File escribirObxetos(String nomeFich, ArrayList<LibrosPrestados>lista){
        File fi;
        PrintWriter escribir = null;
        fi= new File(nomeFich+".txt");
        try {
            escribir=new PrintWriter(fi); //Abrimos fluxo do ficherio
            for (LibrosPrestados per:lista)
                escribir.print(per); //Se escribe o numero seguido de un coma
        } catch (FileNotFoundException ex){
            System.out.println("erro escribirNumeros "+ex.toString());
        }finally {
            escribir.close(); //Pecho o ficheiro
        }
        return fi;
    }
   /* public static void engadir(String nomeFich){
        PrintWriter f=null;
        File fich;
        try {
            FileWriter engadir= new FileWriter(new File(nomeFich+".txt"),true);//True para engadir ao final do ficheiro
            f= new PrintWriter(engadir);
            LibrosPrestados lib = new LibrosPrestados(JOptionPane.showInputDialog("nome :"),Integer.parseInt(JOptionPane.showInputDialog("nota :")),JOptionPane.showInputDialog("dni :"));
            f.println(lib);// como no toString();
        }catch (IOException ex){
            System.out.println("erro "+ex.getMessage());
        }
        f.close();
    }
*/
   public static  void BorrarFichero(String nomeFich){
       File fi;
       fi= new File(nomeFich+".txt");

     try {
         /*Si existe el fichero*/
         if(fi.exists()){
           /*Borra el fichero*/  
           fi.delete(); 
           System.out.println("Fichero Borrado con Exito");
         }
     } catch (Exception ex) {
         /*Captura un posible error y le imprime en pantalla*/ 
          System.out.println(ex.getMessage());
     }
} 
}
