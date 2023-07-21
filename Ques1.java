import java.util.*;
public class Ques1 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        sc.nextLine();

		        String maxOddWord = "";
		        boolean oddWordFound = false;

		        for (int i = 0; i < n; i++) {
		            String word = sc.nextLine();
		            if (word.length() % 2 != 0) {
		                if (!oddWordFound || word.length() > maxOddWord.length()) {
		                    oddWordFound = true;
		                    maxOddWord = word;
		                }
		            }
		        }

		        if (oddWordFound) {
		            System.out.println(maxOddWord);
		        } else {
		            System.out.println("Better luck next time");
	    }
   }
}