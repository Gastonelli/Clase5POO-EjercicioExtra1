/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra1;

import Servicio.VehiculoService;
import ejercicioextra1.Entidad.Vehiculo;

/**
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
- Moverse: Es la cantidad de metros que avanzará por segundo.
- Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
más metros.
* 
Referencias:
- Un automóvil avanza 3 metros por segundo.
- Una motocicleta avanza 2 metros por segundo.
- Una bicicleta avanza 1 metro por segundo.

Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó.
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VehiculoService vs = new VehiculoService();
        
        Vehiculo v1 = vs.crearVehiculo();
        Vehiculo v2 = vs.crearVehiculo();
        Vehiculo v3 = vs.crearVehiculo();
        
        System.out.println("El vehiculo 1 avanzo " + vs.moverse(5,v1.getTipo()) + " metros en los primeros 5 segundos");
        System.out.println("El vehiculo 2 avanzo " + vs.moverse(5,v2.getTipo()) + " metros en los primeros 5 segundos");
        System.out.println("El vehiculo 3 avanzo " + vs.moverse(5,v3.getTipo()) + " metros en los primeros 5 segundos");
        
        System.out.println("El vehiculo 1 avanzo " + vs.moverse(10,v1.getTipo()) + " metros en los primeros 10 segundos");
        System.out.println("El vehiculo 2 avanzo " + vs.moverse(10,v2.getTipo()) + " metros en los primeros 10 segundos");
        System.out.println("El vehiculo 3 avanzo " + vs.moverse(10,v3.getTipo()) + " metros en los primeros 10 segundos");
        
        System.out.println("El vehiculo 1 avanzo " + vs.moverse(60,v1.getTipo()) + " metros en los primeros 60 segundos");
        System.out.println("El vehiculo 2 avanzo " + vs.moverse(60,v2.getTipo()) + " metros en los primeros 60 segundos");
        System.out.println("El vehiculo 3 avanzo " + vs.moverse(60,v3.getTipo()) + " metros en los primeros 60 segundos");
        
         System.out.println("El vehiculo 1 avanzo " + (vs.moverse(300,v1.getTipo())+vs.frenar(v1.getTipo())) + " metros 5 minutos + el frenado");
         System.out.println("El vehiculo 2 avanzo " + (vs.moverse(300,v2.getTipo())+vs.frenar(v2.getTipo())) + " metros 5 minutos + el frenado");
         System.out.println("El vehiculo 3 avanzo " + (vs.moverse(300,v3.getTipo())+vs.frenar(v3.getTipo())) + " metros 5 minutos + el frenado");
        System.out.println("El auto avanzo mas");
    }
    
}
