package com.mx.ux.Unidad1.AgenteIA;

public class DronExplorador extends AgenteIA{
        public DronExplorador(int energia){
            super(energia);
        }

    @Override
    public void moverse(){
        System.out.println("El agente se esta moviendo en coordenadas 3D");
    }
}

