package JavaProgram;

public class AccountHolderObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		AccountHolder acc1 = new AccountHolder();
		
		acc1.firstName = "Tom";
		acc1.lastName = "Adams";
		acc1.age = 66;
		acc1.accountBalance = 16858.99;
		acc1.testEligibilityForCC();
		
		System.out.println(acc1.firstName);
		System.out.println(acc1.lastName);
		System.out.println(acc1.age);
		System.out.println(acc1.accountBalance);
		System.out.println(acc1.eligibleForCC);
		
	}

}
