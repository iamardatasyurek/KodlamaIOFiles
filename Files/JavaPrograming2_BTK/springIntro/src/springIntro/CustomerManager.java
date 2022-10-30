package springIntro;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		//work rules
		customerDal.add();
	}
}
