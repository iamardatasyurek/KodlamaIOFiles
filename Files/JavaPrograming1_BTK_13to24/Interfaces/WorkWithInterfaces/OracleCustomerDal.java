package Interfaces.WorkWithInterfaces;

public class OracleCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("Customer is added : Oracle");
    }

}
