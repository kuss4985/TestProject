package JavaProgram;

public class AccountHolder {
	
	String firstName;
	String lastName;
	int age;
	double accountBalance;
	boolean eligibleForCC;
	
	public void testEligibilityForCC() {
		if (age>25 && accountBalance >=50000 )
		{
			eligibleForCC = true;
		}
		else
		{
			eligibleForCC = false;
		}
	}
}
