package maximizeXOR;

import java.util.Scanner;

public class maximizeXOR {
    
    static int maxXor(int l, int r) {
        int res = 0;
        while(l < r) {
            int aux = l;
            while(aux < r) {
                if((l ^ aux) > res) {
                    res = (l^aux);
                }
                aux++;
            }
            l++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
    }
}
