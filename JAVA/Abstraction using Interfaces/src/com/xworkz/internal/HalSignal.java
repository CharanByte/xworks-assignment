package com.xworkz.internal;

public class HalSignal {

	private TrafficRule rule;

	public HalSignal(TrafficRule rule) {
		super();
		this.rule = rule;
	}

	public void check() {
		if (rule != null) {
			System.out.println("rule is not null");
			String result = rule.licenceNo("KA072525");
			if (result != null)
				System.out.println("licenceNo is : " + result);
			else
				System.out.println("licenceNo is invalid");

		} else
			System.out.println("rule is null");
	}

}
