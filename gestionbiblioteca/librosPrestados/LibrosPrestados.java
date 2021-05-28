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
    
    private String  titulo;
    private String isbn; //Clave primaria
    private String fechaPrestamo;
    private String nombre;
    private String apellidos;
    private String dni;

    public LibrosPrestados() {
    }

    public LibrosPrestados(String titulo, String isbn,  String fechaPrestamo, String nombre,String apellidos, String dni) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.fechaPrestamo = fechaPrestamo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        
    }

   

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "titulo= " + titulo  + ", ISBN=" + isbn + ", fecha del prestamo= " + fechaPrestamo + 
                ", nombre = " +nombre+ ", apellidos = " +apellidos+ ", dni = "+dni;

    }
    
}
