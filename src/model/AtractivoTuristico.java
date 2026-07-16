package model;

public class AtractivoTuristico implements Registrable {

    private String nombre;
    private String ubicacion;
    private String tipo;

    public AtractivoTuristico(String nombre, String ubicacion, String tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




    @Override
    public String mostrarResumen() {
        return "Atractivo turístico: " + nombre +
                "\nUbicación: " + ubicacion +
                "\nTipo: " + tipo;
    }


    @Override
    public String toString() {
        return "AtractivoTuristico{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}