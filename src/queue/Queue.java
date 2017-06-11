/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
/**
 *
 * @author Nano
 */
public class Queue {

    public static void main(String[] args) {
   
       DinamicQueue q = new DinamicQueue();

        System.out.println("Data masuk");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);

        System.out.println("Data Pertama Keluar " + q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(110);
        q.enqueue(111);
        q.enqueue(112);
        // data keluar satu persatu
        System.out.println("DATA ANTRIAN");
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }

    }
}
