/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca.librosPrestados;

/**
 *
 * @author Usuario
 */
public class LibrosPrestados extends Biblioteca {
    
    
    private String fechaPrestamo;
 
    private String codigo;

    public LibrosPrestados() {
    }

   
    public LibrosPrestados(String fechaPrestamo, String codigo, Libros libros, Socios socios) {
        super(libros, socios);
        this.fechaPrestamo = fechaPrestamo;
        this.codigo = codigo;
    }

  

   

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

   
   public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString()+ "fechaPrestamo= " + fechaPrestamo + ", codigo=" + codigo +"\n" ;
    }


   

}