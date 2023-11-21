package test;

import herencia.*;

import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        
        //Crear empleados 
        Employee empleado1 = new Employee(10000, "Harry");
        System.out.println(empleado1);
        Employee empleado2 = new Employee(10100, "Mafe");
        System.out.println(empleado2);
        
        Employee empleado3 = new Employee(10000, "Juanito");
        System.out.println(empleado3);
        
         
    }
}
