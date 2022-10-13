
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class translasi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");

        System.out.println(" *Masukkan Nilai X ");
        System.out.println(" ********************************* ");

        double x = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai Y ");
        System.out.println(" ******************************* ");

        double y = sc.nextInt();

        System.out.println(" ********************************* ");
        System.out.println(" *********Translasi (a,b)********* ");
        System.out.println(" *Masukkan Nilai A ");
        System.out.println(" ********************************* ");

        double a = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai B ");
        System.out.println(" ******************************* ");

        double b = sc.nextInt();

        double x1 = x + a;
        double y1 = y + b;

        System.out.println(" ******************************* ");
        System.out.println(" *Maka Hasil Translasi A'(X'Y')** ");
        System.out.println(" *Nilai X' = " + x1);
        System.out.println(" *Nilai Y' = " + y1);
        System.out.println(" ******************************* ");
    }

}
