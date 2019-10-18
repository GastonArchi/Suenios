package domain;

public class SuenioTenerHijos extends Suenio {

    private double hijosQueQuieroTener;


    public SuenioTenerHijos(double felicidadDada) {
        super(felicidadDada);
    }


    protected void verificarSiSePuedeCumplir(Persona unaPersona) {

        /*si uno tiene un hijo adoptado no se puede tenerHijos (así lo pidió el usuario)*/

        if (unaPersona.tenesHijosAdoptados()){


            throw new miExcepcion();

        }
    }

    protected void concretarAccion(Persona unaPersona){

        unaPersona.tenerHijo(this.hijosQueQuieroTener);

    }

}