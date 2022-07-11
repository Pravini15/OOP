package Q1;

import java.util.Stack;

public class Demo {

	public static void main(String []args) {
		
		Stack<String> theStack = new Stack<String>();
		PrintReverse ob = new PrintReverse();
		ob.inputSentense(theStack);
		ob.printSentence(theStack);
	}
}
