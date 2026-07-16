package ui;


import data.GestorEntidades;
import data.GestorDatos;

import model.Guia;
import model.Embarcacion;
import model.AtractivoTuristico;
import model.Tour;
import model.Operador;

import exception.CapacidadInvalidaException;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();


        // CARGAR TOURS DESDE ARCHIVO TXT

        GestorDatos gestorDatos = new GestorDatos();

        ArrayList<Tour> tours = gestorDatos.cargarTours("src/resources/tours.txt");

        System.out.println("=== TOURS CARGADOS DESDE ARCHIVO TXT ===");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("----------------------------------------");


        // ASIGNAR GUÍA Y OPERADOR A UN TOUR

        if (!tours.isEmpty()) {

            Guia guiaAsignado = new Guia("Guía 1", "Turismo aventura");
            Operador operadorAsignado = new Operador("Operador 1");

            tours.get(0).setGuia(guiaAsignado);
            tours.get(0).setOperador(operadorAsignado);

            System.out.println("=== TOUR CON GUÍA Y OPERADOR ASIGNADOS ===");
            System.out.println(tours.get(0));
            System.out.println("----------------------------------------");
        }


        // BUSCAR TOUR POR NOMBRE

        String nombreBuscado = "Lago Llanquihue";

        System.out.println("=== BÚSQUEDA DE TOUR POR NOMBRE ===");

        for (Tour tour : tours) {
            if (tour.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println(tour);
            }
        }

        System.out.println("----------------------------------------");


        // FILTRAR TOURS POR PRECIO

        System.out.println("=== TOURS CON PRECIO MAYOR A 20000 ===");

        for (Tour tour : tours) {
            if (tour.getPrecio() > 20000) {
                System.out.println(tour);
            }
        }

        System.out.println("----------------------------------------");


        // INGRESAR GUÍA

        String nombreGuia = JOptionPane.showInputDialog(
                "Ingrese el nombre del guía:"
        );

        if (nombreGuia == null) {
            cerrarPrograma();
            return;
        }

        String especialidadGuia = JOptionPane.showInputDialog(
                "Ingrese la especialidad del guía:"
        );

        if (especialidadGuia == null) {
            cerrarPrograma();
            return;
        }

        Guia guia = new Guia(nombreGuia, especialidadGuia);

        gestor.agregarEntidad(guia);


        // INGRESAR EMBARCACIÓN

        String nombreEmbarcacion = JOptionPane.showInputDialog(
                "Ingrese el nombre de la embarcación:"
        );

        if (nombreEmbarcacion == null) {
            cerrarPrograma();
            return;
        }

        String tipoEmbarcacion = JOptionPane.showInputDialog(
                "Ingrese el tipo de embarcación:"
        );

        if (tipoEmbarcacion == null) {
            cerrarPrograma();
            return;
        }


        // VALIDAR CAPACIDAD CON TRY-CATCH Y EXCEPCIÓN PERSONALIZADA

        int capacidad = 0;
        boolean capacidadValida = false;

        while (!capacidadValida) {

            String entradaCapacidad = JOptionPane.showInputDialog(
                    "Ingrese la capacidad de la embarcación:"
            );

            if (entradaCapacidad == null) {
                cerrarPrograma();
                return;
            }

            try {

                capacidad = Integer.parseInt(entradaCapacidad);

                if (capacidad <= 0) {
                    throw new CapacidadInvalidaException(
                            "La capacidad debe ser mayor que 0."
                    );
                }

                capacidadValida = true;

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error: debe ingresar un número válido.",
                        "Error de entrada",
                        JOptionPane.ERROR_MESSAGE
                );

            } catch (CapacidadInvalidaException e) {

                JOptionPane.showMessageDialog(
                        null,
                        e.getMessage(),
                        "Dato inválido",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        }

        Embarcacion embarcacion = new Embarcacion(
                nombreEmbarcacion,
                tipoEmbarcacion,
                capacidad
        );

        gestor.agregarEntidad(embarcacion);


        // INGRESAR ATRACTIVO TURÍSTICO

        String nombreAtractivo = JOptionPane.showInputDialog(
                "Ingrese el nombre del atractivo turístico:"
        );

        if (nombreAtractivo == null) {
            cerrarPrograma();
            return;
        }

        String ubicacionAtractivo = JOptionPane.showInputDialog(
                "Ingrese la ubicación del atractivo turístico:"
        );

        if (ubicacionAtractivo == null) {
            cerrarPrograma();
            return;
        }

        String tipoAtractivo = JOptionPane.showInputDialog(
                "Ingrese el tipo del atractivo turístico:"
        );

        if (tipoAtractivo == null) {
            cerrarPrograma();
            return;
        }

        AtractivoTuristico atractivo = new AtractivoTuristico(
                nombreAtractivo,
                ubicacionAtractivo,
                tipoAtractivo
        );

        gestor.agregarEntidad(atractivo);


        // CREA RESUMEN FINAL

        String resumenFinal =
                "=== ENTIDADES REGISTRADAS ===\n\n" +

                        guia.mostrarResumen() +

                        "\n\n-------------------------\n\n" +

                        embarcacion.mostrarResumen() +

                        "\n\n-------------------------\n\n" +

                        atractivo.mostrarResumen();


        // MOSTRAR RESUMEN EN GUI

        JOptionPane.showMessageDialog(
                null,
                resumenFinal,
                "Resumen de entidades",
                JOptionPane.INFORMATION_MESSAGE
        );


        // MOSTRAR TAMBIÉN EN CONSOLA

        System.out.println("=== ENTIDADES REGISTRADAS ===");

        gestor.mostrarEntidades();
    }


    private static void cerrarPrograma() {

        JOptionPane.showMessageDialog(
                null,
                "Operación cancelada. El programa se cerrará.",
                "Programa finalizado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
