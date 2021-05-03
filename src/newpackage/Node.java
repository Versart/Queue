/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author wesle
 */
public class Node<T> {
    private T data;
    private Node<T> prox;
    
    public Node(T data){
        this.data=data;
        this.prox=null;
    }
    public T getData(){
        return this.data;
    }
    public Node<T> getProx(){
        return this.prox;
    }
    public void setData(T data){
        this.data=data;
    }
    public void setProx(Node<T> prox){
        this.prox=prox;
    }
}
