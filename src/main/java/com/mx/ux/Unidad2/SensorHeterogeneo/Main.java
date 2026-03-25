package com.mx.ux.Unidad2.SensorHeterogeneo;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<SensorIA> percepcionHub = new ArrayList<>();

        SensorLidar obj1 = new SensorLidar("1.1", 1.50);
        SensorLidar obj2 = new SensorLidar("1.2", 1.55);
        SensorVision obj3 = new SensorVision("1.3", 1.60);
        SensorVision obj4 = new SensorVision("1.4", 1.65);
        SensorUltrasonido obj5 = new SensorUltrasonido("1.5", 1.70);
        SensorUltrasonido obj6 = new SensorUltrasonido("1.6", 1.75);

        percepcionHub.add(obj1);
        percepcionHub.add(obj2);
        percepcionHub.add(obj3);
        percepcionHub.add(obj4);
        percepcionHub.add(obj5);
        percepcionHub.add(obj6);

        System.out.println("Central de datos");

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }
    }
}
