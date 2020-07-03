import stack.MinStack;
public class MainClass {

	public static void main(String[] args) {
		MinStack st = new MinStack() ;
		st.push(5);
		st.push(10);
		System.out.println("Minium till now is " + st.getMin());
		st.push(2);
		System.out.println("Minium till now is " + st.getMin());

	}

}
