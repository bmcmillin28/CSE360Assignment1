package cse360assignment02;

public class AddingMachine {
	private int total;
	private String operations = "0";
	
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}
	
	//gets total
	public int getTotal() {
		return total;
	}
	
	//adds entered value
	public void add(int value) {
		total += value;
		operations += " + ";
		operations += value;
	}
	
	//subtracts entered value
	public void subtract(int value) {
		total -= value;
		operations += " - ";
		operations += value;
	}
	
	//returns a string output
	public String toString() {
		return operations;
	}
	
	//clears history string
	public void clear() {
		operations = "0";
	}
}
