package domain;

import java.util.List;

public class Persona {

    private int edad;
    private List<Carrera> carrerasTerminadas;
    private double sueldo;
    private List<Lugar> lugaresVisitados;
    private int hijos;
    private List<Suenios> sueniosPendientes;
    private List<Suenios> sueniosCumplidos;
    private double felicidonios;

    public Persona(int edad, double sueldo, int hijos, double felicidonios) {
        this.edad = edad;
        this.sueldo = sueldo;
        this.hijos = hijos;
        this.felicidonios = felicidonios;
    }

    public void soniar(){


    }

    public void recibirseDe(){}
    public void conseguirTrabajo(){}
    public void tenerHijo(){}
    public void visitar(){}
    public void adoptar(){}
    public void cumplirSuenio(){}

}
