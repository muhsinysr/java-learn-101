import java.util.Scanner;
public class dairedilimialani {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        int merkezAci;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı Şudur : ");
        r = input.nextInt();

        System.out.println("Merkez açı Şudur: ");
        merkezAci= input.nextInt();

        double alan;

        alan =  (pi * (r*r) * merkezAci)/360;

        System.out.println("Dairenin Alanı Şudur:" + alan);
    }
}
