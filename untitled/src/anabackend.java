import java.util.Scanner;
public class anabackend {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik, tarih;

        Scanner nt = new Scanner(System.in);

        //Değerleri al


        System.out.println("Matematik Notunuz: ");
        matematik = nt.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = nt.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = nt.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = nt.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = nt.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = nt.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + muzik + tarih);
        double sonuc = toplam/6;

        System.out.println("Ortalamanız :" + sonuc);

        boolean ortalama = sonuc >= 60;

        String snc = ortalama ?  "Sınıfı Geçtiniz" : "Sınıfta kaldınız.";

        System.out.println(snc);



    }

}