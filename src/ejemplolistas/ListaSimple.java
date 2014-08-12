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
public class ListaSimple<T> extends Lista{

    @Override
    public void Agregar(Object valor) {


        NodoSimple<T> _newNodo = new NodoSimple(valor);

        

        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            NodoActual = _newNodo;

        }
        
    }

    @Override
    public Nodo Eliminar(Object valor) {
        Nodo temp1;
        Nodo temp2;
        Nodo eliminado = null;
        
        temp1 = Cabeza;
        temp2 = Cabeza.getSiguiente();
        
        if (Cabeza.getValor()==valor){
            Cabeza = Cabeza.getSiguiente();
        }else{
            while (true){
                if (temp2.getValor()==valor){
                    temp1.setSiguiente(temp2.getSiguiente());
                    eliminado = temp2;
                    break;
                }else if(temp2.getSiguiente()==null){
                    break;
                }
                temp1 = temp2;
                temp2 = temp2.getSiguiente();
            }
            
        } 
        return eliminado;
    }

    
}
