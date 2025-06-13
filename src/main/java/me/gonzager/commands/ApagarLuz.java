package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class ApagarLuz extends Tarea {

    private Habitacion habitacion;
    
     public ApagarLuz(Habitacion habitacion){
        this.habitacion = habitacion; 
    }

    @Override
    public void doExecute(Robot robot) {
        if (!habitacion.getLuz()){
            robot.consumoBateria(1.0);
            this.setDuracion(25.0);
        }else{
            robot.apagarLuz(habitacion);
            robot.consumoBateria(5.0);
            this.setDuracion(90.0);
        }    
    }
}
