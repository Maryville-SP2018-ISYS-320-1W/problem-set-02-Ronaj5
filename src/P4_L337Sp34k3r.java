import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P4_L337Sp34k3r {

	public static void main(String[] args) {
		
		String phrase;
		Scanner input = new Scanner(System.in);

		System.out.println("L337 Translator");
		System.out.println("Please enter your three words to make L334.");
		phrase = input.nextLine();
		
		String parts[] = phrase.split(" ");
		String word1, word2, word3;

		word1 = parts[0];
		parts[0] = parts[0].replace("a", "4");
		parts[0] = parts[0].replace("e", "3");
		parts[0] = parts[0].replace("t", "7");
		parts[0] = parts[0].replace("0", "()");
		
		word2 = parts[1];
		parts[1] = parts[1].replace("a", "4");
		parts[1] = parts[1].replace("e", "3");
		parts[1] = parts[1].replace("t", "7");
		parts[1] = parts[1].replace("0", "()");
		
		word3 = parts[2];
		parts[2] = parts[2].replace("a", "4");
		parts[2] = parts[2].replace("e", "3");
		parts[2] = parts[2].replace("t", "7");
		parts[2] = parts[2].replace("o", "()");
		
		System.out.println(word1 + " -> " + parts[0]);
		System.out.println(word2 + " -> " + parts[1]);
		System.out.println(word3 + " -> " + parts[2]);

	}
}
