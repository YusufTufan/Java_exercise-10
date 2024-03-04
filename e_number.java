import java.util.Scanner;
public class e_number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hesaplanacak sayıyı giriniz: ");
        int number = scanner.nextInt();

        double e =1.0;

        for(int i=1; i<=number; i++){
            int faktoriyel = 1;
            for(int j =1; j<=i; j++){
                faktoriyel *= j;
            }
            e += 1.0/faktoriyel;
        }
        System.out.print("E değeri: "+e);
        scanner.close();
    }
}