package data;

import model.Registrable;
import model.Guia;
import model.Embarcacion;
import model.AtractivoTuristico;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        this.entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public void mostrarEntidades() {

        for (Registrable entidad : entidades) {

            System.out.println(entidad.mostrarResumen());

            if (entidad instanceof Guia) {
                System.out.println("Tipo de entidad: Guía");

            } else if (entidad instanceof Embarcacion) {
                System.out.println("Tipo de entidad: Embarcación");

            } else if (entidad instanceof AtractivoTuristico) {
                System.out.println("Tipo de entidad: Atractivo turístico");
            }

            System.out.println("-------------------------");
        }
    }
}