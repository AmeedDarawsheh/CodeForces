import java.util.*;

public class Solution {
    public static void main(String[] args) {
      
      String input = new Scanner(System.in).nextLine();
      
      if (Character.isUpperCase(input.charAt(0))) {
          System.out.print(input);
      } else {
          input = Character.toUpperCase(input.charAt(0)) + input.substring(1);
          System.out.print(input);
      }
  }
}




