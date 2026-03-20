package com.mx.ux.Unidad2.SensorHeterogeneo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SensorIA> percepcionHub = new ArrayList<>();

        percepcionHub.add(new SensorLidar());
        percepcionHub.add(new SensorVision());
        percepcionHub.add(new SensorUltrasonido());

        System.out.println("Central de datos");

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }
    }
}
