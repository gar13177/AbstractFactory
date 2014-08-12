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
        NodoDoble temp1;
        NodoDoble temp2;
        NodoDoble temp3;
        NodoDoble eliminado = null;
        
        temp1 = (NodoDoble)Cabeza;
        temp2 = (NodoDoble)Cabeza.getSiguiente();
        
        if (Cabeza.getValor()==valor){
            Cabeza = Cabeza.getSiguiente();
            ((NodoDoble)Cabeza).setAnterior(null);
        }else{
            while (true){
                if (temp2.getValor()==valor){
                    temp1.setSiguiente(temp2.getSiguiente());
                    temp3 = (NodoDoble)temp2.getSiguiente();
                    temp3.setAnterior(temp2.getAnterior());
                    eliminado = temp2;
                    break;
                }else if(temp2.getValor()==null){
                    break;
                }
                temp1 = temp2;
                temp2 = (NodoDoble)temp2.getSiguiente();
            }
            
        } 
        return eliminado;
    }
    
}
