package Interfaces.WorkWithInterfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("Customer is added : MySql");
    }

}
