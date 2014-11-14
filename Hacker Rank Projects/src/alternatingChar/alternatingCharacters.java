package alternatingChar;

import java.util.Scanner;

public class alternatingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        while(t > 0) {
            String line = in.next();
            int deletions = 0;
            for(int i = 0; i < line.length() - 1; i++) {
                if(Character.toString(line.charAt(i)).equals(Character.toString(line.charAt(i+1)))) {
                    deletions++;
                }
            }
            System.out.println(deletions);
            t--;
        }
    }
}
