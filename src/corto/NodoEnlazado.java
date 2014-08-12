/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corto;

/**
 *
 * @author Kevin
 */
public class NodoEnlazado extends Nodo {    
        
    public NodoEnlazado(String valor){
        _valor = valor;
        _siguiente = null;
    }

    public NodoEnlazado(String valor, Nodo siguiente){
        _valor = valor;
        _siguiente = siguiente;
    }
}
