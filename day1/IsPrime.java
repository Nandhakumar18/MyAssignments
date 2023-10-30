package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 67;
		
		boolean isPrime = true;
		
		for (int i = 2; i <=num/2; i++) {
			System.out.println(i);
			if(num% i==0) {
				isPrime=false;
				break;
			}
			
		}

		if(isPrime) {
			System.out.println(num+ " : is prime");
		}
		else {
			System.out.println(num+ " : is not prime");
		}
	}

}
