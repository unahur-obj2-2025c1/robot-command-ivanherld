package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Cargar extends Tarea {

    private Double tiempoDeCarga;

    public Cargar(Double tiempo){
        this.tiempoDeCarga = tiempo;
    }


    @Override
    public void doExecute(Robot robot) {
        Double tiempoACargaCompleta = robot.getTiempoDeCargaCompleta();
        if(tiempoDeCarga > tiempoACargaCompleta){
            tiempoDeCarga = tiempoACargaCompleta;
        }
        robot.cargar(tiempoDeCarga);
        this.setDuracion(tiempoDeCarga);
    }
    
}
