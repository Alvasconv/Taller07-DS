/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author vv
 */
public class DirectorProducto {
    
    public void makeProducto(BuilderProducto builderP){
        builderP.buildId();
        builderP.buildNombre();
        builderP.buildMarca();
        builderP.buildModelo();
        builderP.buildPeso();
        builderP.buildPrecio();
    }
}
