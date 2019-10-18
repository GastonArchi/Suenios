package domain;

public class SuenioAdoptar extends Suenio {

    private double hijosQueQuieroAdoptar;


    public SuenioAdoptar(double felicidadDada) {
        super(felicidadDada);
    }


    protected void verificarSiSePuedeCumplir(Persona unaPersona) {

        /*si uno tiene un hijo biologico no se puede adoptar (así lo pidió el usuario)*/

        if (unaPersona.tenesHijosBiologicos()){


            throw new miExcepcion();

        }
    }

    protected void concretarAccion(Persona unaPersona){

        unaPersona.adoptar(this.hijosQueQuieroAdoptar);

    }

}