/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yosbiel A
 */
public class LinkedQueue<X> implements Queue<X> {

    private Node<X> first;
    private Node<X> last;

    public LinkedQueue() {
        first = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void add(X item) {
        Node<X> n = new Node<>(item);
        if (isEmpty()) {
            first = last = n;
        } else {
            last.setNext(n);
            last = n;
        }
    }

    @Override
    public X peek() {
        return isEmpty() ? null : first.getInfo();
    }

    @Override
    public X poll() {
        if (isEmpty()) return null;
        X item = first.getInfo();
        first = first.getNext();
        return item;
    }
}

