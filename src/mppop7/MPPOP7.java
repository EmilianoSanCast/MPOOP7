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
public class MPPOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger1 = new Gerente();
        ger1.setNombre("Raul");
        ger1.setNumEmpleado(9876);
        ger1.setSueldo(15000);
        System.out.println(ger1);
        ger1.asignarPresupuesto(100000);
        System.out.println(ger1);
        System.out.println("Presupuesto: "+ ger1.getPresupuesto());
        
        System.out.println("##########################");
        
        Gerente ger2 = new Gerente(500000,"Julieta",15,30000);
        System.out.println(ger2);
        ger2.aumentarSueldo(10);
        System.out.println(ger2);
        
        System.out.println("###################");
        
        Gerente ger3 = new Gerente();
        if(ger3 instanceof Gerente){
            System.out.println("es una instancia de Gerente");
        }if(ger3 instanceof Empleado){
            System.out.println("es una instancia de empleado");
        }else{
            System.out.println("no es una instancia de empleado");
        }if(ger3 instanceof Object){
            System.out.println("Si es una instancia de object");   
        }else{
            System.out.println("No es una instancia de object");
        }
            }
}
