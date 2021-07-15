package clases;

import static com.company.utils.messages.obtenerCapacidadEndeudamiento;

public class CapacidadEndedudamiento {

    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVaribales;
    final double POR_FIJO = 0.35;

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastoVaribales;
    }

    public void setGastoVaribales(Integer gastoVaribales) {
        this.gastoVaribales = gastoVaribales;
    }

    public double getPOR_FIJO() {
        return POR_FIJO;
    }

    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public String getCapacidadEndeudamiento() {
        double capacidadEndeudamiento = (ingresosTotales - (gastosFijos + gastoVaribales)) * POR_FIJO;
        return obtenerCapacidadEndeudamiento + capacidadEndeudamiento;
    }
}
