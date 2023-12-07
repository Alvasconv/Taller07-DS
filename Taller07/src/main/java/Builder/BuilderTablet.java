/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import java.util.Scanner;

/**
 *
 * @author vv
 */
public class BuilderTablet implements BuilderProducto{
    
    private Tablet tablet;

    @Override
    public void buildId() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        tablet.setId(id);
    }

    @Override
    public void buildNombre() {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        tablet.setNombre(nombre);
    }

    @Override
    public void buildMarca() {
        Scanner sc = new Scanner(System.in);
        String marca = sc.nextLine();
        tablet.setMarca(marca);
    }

    @Override
    public void buildModelo() {
        Scanner sc = new Scanner(System.in);
        String modelo = sc.nextLine();
        tablet.setModelo(modelo);
    }

    @Override
    public void buildPeso() {
        Scanner sc = new Scanner(System.in);
        int peso = sc.nextInt();
        sc.nextLine();
        tablet.setPeso(peso);
    }

    @Override
    public void buildPrecio() {
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();
        sc.nextLine();
        tablet.setPrecio(precio);
    }
    
    public Tablet getProducto(){
        return this.tablet;
    }
    
}
