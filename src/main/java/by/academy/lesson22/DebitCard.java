package by.academy.lesson22;

import java.util.Date;

public class DebitCard implements Payment {

	private String issuer;
	private Long cardNo;
	private Date expiryDate;

	@Override
	public void authorise(double amount) {

		System.out.println("Authorise by Debit Card");
	}

}
