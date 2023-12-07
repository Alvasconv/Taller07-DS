/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cykes.taller07.chainResponsibility;

/**
 *
 * @author Cykes
 */
public abstract class BaseHandler implements Handler {
    public Handler next;
    
    public void setNextHandler(Handler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public void handleRequest() {
        if (next != null) {
            next.handleRequest();
        }
    }
}

