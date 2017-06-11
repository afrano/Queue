/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;

/**
 *
 * @author Nano
 */
public class DinamicQueue {
    private LinkedList antrian;

    public DinamicQueue() {
        antrian = new LinkedList();
    }
    public void enqueue(int data){
        antrian.addLast(data);
    }
    public int dequeue(){
        return (int)antrian.removeFirst();
    }
    public int size(){
        return antrian.size();
    }
    public boolean isEmpty(){
        return antrian.isEmpty();
    }
}
