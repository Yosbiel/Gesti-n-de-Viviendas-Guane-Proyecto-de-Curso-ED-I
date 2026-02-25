/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yosbiel A
 */
public class DLinkedList<E> implements IList<E> {

    protected DNode<E> first;
    protected int size;

    public DLinkedList() {
        first = null;
        size = 0;
    }

    @Override
    public void add(E e) {
        DNode<E> node = new DNode<>(e);
        if (isEmpty()) {
            first = node;
        } else {
            DNode<E> cursor = first;
            while (cursor.getNext() != null) {
                cursor = (DNode<E>) cursor.getNext();
            }
            cursor.setNext(node);
            node.setPrev(cursor);
        }
        size++;
    }

    @Override
    public void add(E e, int index) {
        if (index >= 0 && index <= size) {
            DNode<E> node = new DNode<>(e);
            if (index == 0) {
                node.setNext(first);
                if (first != null) first.setPrev(node);
                first = node;
            } else {
                DNode<E> cursor = first;
                for (int i = 0; i < index - 1; i++) {
                    cursor = (DNode<E>) cursor.getNext();
                }
                node.setNext(cursor.getNext());
                node.setPrev(cursor);
                if (cursor.getNext() != null) {
                    ((DNode<E>) cursor.getNext()).setPrev(node);
                }
                cursor.setNext(node);
            }
            size++;
        }
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index < size) {
            DNode<E> aux;
            if (index == 0) {
                aux = first;
                first = (DNode<E>) first.getNext();
                if (first != null) first.setPrev(null);
            } else {
                DNode<E> cursor = first;
                for (int i = 0; i < index; i++) {
                    cursor = (DNode<E>) cursor.getNext();
                }
                aux = cursor;
                if (cursor.getPrev() != null)
                    cursor.getPrev().setNext(cursor.getNext());
                if (cursor.getNext() != null)
                    ((DNode<E>) cursor.getNext()).setPrev(cursor.getPrev());
            }
            size--;
            return aux.getInfo();
        }
        return null;
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            Node<E> cursor = first;
            for (int i = 0; i < index; i++) {
                cursor = cursor.getNext();
            }
            return cursor.getInfo();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}

