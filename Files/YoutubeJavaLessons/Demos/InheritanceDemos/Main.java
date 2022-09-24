package Demos.InheritanceDemos;

public class Main {
    public static void main(String[] args) {
        LoanUI loanUI = new LoanUI();
        loanUI.LoanCalculate(new TeacherLoanManager());
        loanUI.LoanCalculate(new AgricultureLoanManager());
        loanUI.LoanCalculate(new SoldierLoanManager());
    }
}
