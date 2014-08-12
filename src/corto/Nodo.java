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
public class Nodo {
    protected Nodo _siguiente;
    protected String _valor;
    
    public String getValor(){
        return _valor;
    }
    
    public void setValor(String valor){
        _valor = valor;
    }
    
    public Nodo getSiguiente(){
        return _siguiente;
    }
    
    public void setSiguiente(Nodo siguiente){
        _siguiente = siguiente;
    }
    
    
    /*
    public <T> T getNodo(T thing){
        T t;
        if (thing instanceof String){
            t = (T)"String";
        }else if (thing instanceof Integer){
            t = (T)Integer.valueOf(1);
        }else if (thing instanceof Character){
            t = (T)"a";
        }else{
            t = (T)Floating(1);
        }
        
        return t;
    }*/
    
}
