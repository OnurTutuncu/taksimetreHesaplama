import java.util.Scanner;

public class taksimetreHesaplama {
    public static void main(String[] args) {

        double km , fiyat  ;

        Scanner input = new Scanner(System.in);
        System.out.print("Gittiğiniz Mesafeyi Kilometre Cinsinden Giriniz:");
        km = input.nextInt();

        if (km <= 4){
    fiyat = 20;}
        else { fiyat = (km * 2.20) + 10 ;
}

        System.out.println("Taksimetre Fiyatı:"+ fiyat);
    }
}
