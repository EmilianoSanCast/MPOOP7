/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mppop7;

/**
 *
 * @author USER
 */
public class Gerente extends Empleado{
    
    private float presupuesto;

    public Gerente() {
    }

    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    private void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void asignarPresupuesto(float presupuesto){
       setPresupuesto(presupuesto);
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Gerente{" + "presupuesto=" + presupuesto + '}';
    }


}
