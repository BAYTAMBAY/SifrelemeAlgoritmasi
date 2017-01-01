package şifreleme;

import java.util.*;

public class ŞİFRELEME {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Anahtar giriniz");
        String anahtar = klavye.nextLine();
        System.out.println("Kelimeyi giriniz");
        String kelıme = klavye.nextLine();
        System.out.println("Şifrelemek istiyorsan  '1'  şifre çözmek istiyorsan '2'  yaz");
        int istenilen = klavye.nextInt();
        if (istenilen == 1) {
            int toplam = 0;
            String eşitleme = kelimeEsitle(anahtar, kelıme.length());
            for (int i = 0; i < eşitleme.length(); i++) {
                int a = eşitleme.charAt(i);
                int b = kelıme.charAt(i);
                toplam = (a) + (b);
                char son = (char) toplam;
                System.out.print(son);

            }
        } else if (istenilen == 2) {
            int toplam = 0;
            String eşitleme = kelimeEsitle(anahtar, kelıme.length());
            for (int i = 0; i < eşitleme.length(); i++) {
                int a = eşitleme.charAt(i);
                int b = kelıme.charAt(i);
                toplam = b - a;
                System.out.print((char) toplam);

            }
        } else {
            System.out.println("Yanlış Bir Sayı Girdiniz(!)");
        }

    }

    public static String kelimeEsitle(String kelime, int sayi) {
        int toplama = 0;
        int kalan = 0;

        kalan = sayi % kelime.length();
        toplama = sayi / kelime.length();
        String b = "";
        for (int i = 0; i < toplama; i++) {
            b += kelime;
        }
        for (int i = 0; i < kalan; i++) {
            b += kelime.charAt(i);
        }
        return b;

    }
}
