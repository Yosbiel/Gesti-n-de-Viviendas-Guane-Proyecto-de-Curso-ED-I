/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yosbiel A
 */
public interface IList<E> {
    void add(E e);
    void add(E e, int index);
    E remove(int index);
    E get(int index);
    int size();
    void clear();
    boolean isEmpty();
}
