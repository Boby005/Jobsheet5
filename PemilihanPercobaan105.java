import java.util.Scanner;
public class PemilihanPercobaan105 {
    public static void main (String [] args){
          Scanner input05 = new Scanner(System.in);


          System.out.print("Masukan Angka: ");
          int angka = input05.nextInt();
          

          String JenisBilangan = (angka % 2 == 0) ?"genap" : "ganjil";
          System.out.println("Angka " + angka + " adalah bilangan " + JenisBilangan + ".");
          input05.close();
        

    }
  
}
