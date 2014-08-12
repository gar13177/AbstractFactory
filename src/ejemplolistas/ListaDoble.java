/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplolistas;

/**
 *
 * @author Oscar
 * @param <T>
 */
public class ListaDoble<T> extends Lista{

    public ListaDoble() {
        NodoActual = Cabeza;
    }

    @Override
    public void Agregar(Object valor) {
        
        NodoDoble<T> _newNodo = new NodoDoble(valor);

        

        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            _newNodo.setAnterior(NodoActual);
            NodoActual = _newNodo;

        }
    }    

    @Override
    public Nodo Eliminar(Object valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
