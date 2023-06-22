/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import ejercicioextra1.Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author gasto
 */
public class VehiculoService {

    public Vehiculo crearVehiculo() {
        Vehiculo v1 = new Vehiculo();
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Ingrese el tipo de vehiculo\n 1.Automovil \n 2.Motocicleta\n 3.Bicicleta");
            opcion = leer.nextInt();

        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
            case 1 ->
                v1.setTipo("Automovil");
            case 2 ->
                v1.setTipo("Motocicleta");
            case 3 ->
                v1.setTipo("Bicicleta");
        }
        
        leer.nextLine();
        
        System.out.println("Ingrese la marca del vehiculo");
        v1.setMarca(leer.nextLine());

        System.out.println("Ingrese el modelo del vehiculo");
        v1.setModelo(leer.nextLine());

        System.out.println("Ingrese el anio del vehiculo");
        v1.setAnio(leer.nextInt());

        return v1;
    }

    public int moverse(int tiempo, String tipo) {
        int recorrido = 0;
        switch (tipo) {
            case "Automovil" ->
                recorrido = 3 * tiempo;
            case "Motocicleta" ->
                recorrido = 2 * tiempo;
            case "Bicicleta" ->
                recorrido = tiempo;
        }
        return recorrido;
    }
    
    public int frenar(String tipo){
        if ((tipo.equals("Automovil"))||(tipo.equals("Motocicleta"))) {
            return 2;
        } else return 0;
    }

}
