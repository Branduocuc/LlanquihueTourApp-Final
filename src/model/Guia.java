package model;

public class Guia implements Registrable {

    private String nombre;
    private String especialidad;

    public Guia(String nombre) {
        this.nombre = nombre;
    }

    public Guia(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String mostrarResumen() {
        return "Guía: " + nombre +
                "\nEspecialidad: " + especialidad;
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }



}