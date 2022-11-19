import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Uncomment untuk running soal no 1
        // no1();

        // Uncomment untuk running soal no 2
        // no2();

        // Uncomment untuk running soal no 3
        // no3();

        // Uncomment untuk running soal no 4
        no4();


    }

    public static void no1(){
        int randomIntArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,54,23,13,23,20 };
        for(int i = 0; i < randomIntArray.length; i++) {
            if(randomIntArray[i] % 2 == 0) {
                System.out.println(randomIntArray[i] + " adalah bilangan genap");
            }else{
                System.out.println(randomIntArray[i] + " adalah bilangan ganjil");
            }
        }

        return;
    }

    public static void no2(){
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukan angka ke- " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // selection sort
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        // print array
        System.out.println("Hasil pengurutan dengan selection sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return;
    }

    public static void no3(){
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        listMahasiswa.add(new Mahasiswa(1, "Mahasiswa A", "Kelas A", 1));
        listMahasiswa.add(new Mahasiswa(2, "Mahasiswa B", "Kelas B", 2));
        listMahasiswa.add(new Mahasiswa(3, "Mahasiswa C", "Kelas C", 3));
        listMahasiswa.add(new Mahasiswa(4, "Mahasiswa D", "Kelas D", 4));
        listMahasiswa.add(new Mahasiswa(5, "Mahasiswa E", "Kelas E", 5));

        System.out.println("List Mahasiswa");
        for (Mahasiswa mahasiswa : listMahasiswa) {
            System.out.println(mahasiswa);
        }

        // Tambah Mahasiswa
        listMahasiswa.add(new Mahasiswa(6, "Mahasiswa F", "Kelas F", 6));
        listMahasiswa.add(new Mahasiswa(7, "Mahasiswa G", "Kelas G", 7));

        System.out.println("List Mahasiswa setelah ditambah");
        for (Mahasiswa mahasiswa : listMahasiswa) {
            System.out.println(mahasiswa);
        }

        System.out.println("List Mahasiswa setelah dihapus");
        // Hapus Mahasiswa
        listMahasiswa.remove(0);
        for(Mahasiswa mahasiswa : listMahasiswa) {
            System.out.println(mahasiswa);
        }

        System.out.println("Jumlah Mahasiswa: " + listMahasiswa.size());

    }

    public  static  void no4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = scanner.nextInt();
        LinkedList<Mahasiswa> mahasiswaLinkedList = new LinkedList<>();
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("ID Mahasiswa ke-" + (i + 1) + ": ");
            int id = scanner.nextInt();

            System.out.println("Nama Mahasiswa ke-" + (i + 1) + ": ");
            String nama = scanner.next();

            System.out.println("Kelas Mahasiswa ke-" + (i + 1) + ": ");
            String kelas = scanner.next();

            System.out.println("Tanggal Masuk Mahasiswa ke-" + (i + 1) + ": ");
            int tanggalMasuk = scanner.nextInt();
            mahasiswaLinkedList.addFirst(new Mahasiswa(id, nama, kelas, tanggalMasuk));
        }

        System.out.println("List Mahasisawa");
        for (Mahasiswa mahasiswa : mahasiswaLinkedList) {
            System.out.println(mahasiswa);
        }

        // remove mahasiswa
        mahasiswaLinkedList.remove(0);
        System.out.println("List Mahasisawa setelah dihapus");
        for (Mahasiswa mahasiswa : mahasiswaLinkedList) {
            System.out.println(mahasiswa);
        }

        // add mahasiswa
        mahasiswaLinkedList.addLast(new Mahasiswa(4, "Rizky", "A", 2019));
        mahasiswaLinkedList.addLast(new Mahasiswa(5, "Rizky", "C", 2019));
        System.out.println("List Mahasisawa setelah ditambah");
        for (Mahasiswa mahasiswa : mahasiswaLinkedList) {
            System.out.println(mahasiswa);
        }
    }

}