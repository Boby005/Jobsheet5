import java.util.Scanner;
public class PemilihanPercobaan305 {
    public static void main (String [] args){
        Scanner input05=new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        
        System.out.print("Masukan angka pertama: ");
        angka1 = input05.nextDouble();
        System.out.print("Masukan angka kedua: ");
        angka2 = input05.nextDouble();
        System.out.print("Masukan operator (+ - * /): ");
        operator = input05.next().charAt(0);

        switch (operator) {
         case '+' :
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + "=" + hasil);
            break;
         case '-' :
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + "=" + hasil);
            break;
         case '*' :
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + "=" + hasil);
            break;
         case '/' :
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + "=" + hasil);
            break;

        }
input05.close();
    }
}