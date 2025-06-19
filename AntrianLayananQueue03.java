public class AntrianLayananQueue03 {
    TransaksiPengisian03[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayananQueue03(int max) {
        this.max = max;
        this.data = new TransaksiPengisian03[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(TransaksiPengisian03 data) {
        rear = (rear + 1) % max;
        this.data[rear] = data;
        size++;
    }

    public void printRiwayatTransaksi() {
        System.out.printf("%-15s %-15s\n", "Plat Nomor", "Total Bayar");
        System.out.println("----------------------------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].TampilkanTranskasi();
        }
    }

    public void sorting(){
    for (int i = 0; i < size; i++) { //size digunakan untuk membatasi jumlah elemen yang valid dalam array
            TransaksiPengisian03 temp;
            for (int j = 1; j < size - i; j++) {
                if (data[j].liter < data[j - 1].liter) { //ascending
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    public void sortingTotal(){
        for (int i = 0; i < size; i++) { //data.length-1 karena dalam bobblesort, setiap iterasi memastikan 1 element sdh berd diposisi akhir
                TransaksiPengisian03 temp;
                for (int j = 1; j < size-i; j++) {
                    if (data[j].totalBayar > data[j-1].totalBayar) { //desc
                        temp = data[j];
                        data[j] = data[j-1];
                        data[j-1]=temp;
                    }
                }
            }
        }
    
}
