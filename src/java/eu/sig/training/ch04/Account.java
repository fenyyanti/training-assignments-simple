package eu.sig.training.ch04;

public abstract class Account {

	Money balance = new Money();  
	private float INTEREST_PERCENTAGE;
	
	public Account(float percentInterest) {
		this.INTEREST_PERCENTAGE = percentInterest;
	}

	
	public Transfer makeTransfer(String counterAccount, Money amount) 
	        throws BusinessException {
	    	
	    	if (isValid(counterAccount))
	        {
	    		// 2. Look up counter account and make transfer object:
	            Transfer result = new Transfer(this, Accounts.findAcctByNumber(counterAccount), amount);       
	            return result;
	        } else {
	            throw new BusinessException("Invalid account number!!");
	        }
	}

	public void addInterest(float percentInterest) {
	    Money interest = balance.multiply(percentInterest);
	    if (interest.greaterThan(0)) {
	        balance.add(interest);
	    } else {
	        balance.substract(interest);
	    }
	}
	
	// tag::isValid[]
    public boolean isValid(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + (9 - i) * Character.getNumericValue(number.charAt(i));
        }
        return sum % 11 == 0;
    }
    // end::isValid[]
}