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
public class NodoDoble extends Nodo {
    
    private Nodo _anterior;
    
    public NodoDoble (String valor){
        _anterior = null;
        _valor = valor;
        _siguiente = null;
    }

    public NodoDoble (String valor, Nodo siguiente, Nodo anterior){
        _valor = valor;
        _siguiente = siguiente;
        _anterior = anterior;
    }
    
    public Nodo getAnterior(){
        return _anterior;
    }
}
