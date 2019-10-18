package domain;

public abstract class Suenio {


    private boolean cumplido;
    private double felicidadDada;


    public Suenio(double felicidadDada) {
        this.cumplido = false;
        this.felicidadDada = felicidadDada;
    }

    protected abstract void verificarSiSePuedeCumplir (Persona unaPersona);

    public void darFelicidad (Persona unaPersona){

        unaPersona.addFelicidonios(this.felicidadDada);

    }

    public double getFelicidadDada() {

        return felicidadDada;

    }

    protected void cumplite(){

        this.cumplido = true;

    }

    protected abstract void concretarAccion(Persona unaPersona);

    public void serCumplido(Persona unaPersona){

        if (!cumplido ) {

            verificarSiSePuedeCumplir(unaPersona);

            concretarAccion(unaPersona);

            darFelicidad(unaPersona);

            this.cumplido = true;



        }
    }



}
