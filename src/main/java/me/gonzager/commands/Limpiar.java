package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Limpiar extends Tarea {

    private Habitacion habitacion;
    
     public Limpiar(Habitacion habitacion){
        this.habitacion = habitacion; 
    }

    @Override
    public void doExecute(Robot robot) {
        habitacion.limpia();
        Double metrosCuadrados = habitacion.getMetrosCuadrados();
        robot.consumoBateria(5 * metrosCuadrados);
        this.setDuracion(180 * metrosCuadrados );
    }
    

}
