package org.example;

public class Libro {
    private static final int cantidadDeLibros = 0;
    private static final int librisDisponibles = 0;
    private static final boolean Disponibles = true;
    private String titulo;
    private String autor;
    private String ID;

    public Libro (String titulo, String autor, String ID){
        this.titulo = titulo;
        this.autor = autor;
        this.ID = ID;
    }
    public Libro(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
