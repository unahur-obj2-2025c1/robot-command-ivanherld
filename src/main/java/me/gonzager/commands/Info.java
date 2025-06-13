package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Info extends Tarea {

    @Override
    public void doExecute(Robot robot) {
        robot.informar();
        robot.consumoBateria(10.0);
        this.setDuracion(15.0);
    }


}
