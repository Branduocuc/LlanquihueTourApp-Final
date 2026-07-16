package model;

public class Embarcacion implements Registrable {

    private String nombre;
    private String tipo;
    private int capacidad;

    public Embarcacion(String nombre, String tipo, int capacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String mostrarResumen() {
        return "Embarcación: " + nombre +
                "\nTipo: " + tipo +
                "\nCapacidad: " + capacidad + " personas";
    }


    @Override
    public String toString() {
        return "Embarcacion{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }




}