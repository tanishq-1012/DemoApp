
public class DemoApp {

	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		
		for(int ele : a) {
			System.out.println(ele);
		}
		
		String s = "Tanishq";
		int count = s.toUpperCase().length();
		System.out.println(count);
		
		StringBuffer sb = new StringBuffer("TanishqSharma");
		int length = sb.append("Tanya").reverse().length();
		System.out.println(length);
	}

}
