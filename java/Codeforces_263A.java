import java.util.*;

public class Codeforces_263A {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int matrix[][] = new int[5][5];
    int ini = 0 ,inj = 0;
    for(int i =0 ; i < 5; i++){
      for(int j =0 ; j < 5 ; j++){
        matrix[i][j]=scan.nextInt();
        if(matrix[i][j] == 1 ){
          ini=i;
          inj=j;
        }
      }
      
     
    }
      int moves = Math.abs(ini - 2) + Math.abs(inj - 2);
        System.out.println(moves);
  }
}