package com.xworkz.internal;

public interface BankRule {

	boolean silence();

	String openingHours();

	double minimumBalance();

	boolean noOverdrafts();

	boolean validIDRequired();

	boolean secureOnlineBanking();

	double atmUsageLimit();

	double transactionFee();

	boolean loanEligibilityCriteria();

	boolean confidentiality();

	boolean antiMoneyLaunderingCompliance();

	boolean depositInsurance();

	boolean timelyLoanRepayments();

	boolean accountStatementAvailability();

	int chequeClearanceTime();

	boolean customerServiceStandards();

}
