import java.util.Scanner;

public class MaxDominoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        if(N>=M && M >=1){
            System.out.println((M * N) / 2);
        }
        
    }
}