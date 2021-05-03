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
public class Queue<T> {
    private Node<T> first;
    private Node<T> last;
    private int quantity;
    
    public Queue(){
        this.first=null;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void insert(T data){
        Node<T> newNode=new Node(data);
        if(this.first==null){
             this.first=newNode;
             this.last=newNode;
             this.quantity++;
        }    
        else{
            this.last.setProx(newNode);
            this.last=newNode;
            this.quantity++;
        }
    }
    public void printQueue(){
        if(first!=null){
            Node<T> aux=this.first;
            int i=1;
            do{
                if(i<this.quantity)
                    System.out.print(aux.getData()+"-");
                else
                     System.out.print(aux.getData());
                aux=aux.getProx();
                i++;
            }while(aux!=null);
            System.out.println();
        }
        else
            System.out.println("Empty Queue");
    }
    public Node<T> remove(){
        if(first!=null){
            Node<T> aux=this.first;
            this.first=this.first.getProx();
            this.quantity--;
            return aux;
        }
        else{
            System.out.println("Empty Queue");
            return null;
        }
            
    }
    public int elementsquantity(){
        
        return this.quantity;
    }
    public void printFirst(){
        if(this.first!=null)
            System.out.println(this.first.getData());
        else
            System.out.println("Empty Queue");
    }
}
