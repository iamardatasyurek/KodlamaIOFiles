package Overriding;

public class StudentLoanManager extends BaseLoanManager {
    @Override
    public double calcute(double amount){
        return amount * 1.1;
    }
}
