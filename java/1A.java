import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong(), m = scan.nextLong(), a = scan.nextLong();
        
        long tilesInLength = (long) Math.ceil((double) n / a);
        long tilesInWidth = (long) Math.ceil((double) m / a);
        
        System.out.println(tilesInLength * tilesInWidth);
        
    }
}