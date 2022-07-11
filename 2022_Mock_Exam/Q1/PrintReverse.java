package Q1;

import java.util.Scanner;
import java.util.Stack;

public class PrintReverse {


	public void inputSentense(Stack<String> theStack) {
		
		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.println("Enter the first word in your sentence");
		
	    word = sc.next();
		
	    while(!word.endsWith(".")) {
	    	
	    	theStack.push(word);
	    	System.out.println("Enter a word by word");
	    	
	    	word = sc.next();
	    	
	    }
	    
	    theStack.push(word);
	}

	public void printSentence(Stack<String> theStack) {
		
		System.out.println("Reverse sentence");
		
		int x =  theStack.size();
		
		while(!(x==0)) {
			System.out.println(theStack.peek());
			theStack.pop();
			x--;
		
		}
	}
}
