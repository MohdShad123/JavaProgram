package com.infy;
import java.util.Scanner;

public class MoveTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter MoveId , NoOfSeats And CostPerTicket");
		int moveId = in.nextInt();
		int seats = in.nextInt();
		double cPerTicket = in.nextDouble();
		MoveTicketTester moveticket = new MoveTicketTester();
		moveticket.setMoveId(moveId);
		moveticket.setNoOfSeats(seats);
		moveticket.setCostPerTicket(cPerTicket);
		
		double amount = moveticket.calculateTotalAmount();
		if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);
		
		
		

	}

}
