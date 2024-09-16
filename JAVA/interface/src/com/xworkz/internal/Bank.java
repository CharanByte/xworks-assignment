package com.xworkz.internal;

public class Bank implements BankRule {

	@Override
	public boolean silence() {
		// TODO Auto-generated method stub
		System.out.println("running silence in Bank");
		return false;
	}

	@Override
	public String openingHours() {
		// TODO Auto-generated method stub
		System.out.println("running openingHours in Bank");

		return null;
	}

	@Override
	public double minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("running minimumBalance in Bank");
		return 0;
	}

	@Override
	public boolean noOverdrafts() {
		// TODO Auto-generated method stub
		System.out.println("running silence in Bank");

		return false;
	}

	@Override
	public boolean validIDRequired() {
		// TODO Auto-generated method stub
		System.out.println("running validIDRequired in Bank");

		return false;
	}

	@Override
	public boolean secureOnlineBanking() {
		// TODO Auto-generated method stub
		System.out.println("running silence in Bank");

		return false;
	}

	@Override
	public double atmUsageLimit() {
		// TODO Auto-generated method stub
		System.out.println("running atmUsageLimit in Bank");

		return 0;
	}

	@Override
	public double transactionFee() {
		// TODO Auto-generated method stub
		System.out.println("running transactionFee in Bank");

		return 0;
	}

	@Override
	public boolean loanEligibilityCriteria() {
		// TODO Auto-generated method stub
		System.out.println("running loanEligibilityCriteria in Bank");

		return false;
	}

	@Override
	public boolean confidentiality() {
		// TODO Auto-generated method stub
		System.out.println("running confidentiality in Bank");

		return false;
	}

	@Override
	public boolean antiMoneyLaunderingCompliance() {
		// TODO Auto-generated method stub
		System.out.println("running antiMoneyLaunderingCompliance in Bank");

		return false;
	}

	@Override
	public boolean depositInsurance() {
		// TODO Auto-generated method stub
		System.out.println("running depositInsurance in Bank");

		return false;
	}

	@Override
	public boolean timelyLoanRepayments() {
		// TODO Auto-generated method stub
		System.out.println("running timelyLoanRepayments in Bank");

		return false;
	}

	@Override
	public boolean accountStatementAvailability() {
		// TODO Auto-generated method stub
		System.out.println("running accountStatementAvailability in Bank");

		return false;
	}

	@Override
	public int chequeClearanceTime() {
		// TODO Auto-generated method stub
		System.out.println("running chequeClearanceTime in Bank");

		return 0;
	}

	@Override
	public boolean customerServiceStandards() {
		// TODO Auto-generated method stub
		System.out.println("running customerServiceStandards in Bank");

		return false;
	}

}
