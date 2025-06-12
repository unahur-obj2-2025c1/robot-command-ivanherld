package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;


import me.gonzager.commands.Tarea;


public class Robot {
    private Double bateria = 100.0;
    private List<Tarea> registroDeTareas = new ArrayList<>();

    public Double nivelDeBateria(){
        return bateria;
    }

    public void cargar(Double tiempoDeCarga){
        bateria = Math.min(100.0, bateria += (tiempoDeCarga / 60) * 0.8);
    }

    public Double getTiempoDeCargaCompleta(){
        return (100 - bateria)*(60/0.8);
    }
    public void encenderLuz(Habitacion habitacion){
        habitacion.setLuz(true);
    }

    public void consumoBateria(Integer bateriaConsumida){
        if(bateriaConsumida > this.bateria){
            throw new RuntimeException("La bateria no es lo suficiente para el consumo que se requiere");
        }else{
            bateria -= bateriaConsumida;
        }
    }

    public void apagarLuz(Habitacion habitacion){
        habitacion.setLuz(false);
    }

    public void limpiar(Habitacion habitacion){
        habitacion.limpia();
    }

    public Double promedioTiempoTareas(){

        if(registroDeTareas.size()>0){
           return registroDeTareas.stream().mapToDouble(t -> t.getDuracion()).average().orElse(0);
        }else{
            return 0.0;
        }
        
    }

}
