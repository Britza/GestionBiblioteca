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
public class Libros {
       private String  titulo;
       private String isbn;
       private String autor;
       private String genero;
       private String idioma;
       private int unidades;

   
    public Libros(String titulo, String isbn, String autor, String genero, String idioma, int unidades) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.genero = genero;
        this.idioma = idioma;
        this.unidades = unidades;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "titulo= " + titulo + ", isbn= " + isbn + ", autor= " + autor + ", genero= " + genero + ", idioma= " + idioma + ", unidades= " + unidades +"\n";
    }
    
    
    
}
