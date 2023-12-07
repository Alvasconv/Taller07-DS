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
public class BuilderTelevision implements BuilderProducto{
    
    private Television television;

    @Override
    public void buildId() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        television.setId(id);
    }

    @Override
    public void buildNombre() {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        television.setNombre(nombre);
    }

    @Override
    public void buildMarca() {
        Scanner sc = new Scanner(System.in);
        String marca = sc.nextLine();
        television.setMarca(marca);
    }

    @Override
    public void buildModelo() {
        Scanner sc = new Scanner(System.in);
        String modelo = sc.nextLine();
        television.setModelo(modelo);
    }

    @Override
    public void buildPeso() {
        Scanner sc = new Scanner(System.in);
        int peso = sc.nextInt();
        sc.nextLine();
        television.setPeso(peso);
    }

    @Override
    public void buildPrecio() {
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();
        sc.nextLine();
        television.setPrecio(precio);
    }
    
    public Television getProducto(){
        return this.television;
    }
}
