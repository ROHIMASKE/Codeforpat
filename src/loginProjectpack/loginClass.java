package loginProjectpack;

public class loginClass {
	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		for (int i = num; i > 0; i = i / 10) {
			int rem = i % 10;
			sum = sum + (rem * rem * rem);
		}
		if (sum == num) {
			System.out.println(num + "given number is an Armstrong number");
		} else {
			System.out.println(num + "given number is not an Armstrong number");
		}
	}
}
