import java.util.Scanner;

public class arraymultidimensi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String barang[] = new String[5];
        int nota[][] = new int[5][4];  // baris = 5 kolom = 4
        int pilih = 0, jumlah = 0, total = 0, baris = 0, kolom = 0, grandTotal = 0;

        do{
            System.out.println("\nAplikasi Kasir");
            System.out.println("1. Tas\n2. Sandal\n3. Sepatu\n4. Selesai");
            System.out.print("Pilih = "); pilih = sc.nextInt();

            switch(pilih){
                case 1 :
                    System.out.println("Tas [100.000]");
                    if (baris < 5){
                        barang[baris] = "Tas";
                        System.out.print("Jumlah = "); jumlah = sc.nextInt();
                        nota[baris][0] = jumlah;
                        nota[baris][1] = 100000;
                        nota[baris][2] = nota[baris][0] * nota[baris][1];
                        grandTotal = grandTotal + nota[baris][2];
                        nota[baris][3] = grandTotal;

                        //Tampilkan isi keranjang
                        System.out.println("\nDaftar Belanja");
                        System.out.println("No\tBarang\tQty\tHarga\tTotal\tGrandTotal");
                        for (int i = 0; i <= baris; i++){
                            System.out.print((i+1) + "\t");
                            System.out.print(barang[i] + "\t");
                            System.out.print(nota[i][0] + "\t");
                            System.out.print(nota[i][1] + "\t");
                            System.out.print(nota[i][2] + "\t");
                            System.out.println(nota[i][3] + "\t");
                        }
                        baris++;
                    } else {
                        System.out.println("Keranjang penuh");
                    }
                    break;

                case 2 :
                    System.out.println("Sandal [50.000]");
                    if (baris < 5){
                        barang[baris] = "Sandal";
                        System.out.print("Jumlah = "); jumlah = sc.nextInt();
                        nota[baris][0] = jumlah;
                        nota[baris][1] = 100000;
                        nota[baris][2] = nota[baris][0] * nota[baris][1];
                        grandTotal = grandTotal + nota[baris][2];
                        nota[baris][3] = grandTotal;

                        //Tampilkan isi keranjang
                        System.out.println("\nDaftar Belanja");
                        System.out.println("No\tBarang\tQty\tHarga\tTotal\tGrandTotal");
                        for (int i = 0; i <= baris; i++){
                            System.out.print((i+1) + "\t");
                            System.out.print(barang[i] + "\t");
                            System.out.print(nota[i][0] + "\t");
                            System.out.print(nota[i][1] + "\t");
                            System.out.print(nota[i][2] + "\t");
                            System.out.println(nota[i][3] + "\t");
                        }
                        baris++;
                    } else {
                        System.out.println("Keranjang penuh");
                    }
                    break;

                case 3 :
                    System.out.println("Sepatu [150.000]");
                    if (baris < 5){
                        barang[baris] = "Sepatu";
                        System.out.print("Jumlah = "); jumlah = sc.nextInt();
                        nota[baris][0] = jumlah;
                        nota[baris][1] = 150000;
                        nota[baris][2] = nota[baris][0] * nota[baris][1];
                        grandTotal = grandTotal + nota[baris][2];
                        nota[baris][3] = grandTotal;

                        //Tampilkan isi keranjang
                        System.out.println("\nDaftar Belanja");
                        System.out.println("No\tBarang\tQty\tHarga\tTotal\tGrandTotal");
                        for (int i = 0; i <= baris; i++){
                            System.out.print((i+1) + "\t");
                            System.out.print(barang[i] + "\t");
                            System.out.print(nota[i][0] + "\t");
                            System.out.print(nota[i][1] + "\t");
                            System.out.print(nota[i][2] + "\t");
                            System.out.println(nota[i][3] + "\t");
                        }
                        baris++;
                    }else {
                        System.out.println("Keranjang penuh");
                    }
                    break;

                case 4 :
                    System.out.println("Terima kasih");
                    System.out.println("\nDaftar Belanja");
                    System.out.println("No\tBarang\tQty\tHarga\tTotal\tGrandTotal");
                    for (int i = 0; i <= baris; i++){
                        System.out.print((i+1) + "\t");
                        System.out.print(barang[i] + "\t");
                        System.out.print(nota[i][0] + "\t");
                        System.out.print(nota[i][1] + "\t");
                        System.out.print(nota[i][2] + "\t");
                        System.out.println(nota[i][3] + "\t");
                    }

                    break;
            }
        }while(pilih != 4);
     }
}

