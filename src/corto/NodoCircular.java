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
public class NodoCircular extends Nodo {
    private Nodo _anterior;
    private boolean _cabeza;
    
    public NodoCircular (String valor){
        _anterior = null;
        _valor = valor;
        _siguiente = null;
        _cabeza = false;
    }

    public NodoCircular (String valor, Nodo siguiente, Nodo anterior, boolean cabeza){
        _valor = valor;
        _siguiente = siguiente;
        _anterior = anterior;
        _cabeza = cabeza;
    }
    
    public Nodo getAnterior(){
        return _anterior;
    }
    
    public boolean getCabeza(){
        return _cabeza;
    }
}
