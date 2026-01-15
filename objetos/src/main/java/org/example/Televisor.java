package org.example;

public class Televisor {
    private int canal;
    private int volumen;

    public Televisor(int canal, int volumen){
        this.canal = canal;
        this.volumen = volumen;
    }
    public Televisor(){

    }
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public void subircanal(){
        if (canal == 100){
            canal=1;
        }else {
            canal=canal+1;
        }
    }
    public void bajarcanal(){
        if (canal == 0){
            canal=99;
        }else {
            canal=canal-1;
        }
    }
}
