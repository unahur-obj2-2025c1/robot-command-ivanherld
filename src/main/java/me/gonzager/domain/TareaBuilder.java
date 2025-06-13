package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.ApagarLuz;
import me.gonzager.commands.Cargar;
import me.gonzager.commands.EncenderLuz;
import me.gonzager.commands.Info;
import me.gonzager.commands.Limpiar;
import me.gonzager.commands.Tarea;

public class TareaBuilder {

    List<Tarea> listaDeTareas = new ArrayList<>();

    public TareaBuilder carge(Double tiempo){
        listaDeTareas.add(new Cargar(tiempo));
        return this;
    }

    public TareaBuilder ligon(Habitacion habitacion){
        listaDeTareas.add(new EncenderLuz(habitacion));
        return this;
    }

    public TareaBuilder ligoff(Habitacion habitacion){
        listaDeTareas.add(new ApagarLuz(habitacion));
        return this;
    }

    public TareaBuilder clean(Habitacion habitacion){
        listaDeTareas.add(new Limpiar(habitacion));
        return this;
    }

    public TareaBuilder info(){
        listaDeTareas.add(new Info());
        return this;
    }

    public List<Tarea> build(){
        if (listaDeTareas.isEmpty())
            throw new RuntimeException("No se puede buildear tareas vacias.");
        return listaDeTareas;
    }
    
}
