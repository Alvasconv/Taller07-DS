package Decorator;

public abstract class BaseDecorator implements Producto {

    public BaseDecorator(Producto p);

    @Override
    public String obtenerDescripcion() {
    return "algo";
    }

    @Override
    public double obtenerPrecio(){
        return 0.0;
    }
    
}
