package stack;
import java.util.*;
public final class MinStack implements minStackInterface {
	Stack<Integer> mainStack = new Stack<Integer>();
	Stack<Integer> minTillNow = new Stack<Integer>();
	public int top() 
	{
		return mainStack.peek();
	}
	public int getMin()
	{
		return minTillNow.peek() ;
	}
	public void push(int value)
	{
		if(mainStack.size() == 0) {
			mainStack.push(value) ;
			minTillNow.push(value);
		}
		else {
			mainStack.push(value) ;
			minTillNow.push( Math.min(value, minTillNow.peek() ) );
		}
	}
	
	public int pop() 
	{
		int x = minTillNow.pop() ;
		return  mainStack.pop();
	}
}
