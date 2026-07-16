package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        this.servicios = new ArrayList<>();
    }

    public void cargarServicios() {
        servicios.add(new RutaGastronomica("Sabores del Sur", 4, 5));
        servicios.add(new RutaGastronomica("Ruta Tradiciones", 3, 4));
        servicios.add(new PaseoLacustre("Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Lago Todos los Santos", 3, "Lancha"));
        servicios.add(new ExcursionCultural("Patrimonio Chilote", 5, "Iglesia de Castro"));
    }

    public void mostrarServicios() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}