package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(10);
//		theStack.push("h");
//		theStack.push("e");
//		theStack.push("l");
//		theStack.push("l");
//		theStack.push("l");
//		theStack.push("o");
		
//		while(!theStack.isEmpty()) {
//			long value = theStack.pop();
//			System.out.println(value);
//			System.out.println(theStack.isFull());
//		}
		
		System.out.println(reverseString("HELLO"));
	}
	
	public static String reverseString(String str) {
		
		int stackSize = str.length();
		Stack theStack = new Stack(stackSize);
		for(int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			theStack.push(ch);
		}
		
		String result = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			result = result+ ch;
		}
		
		return result;
	}

}
