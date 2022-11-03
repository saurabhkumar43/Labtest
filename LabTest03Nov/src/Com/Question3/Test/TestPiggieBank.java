/* 
 Program:WAP of Piggiebank
 @Author: Saurabh Kumar
 @Date: 03rd Nov 2022
 */
//package
package Com.Question3.Test;

//Creating class
public class TestPiggieBank {

	private int addamt;
	private int amount;

	public TestPiggieBank() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("DEFAULT CONSTRUCTOR");
		this.amount = 50;
	}

	public TestPiggieBank(int addamt, int amount) {
		super();
		System.out.println("PARAMERISED CONSTRUCTOR");
		this.addamt = addamt;
		this.amount = amount;
	}

	public int getAddamt() {
		return addamt;
	}

	public int setAddamt(int addamt) {
		return this.addamt += addamt;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}// end of main

}// end of class
