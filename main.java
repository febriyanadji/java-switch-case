import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan bilangan = ");
        bil = in.nextInt();
        switch (bil) {
        case 1:
            System.out.println("Ini 1");
            break;
        case 2:
            System.out.println("Ini 2");
            break;
        default:
            System.out.println("Ini tidak sama sekali");
            break;
        }
    }
}