package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends Account {

	private int transferLimit = 100;
	private static final float INTEREST_PERCENTAGE = 0.01f;
	
	public CheckingAccount() {
		super(INTEREST_PERCENTAGE);
		
	}
	
	@Override
	public Transfer makeTransfer(String counterAccount, Money amount)
			throws BusinessException {
		
		// 1. Check withdrawal limit:
	    if (amount.greaterThan(this.transferLimit)) {
	        throw new BusinessException("Limit exceeded!");
	    }
	    else {
	    	return super.makeTransfer(counterAccount, amount);
	    }
	}
	
}
// end::CheckingAccount[]
