package springIntro;

public class MySqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Cutomer is added to MySQL");
		
	}
}
