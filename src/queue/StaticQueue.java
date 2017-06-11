package queue;

public class StaticQueue {

    private int[] elemen; // tempat mengisi data antrian
    private int rear;
    private int front;
    private int size; 

    public StaticQueue() {
    }

    public StaticQueue(int ukuran) { 
        elemen = new int[ukuran];
        rear = 0;
        front = 0;
        size = 0;
    }

    public boolean enqueue(int data) {
        try {
            if(size<elemen.length){
            elemen[rear] = data;
            size++;
            if (rear < elemen.length - 1) {
                rear++;
            } else {
                rear = 0;
            }
            return true; //proses input berjalan normal
        }else{
                System.out.println("Maaf, Queue sudah penuh");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public int dequeue() {
        if(!isEmpty()){
        int keluar = elemen[front]; //artinya yang keluar
        size--;
        if (front<elemen.length-1){
        front++;}
        else{
            front =0;
        }
        return keluar;
    }else{
            System.out.println("Maaf, Queue sudah penuh");
            return 0;
        }
    
}
    public int size() {
        return this.size;
    }

    public boolean isEmpty() { //cek kosong atau tidak
        if (this.size() == 0) { // apakah kosong tidak ada antrian
            return true;
        }
        return false;
    }
}
