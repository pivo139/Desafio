package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rent[] vect = new Rent[10];
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + (i+1) + ":\n");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: "); 
		for(int i = 0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
	
		sc.close();
	}

}
