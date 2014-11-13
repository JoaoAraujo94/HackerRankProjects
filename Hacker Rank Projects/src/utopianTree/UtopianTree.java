package utopianTree;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0) {
            int n = input.nextInt();
            System.out.println(height(n));
            t -= 1;
        }
    }
    
    public static int height(int n) {
        int c = 0;
        int result = 0;
        while(c <= n) {
            if(c % 2 == 0) {
                result += 1;
            } else {
                result *= 2;
            }
            c++;
        }
        return result;
    }
    
}
