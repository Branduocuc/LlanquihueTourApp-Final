package model;

public class Tour {

    private String nombre;
    private String tipo;
    private int precio;


    private Guia guia;
    private Operador operador;



public Tour(String nombre, String tipo, int precio ) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.precio = precio;
}

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
    return tipo;
    }

    public int getPrecio() {
    return precio;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    public void setTipo(String tipo) {
    this.tipo = tipo;
    }

    public void setPrecio(int precio) {
    this.precio = precio;
    }


    public Guia getGuia() {
    return guia;
    }
    public void setGuia(Guia guia) {
    this.guia = guia;
    }

    public Operador getOperador() {
    return operador;
    }
    public void setOperador(Operador operador) {
    this.operador = operador;
    }


    @Override
    public String toString() {

        String textoGuia;
        String textoOperador;

        if (guia == null) {
            textoGuia = "Sin guía asignado";
        } else {
            textoGuia = guia.toString();
        }

        if (operador == null) {
            textoOperador = "Sin operador asignado";
        } else {
            textoOperador = operador.toString();
        }

        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", guia=" + textoGuia +
                ", operador=" + textoOperador +
                '}';
    }



}
