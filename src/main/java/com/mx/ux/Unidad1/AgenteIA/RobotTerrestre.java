package com.mx.ux.Unidad1.AgenteIA;

public class RobotTerrestre extends AgenteIA{
        public RobotTerrestre(int energia){
            super(energia);
        }

    @Override
    public void moverse(){
        System.out.println("El agente se esta moviendo en coordenadas 2D");
    }
}
