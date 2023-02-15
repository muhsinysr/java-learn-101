import java.util.Scanner;
public class daireAlan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        int r ;
        System.out.println("Yarı Çap Giriniz : ");
        r = input.nextInt();

        double alan = pi*r*r;
        double cevre = 2 * r * pi;

        System.out.println("Dairenin Alanı Şudur" + alan);
        System.out.println("Dairenin Çevresi Şudur" + cevre);

    }
}
