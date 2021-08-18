package p1;

import java.util.Scanner;

public class SampleScanner {

	public static void main(String[] args) {
		
		int id , id2;
		String name, subject, author, publisher ;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book ID :  ");
		id = sc.nextInt();
			
		System.out.println("Enter book Name :  ");
		name= sc.nextLine();
	//	name= sc.nextLine();
			
		System.out.println("Enter book ID2 :  ");
		id2 = sc.nextInt();
		
		System.out.println("Enter book Subject :  ");
		subject= sc.nextLine();
			
			System.out.println("Enter book Author :  ");
			author= sc.nextLine();
			System.out.println("Enter book Publisher :  ");
			publisher= sc.nextLine();
		

	}

}
