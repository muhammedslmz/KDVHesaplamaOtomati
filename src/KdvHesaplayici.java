import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("%18 KDV eklemek istediğiniz tutarı giriniz:");
        double gelentutar = giris.nextDouble();

        double kdv = gelentutar/100 *18;
        double kdvli=gelentutar+kdv;
        System.out.println("KDV:" +kdv);
        System.out.println("KDV'li tutar:"+kdvli);

    }
}
