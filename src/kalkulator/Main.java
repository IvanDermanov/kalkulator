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
		}while (!komanda.equals("End"));
		scr.close();
	}

}
