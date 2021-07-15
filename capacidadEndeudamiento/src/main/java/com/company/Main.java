package com.company;

import clases.CapacidadEndedudamiento;

import java.util.Scanner;

import static com.company.utils.messages.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ingMesuales;
        String gastosFijos;
        String gastosVariables;
        do {
            System.out.println(obtenerIngresosMesuales);
            ingMesuales = in.nextLine();
        }while (!isNumeric(ingMesuales));
        do {
            System.out.println(obtenerGastosFijos);
            gastosFijos = in.nextLine();
        }while (!isNumeric(gastosFijos));
        do {
            System.out.println(obtenerGastosVariables);
            gastosVariables = in.nextLine();
        }while (!isNumeric(gastosVariables));
        in.close();
        CapacidadEndedudamiento capEndeuda = new CapacidadEndedudamiento();
        capEndeuda.setIngresosTotales(Integer.parseInt(ingMesuales));
        capEndeuda.setGastosFijos(Integer.parseInt(gastosFijos));
        capEndeuda.setGastoVaribales(Integer.parseInt(gastosVariables));
        System.out.println(capEndeuda.getCapacidadEndeudamiento());
    }

    public static boolean isNumeric(String value) {
        try {
            Double.parseDouble(value);
            return true;
        }catch (Exception ex){
            System.out.println(error);
            return false;
        }
    }
}
