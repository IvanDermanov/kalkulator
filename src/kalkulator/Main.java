package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		String komanda="";
		// komanda ide u formatu komanda 
		do {
			komanda=scr.nextLine();
			String[] kom=komanda.split(" ");
			if (kom.length!=3||komanda.isEmpty()) {
				continue;
			}
			int x=Integer.parseInt(kom[0]);
			int y=Integer.parseInt(kom[2]);
			int z=0;
			switch (kom[1]) {
			case "-":
				z=sub(x,y);
				break;

			default:
				System.out.println("Operand nije podrzan");
				continue;
			}
			
			System.out.println("Rezultat "+z);
			
		}while (!komanda.equals("End"));
		scr.close();
	}

	private static int sub(int x, int y) {
		
		return x - y;
	}

}
