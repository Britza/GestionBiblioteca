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
public class Socios  {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String direccion;
    private String telefono;

    public Socios() {
    }

    public Socios(String nombre, String apellidos, String dni, String email, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + ", apellidos= " + apellidos + ", dni= " + dni + ", email= " + email + ", direccion= " + direccion + ", telefono= " + telefono +"\n";
    }
    
    
    
}
