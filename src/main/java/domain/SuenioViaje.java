package domain;

public class SuenioViaje extends Suenio {

    private Lugar unLugar;


    public SuenioViaje(double felicidadDada) {
        super(felicidadDada);
    }


    protected void verificarSiSePuedeCumplir(Persona unaPersona) {

    }

    protected void concretarAccion(Persona unaPersona){

        unaPersona.visitar(this.unLugar);

    }

}
