/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yosbiel A
 */
public class LinkedStack<X> implements IStack<X> {

    private Node<X> top;

    public LinkedStack() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void Push(X item) {
        Node<X> n = new Node<>(item);
        n.setNext(top);
        top = n;
    }

    @Override
    public X Top() {
        return isEmpty() ? null : top.getInfo();
    }

    @Override
    public X Pop() {
        if (isEmpty()) return null;
        X aux = top.getInfo();
        top = top.getNext();
        return aux;
    }
}

