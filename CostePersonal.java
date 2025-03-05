public class CostePersonal {

    static float CosteDelPersonal(Trabajador[] trabajadores) {
        float costeFinal = 0;

        for (int i = 0; i < trabajadores.length; i++) {
            Trabajador trabajador = trabajadores[i];
            costeFinal += calcularCosteTrabajador(trabajador);
        }
        return costeFinal;
    }

    // Método auxiliar para calcular el coste del trabajador
    private static float calcularCosteTrabajador(Trabajador trabajador) {
        if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR || trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
            return trabajador.getNomina();
        } else {
            return trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
        }
    }
}
