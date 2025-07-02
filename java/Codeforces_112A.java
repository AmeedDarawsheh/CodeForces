import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str1 = scan.nextLine().toLowerCase();
        String str2 = scan.nextLine().toLowerCase();  
        
        int result = str1.compareTo(str2);
        
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}