package domain;

public class SuenioSueldo extends Suenio {

    private double unSueldo;


    public SuenioSueldo(double felicidadDada) {
        super(felicidadDada);
    }


    protected void verificarSiSePuedeCumplir(Persona unaPersona) {

        /*conseguir un trabajo donde la plata que se gana es menos de lo que quiere ganar no es correcto*/
        if (!(unaPersona.cuantoVasACobrar() >=  unSueldo)){


            throw new miExcepcion();

        }
    }

    @Override
    protected void concretarAccion(Persona unaPersona) {

    }

}