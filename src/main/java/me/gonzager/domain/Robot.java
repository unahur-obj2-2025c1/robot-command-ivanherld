package me.gonzager.domain;

import java.util.List;


import me.gonzager.commands.Tarea;


public class Robot {
    private Double bateria = 100.0;

    public Robot(Double bateria) {
        this.bateria = bateria;
    }

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

    public void consumoBateria(Double bateriaConsumida){
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

    public Double promedioTiempoTareas(List<Tarea> registroDeTareas){
        if(registroDeTareas.size()>0){
           return registroDeTareas.stream().mapToDouble(t -> t.getDuracion()).average().orElse(0);
        }else{
            return 0.0;
        }
    }

    public void run(List<Tarea> listaDeTareas){
        listaDeTareas.stream().forEach(t -> t.execute(this));
    }

    public void informar(List<Tarea> listaDeTareas){
        System.out.println("El tiempo promedio de tareas es: " + this.promedioTiempoTareas(listaDeTareas));
    }

    public void reset(){
        bateria = 100.0;
    }
}
