package me.gonzager.commands;

import me.gonzager.domain.Robot;

public abstract class Tarea  {

    private Double duracion;

    public void setDuracion(Double duracion){
        this.duracion = duracion;
    }

    public Double getDuracion(){
        return duracion;
    }
    public void execute(Robot robot){
        doExecute(robot);
    }

    public abstract void doExecute(Robot robot);
    
}
