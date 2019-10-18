package domain;

import java.util.List;

public class Persona {

    private double edad;
    private List<Carrera> carrerasTerminadas;
    private List<Carrera> carrerasQueQuieroEstudiar;
    private double sueldoPorCobrar;
    private List<Lugar> lugaresVisitados;
    private double hijosBiologicos;
    private double hijosAdoptados;
    private List<Suenio> sueniosPendientes;
    private List<Suenio> sueniosCumplidos;
    private double felicidonios;

    public Persona(double edad, double sueldoPorCobrar, double hijosBiologicos, double felicidonios) {
        this.edad = edad;
        this.sueldoPorCobrar = sueldoPorCobrar;
        this.hijosBiologicos = hijosBiologicos;
        this.felicidonios = felicidonios;
    }

    public void agregarsuenio(Suenio unSuenio){

        this.sueniosPendientes.add(unSuenio);


    }

    public void addFelicidonios(double felicidonios){

        this.felicidonios =+ felicidonios;

    }

    public boolean teRecibisteDe (Carrera unaCarrera){

        return this.carrerasTerminadas.contains(unaCarrera);

    }

    public boolean queresEstudiarEstaCarrera(Carrera unaCarrera){

        return this.carrerasQueQuieroEstudiar.contains(unaCarrera);

    }




    public void recibirseDe(Carrera unaCarrera){

        carrerasTerminadas.add(unaCarrera);

    }

    public void tenerHijo(double hijosQueQuieroTener){}


    public void visitar(Lugar unLugar){

        lugaresVisitados.add(unLugar);

    }

    public void adoptar(double hijosQueQuieroAdoptar){

        this.hijosAdoptados += hijosQueQuieroAdoptar;


    }

    public void cumplirSuenio(Suenio unSuenio){

        unSuenio.serCumplido(this);

        this.sueniosCumplidos.add(unSuenio);

        this.sueniosPendientes.remove(unSuenio);

    }


    public double cuantoVasACobrar() {

        return this.sueldoPorCobrar;

    }

    public boolean tenesHijosBiologicos() {

        return this.hijosBiologicos > 0;



    }

    public boolean tenesHijosAdoptados() {

        return this.hijosAdoptados > 0;

    }
}
