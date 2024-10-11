import java.util.Scanner;

public class FlowchartNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.println("------------------------------------------");
            System.out.println("0. Keluar");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
    
            System.out.print("Masukkan jenis kendaraan yang ingin parkir: ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (TANPA JAM): ");
                durasi = sc.nextInt();
                if (durasi < 0) {
                    System.out.println("Durasi parkir tidak valid");
                    continue;
                }
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }
                }
            } else if (jenis == 0) {
                System.out.println("Keluar");
            } else {
                System.out.println("Kendaraan tidak valid");
            }
        } while (jenis != 0);
       
        System.out.println("Total biaya: " + total);
    }
}