import java.util.Scanner;
public class PemilihanPercobaan205 {
    public static void main (String [] args){
        Scanner input05 = new Scanner(System.in);

        System.out.print("Nilai UAS     : ");
        float UAS = input05.nextFloat();
        System.out.print("Nilai UTS     : ");
        float UTS = input05.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input05.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input05.nextFloat();

        float total = (UAS* 0.4F) + (UTS * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total <65? "remidi" : "tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total >=80) {
            System.out.println("A : Sangat Baik");
        }
        else if (total <=65 ) {
            System.out.println("B : baik");
        }

        else if (total >=60 ) {
            System.out.println("C : Lebih dari cukup");
        }
        
        else if (total >=50 ) {
            System.out.println("D : Cukup");
        }

        else {
        System.out.println("E : GAGAL");    
    }

        

        input05.close();
    } 
}
      
