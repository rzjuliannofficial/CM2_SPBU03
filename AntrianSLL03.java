public class AntrianSLL03 {
    Node03 head;
    Node03 tail;
    int size;
    public AntrianSLL03() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void add(Kendaraan03 input){
        Node03 newNode = new Node03(input, null); //membuat objek newNode dengan menggunakan class node03 dengan paramater input, dan null
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;  
        }

        Node03 current = head;
        System.out.println("Daftar Antrian Kendaraan:");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Plat Nomor", "Tipe", "Merk" , "warna");
        System.out.println("--------------------------------------");
        while (current != null) {
            current.kendaraan.tampilkanInformasi();
            current = current.next;
        }
        System.out.println();
    }

    public void getSize() {
        System.out.println("Jumlah Antrian: " + size);
    }

    Kendaraan03 layani() {
        if (isEmpty()) {
            return null;
        } else {
            Node03 temp = head;
            head = head.next; 
            size--;
            return temp.kendaraan; 
        }
    }
}
