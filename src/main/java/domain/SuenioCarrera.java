package domain;

public class SuenioCarrera extends Suenio {

    private Carrera unaCarrera;


    public SuenioCarrera(double felicidadDada) {
        super(felicidadDada);
    }


    protected void verificarSiSePuedeCumplir(Persona unaPersona) {
        if (!unaPersona.teRecibisteDe(this.unaCarrera) && (unaPersona.queresEstudiarEstaCarrera(this.unaCarrera))){


            throw new miExcepcion();

        }
    }

    protected void concretarAccion(Persona unaPersona){

     unaPersona.recibirseDe(this.unaCarrera);

    }

}
