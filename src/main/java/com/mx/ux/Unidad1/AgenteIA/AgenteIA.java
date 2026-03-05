package com.mx.ux.Unidad1.AgenteIA;

public class AgenteIA {
    int energia;

    public AgenteIA(int energia){
        this.energia = energia;
    }


    public void moverse(){
        System.out.println("El agente se esta moviendo");
    }

    public static void main(String[] args) {
        AgenteIA dron = new DronExplorador(100);
        AgenteIA dron2 = new RobotTerrestre(82);
        dron.moverse();
        dron2.moverse();
    }
}


