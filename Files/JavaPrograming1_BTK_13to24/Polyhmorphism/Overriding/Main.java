package Overriding;

public class Main {
    public static void main(String[] args) {
        BaseLoanManager[] baseLoanManagers = new BaseLoanManager[] { new TeacherLoanManager(),
                new AgricultureLoanManager(), new StudentLoanManager() };
        for (BaseLoanManager baseLoanManager : baseLoanManagers) {
            System.out.println(baseLoanManager.calcute(1000));
        }
    }
}
