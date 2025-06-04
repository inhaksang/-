package 직박구리.상속.오버로딩오버라이딩차이;

public class 오버로딩 {
	
	 int add(int a, int b) {
		 return a+b;
	 }
	 
	 double add(double a, double b) {
		 return a+b;
	 }
	 
	 int add(int[] a) {
		 int sum = 0;
		 for (int i : a) sum += i;
		 return sum;
	 }

}
