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
public class Biblioteca {
    
    private Libros libros;
    private Socios socios;

    public Biblioteca() {
    }
    
    

    public Biblioteca(Libros libros, Socios socios) {
        this.libros = libros;
        this.socios = socios;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Socios getSocios() {
        return socios;
    }

    public void setSocios(Socios socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return  "libro= " + libros + "Socio= " + socios ;
    }
    
    
    
}
