package domain;

import java.util.List;

public class SuenioMultiple extends Suenio {

    private List<Suenio> suenios;


    public SuenioMultiple(double felicidadDada) {
        super(felicidadDada);
    }




    protected void verificarSiSePuedeCumplir(Persona unaPersona) {

        /*Si alguno de los 3 no se pueden cumplir debería tirar error y no cumplir ninguno,*/
        this.suenios.forEach(s -> s.verificarSiSePuedeCumplir(unaPersona));

    }

    @Override
    protected void concretarAccion(Persona unaPersona) {

        this.suenios.stream().mapToDouble(s -> s.getFelicidadDada()).sum();

        this.suenios.forEach(s -> s.concretarAccion(unaPersona));

    }

}