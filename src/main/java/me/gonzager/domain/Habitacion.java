package me.gonzager.domain;

public class Habitacion {
  
    private Integer metrosCuadrados;
    private Boolean pisoLimpio = false;
    private Boolean luz = false;

    public void setLuz(Boolean estado){
        this.luz = estado;
    }

    public Boolean getLuz(){
        return luz;
    }

    public void limpia(){
        this.pisoLimpio = true;
    }

    public Boolean pisoLimpio(){
        return pisoLimpio;
    }

    public Integer getMetrosCuadrados(){
        return metrosCuadrados;
    }



}
