package Practice;

public class Repl83 {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        for (int row=0; row<a.length; row++) {
            int sum=0;
            for (int col=0; col<a[0].length; col++){
                sum+=a[row][col];
            }
            System.out.println(sum);
        }
    }
}
