package RahulShettyLectures;

public class Lecture1 {
//	public static void getstatus() {
//		
//		System.out.println("es ist gut tag");
//	}
	public static void main(String[] args) {
		//commitment
//	Lecture1 lc=new Lecture1();
//	lc.getstatus();
//		getstatus();
		String abc=new String("hello");
//		String abc="hello";
		String rev="";
		for(int i=abc.length()-1;i>=0;i--) {
			
			rev+=abc.charAt(i);
		}
		
		System.out.print(rev);

}
	
}
