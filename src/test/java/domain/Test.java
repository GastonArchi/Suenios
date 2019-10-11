package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GatoTest {
    private Persona gaston;
    private SuenioSueldo elSuenio;

    @Before
    public void init(){
        this.gaston = new Persona(20, 15000, 0,90);
        this.elSuenio = new SuenioSueldo();
    }

    @Test
    public void gastonSueñaYCumple(){

        gaston.cumplirSuenio();

        public void concretar(Cliente unCliente, Empleado unEmpleado){

            throw new YaConcretadoExceptio();
        }

        public boolean estaconcretado(){return true;}



        Assert.assertEquals(2, this.gary.cantidadDeVisitas());
        Assert.assertEquals(354, this.gary.metrosRecorridos());
    }
}