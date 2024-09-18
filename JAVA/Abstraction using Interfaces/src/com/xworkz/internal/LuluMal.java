package com.xworkz.internal;

public class LuluMal {

	private MallRule mallRule;

	public void setMallRule(MallRule mallRule) {
		this.mallRule = mallRule;
	}

	public void check() {
		if (mallRule != null) {
			boolean result = mallRule.validId(102);
			System.out.println("mallRule is not null");
			if (result == true)
				System.out.println("Id is valid ");
			else
				System.out.println("id is not valid");
		} else
			System.out.println("mallRule is  null");
	}

}
