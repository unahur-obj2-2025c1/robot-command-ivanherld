package me.gonzager.commands;

import java.util.List;

import me.gonzager.domain.Robot;

public class Info extends Tarea {

    private List<Tarea> listaDeTareas;

    public Info(List<Tarea> listaDeTareas){
        this.listaDeTareas = listaDeTareas;
    }

    @Override
    public void doExecute(Robot robot) {
        robot.informar(listaDeTareas);
        robot.consumoBateria(10.0);
        this.setDuracion(15.0);
    }


}
