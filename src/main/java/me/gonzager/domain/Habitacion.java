package me.gonzager.domain;

public class Habitacion {
  
    private Double metrosCuadrados;
    private Boolean pisoLimpio = false;
    private Boolean luz = false;

    public void setLuz(Boolean estado){
        this.luz = estado;
    }

    public Boolean getLuz(){
        return luz;
    }

    public Habitacion(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void limpia(){
        this.pisoLimpio = true;
    }

    public Boolean pisoLimpio(){
        return pisoLimpio;
    }

    public Double getMetrosCuadrados(){
        return metrosCuadrados;
    }



}
