/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.reactiveparadigm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jufeq
 */
public class ReactiveParadigm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var option = "1";
        
        CustomObservable<String> customObservable = new CustomObservable<>();

        
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Enviar un objeto Persona");
            System.out.println("2. Enviar un objeto Vehiculo");
            option = scanner.next();

            if ("1".equals(option)) {
                System.out.println("Ingrese el nombre de la persona: ");
                var nombrePersona = scanner.next();
                customObservable = new CustomObservable<>(nombrePersona);
                
            } else if ("2".equals(option)) {
                System.out.println("Ingrese el nombre del vehículo: ");
                var nombreVehiculo = scanner.next();
                customObservable = new CustomObservable<>(nombreVehiculo);
            } else {
                System.out.println("Opción inválida. Saliendo...");
                break;
            }
        }

        // Suscribimos al Observable para recibir el objeto
        customObservable.subscribe(
            item -> System.out.println("Recibido: " + item),   // onNext
            error -> System.out.println("Error: " + error),    // onError
            () -> System.out.println("Completado")             // onComplete
        );
    }
}
