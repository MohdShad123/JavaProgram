package com.infy;

public class MoveTicketTester {
	private int moveId;
	private int noOfSeats;
	private double costPerTicket;
	public int getMoveId() {
		return moveId;
	}
	public void setMoveId(int moveId) {
		this.moveId = moveId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}
	
	public void moveTicket(int moveId, int noOfSeats) {
		this.moveId = moveId;
		this.noOfSeats = noOfSeats;
	}
	public double calculateTotalAmount() {
		double totalAmount;
		if(moveId == 111 || moveId == 112 || moveId == 113 ) {
		totalAmount = (costPerTicket*noOfSeats) + 2/100.0;
		}
		else
			totalAmount = 0;
		return totalAmount;
	}

}
