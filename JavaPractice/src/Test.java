import java.util.HashMap;
import java.util.Map;

public class Test {

//	public static void main(String[] args) {
////		Map<Integer,String> colors=new HashMap();
////		colors.put(new Integer(0), "blue");
////		colors.put(new Integer(1), "red");
////		colors.put(new Integer(1), "green");
////		System.out.println(colors.get(1));
//		
////		Strthrowing name="david";
////		Object x=name;
//		
//		Object x="david";
//		String name=x;
//}
	
	public void foo() {
		
		try {
			throw new RuntimeException();
		}
		finally {
			
			System.out.println("in finally block");
		}
	}
	
	
	public static void main(String args[]) {
		
//		try {
//			
//			Test t= new Test();
//			t.foo();
//			System.out.println("finished running");
//		}
//		catch(Exception e) {
//			
//		}
		System.out.println(factorial(5));
	}
	public static long factorial(int n) {
		
		if(n==1) return 1;
		return n * factorial(n-1);
	}
		
}

