
import java.util.Scanner;
public class StrukBelanja {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan jumlah barang: ");
        int barang = input.nextInt();
        input.nextLine();

        String[] nama = new String[barang];
        int [][] hargaDiskon = new int[barang][2];
        int totalPembayaran = 0;

        for (int i = 0; i < barang; i++) {
            System.out.println();
            System.out.println("Barang ke-" + (i+1) + ": ");
            System.out.print("Nama barang: ");
            nama[i] = input.nextLine();
            System.out.print("Harga awal: ");
            hargaDiskon[i][0] = input.nextInt();
            System.out.print("Persentase diskon: ");
            hargaDiskon[i][1] = input.nextInt();
            input.nextLine();
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("                          CASH RECEIPT                         ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Nama Barang\t  Harga Awal\t   Diskon(%)\t   Harga Akhir");

        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + "\t  ");
            for (int j = 0; j < 2; j++) {
                System.out.print(hargaDiskon[i][j] + "\t\t   ");
            }
            
            int totalDiskon = hargaDiskon[i][0] * hargaDiskon[i][1] / 100;
            int hargaAkhir = hargaDiskon[i][0] - totalDiskon;

            System.out.println(hargaAkhir);

            totalPembayaran += hargaAkhir;
           
        }

        System.out.println("                                -------------------------------");
        System.out.println("\t\t\t\t   Total\t   " + totalPembayaran);
        System.out.println("---------------------------------------------------------------");
    }
}