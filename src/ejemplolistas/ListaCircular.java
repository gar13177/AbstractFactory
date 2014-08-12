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
public class ListaCircular<T> extends Lista {

    @Override
    public void Agregar(Object valor) {
        NodoCircular<T> _newNodo = new NodoCircular(valor);

       
        if (Cabeza == null){
            Cabeza = _newNodo;
            NodoActual = Cabeza;
            _newNodo.setCabeza(true);
            
        }
        else{
            NodoActual.setSiguiente(_newNodo);
            _newNodo.setAnterior(NodoActual);
            NodoActual = _newNodo;
            

        }
    }

    public Nodo Eliminar(Object valor) {
        NodoCircular temp1;
        NodoCircular temp2;
        NodoCircular temp3;
        NodoCircular eliminado = null;
        
        temp1 = (NodoCircular)Cabeza;
        temp2 = (NodoCircular)Cabeza.getSiguiente();
        
        if (Cabeza.getValor()==valor){
            Cabeza = Cabeza.getSiguiente();
            ((NodoDoble)Cabeza).setAnterior(null);
        }else{
            while (true){
                if (temp2.getValor()==valor){
                    temp1.setSiguiente(temp2.getSiguiente());
                    temp3 = (NodoCircular)temp2.getSiguiente();
                    temp3.setAnterior(temp2.getAnterior());
                    eliminado = temp2;
                    break;
                }else if(temp2.getValor()==null){
                    break;
                }
                temp1 = temp2;
                temp2 = (NodoCircular)temp2.getSiguiente();
            }
            
        } 
        return eliminado;
    }
    
    
}
