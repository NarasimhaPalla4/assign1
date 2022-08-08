import java.util.*;
public class Collatz {
    public static void main(String[] args) {
        int[] x;
        int i=0,n,j,y=1,k;
        x=new int[1000];
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        x[0]=n;
        while(true) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            x[++i] = n;
            for (j = 0; j < i; j++) {
                if (n == x[j]) {
                    y = 0;
                    break;
                }
            }
            if (y == 0) {
                break;
            }
        }
        for(k=0;k<i;k++){
            System.out.print(x[k]+" ");
        }
    }
}
