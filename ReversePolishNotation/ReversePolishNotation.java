import java.util.*;
public class ReversePolishNotation {
	public static void main(String[] args) {
		ArrayList<String> sample1 = new ArrayList<String>();
		sample1.add("2");
		sample1.add("1");
		sample1.add("+");
		sample1.add("3");
		sample1.add("*");
		System.out.println(evalRPN(sample1));

		ArrayList<String> sample2 = new ArrayList<String>();
		sample2.add("4");
		sample2.add("13");
		sample2.add("5");
		sample2.add("/");
		sample2.add("+");
		System.out.println(evalRPN(sample2));
	}

	public static int evalRPN(ArrayList<String> a) {
	    Stack<String> myStack = new Stack<String>();
	    for(int i = 0; i < a.size(); i++)
	    {
	        int val1 = 0;
	        int val2 = 0;
	        int result = 0;
	        if(a.get(i).equals("+"))
	        {
	            val2 = Integer.parseInt(myStack.pop());
	            val1 = Integer.parseInt(myStack.pop());
	            result = val1 + val2;
	            myStack.push(""+result);
	        }
	        else if(a.get(i).equals("-"))
	        {
	            val2 = Integer.parseInt(myStack.pop());
	            val1 = Integer.parseInt(myStack.pop());
	            result = val1 - val2;
	            myStack.push(""+result);
	        }
	        else if(a.get(i).equals("/"))
	        {
	            val2 = Integer.parseInt(myStack.pop());
	            val1 = Integer.parseInt(myStack.pop());
	            result = val1 / val2;
	            myStack.push(""+result);
	        }
	        else if(a.get(i).equals("*"))
	        {
	            val2 = Integer.parseInt(myStack.pop());
	            val1 = Integer.parseInt(myStack.pop());
	            result = val1 * val2;
	            myStack.push(""+result);	            
	        }
	        else
	        {
	            myStack.push(a.get(i));
	        }
	    }
	    return Integer.parseInt(myStack.pop());
	}
}
