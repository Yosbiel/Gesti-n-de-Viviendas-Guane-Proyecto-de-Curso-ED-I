/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto;

/**
 *
 * @author Yosbiel A
 */
public interface IStack<X> {
    void Push(X item);
    X Top();
    X Pop();
    boolean isEmpty();
}

