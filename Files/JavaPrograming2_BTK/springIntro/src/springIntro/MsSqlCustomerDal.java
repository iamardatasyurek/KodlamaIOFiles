package springIntro;

public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Cutomer is added to MSSQL");
		
	}
}
