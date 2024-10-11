import java.util.Scanner;
public class BioskopNo1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double hargaTiket = 50000, diskon, totalPendapatanSehari = 0, totalBayar;
    int totalTiketSehari = 0, jumlahTiketDibeli;
    while (true) {
        System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk menghitung total): ");
        jumlahTiketDibeli = sc.nextInt();

        if (jumlahTiketDibeli == 0) {
            break;
        }
        if (jumlahTiketDibeli < 0) {
            System.out.println("jumlah tiket tidak valid");
            continue;
        }
        if (jumlahTiketDibeli > 10) {
            diskon = 0.15;
            totalBayar = (jumlahTiketDibeli * hargaTiket) - (diskon * (jumlahTiketDibeli * hargaTiket));
            System.out.println("Mendapatkan diskon 15%");
            System.out.println("Total yang harus dibayar: " + totalBayar);
            System.out.println("==================================");
        } else if (jumlahTiketDibeli > 4) {
            diskon = 0.10;
            totalBayar = (jumlahTiketDibeli * hargaTiket) - (diskon * (jumlahTiketDibeli * hargaTiket));
            System.out.println("Mendapatkan diskon 10%");
            System.out.println("Total yang harus dibayar: " + totalBayar);
            System.out.println("==================================");
        } else {
            totalBayar = (jumlahTiketDibeli * hargaTiket);
            System.out.println("Tidak mendapatkan diskon");
            System.out.println("Total yang harus dibayar: " + totalBayar);
            System.out.println("==================================");
        }
        totalTiketSehari = jumlahTiketDibeli + totalTiketSehari;
        totalPendapatanSehari = totalPendapatanSehari + totalBayar;
    }
    System.out.println("==================================");
    System.out.println("Tiket yang terjual hari ini: " + totalTiketSehari);
    System.out.println("Pendapatan untuk hari ini: " + totalPendapatanSehari);
    }
}
