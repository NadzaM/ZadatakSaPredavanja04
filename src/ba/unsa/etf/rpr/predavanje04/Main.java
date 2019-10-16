package ba.unsa.etf.rpr.predavanje04;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int i = 1;
        Scanner ulaz = new Scanner (System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();
        for (i = 1; i<= n; i++){
            if (i%Main.sumaCifara(i) == 0) System.out.println(i);
        }
      //  System.out.println(Main.SumaCifaraCijelogBroja(n));
    }

    public static int sumaCifara(int x){
        int suma = 0;
        while (x>0){
            suma += x%10;
            x /= 10;

        }
        return suma;
    }
}
