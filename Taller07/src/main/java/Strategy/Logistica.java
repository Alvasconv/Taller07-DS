/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author Fiorella Quijano
 */
public class Logistica {
    private Estrategia estrategiaDistribucion;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategiaDistribucion = estrategia;
    }

    public void ejecutarDistribucion() {
        if (estrategiaDistribucion != null) {
            estrategiaDistribucion.ejecutarDistribucion();
        } else {
            System.out.println("No se ha establecido ninguna estrategia de distribución");
        }
    }
}
