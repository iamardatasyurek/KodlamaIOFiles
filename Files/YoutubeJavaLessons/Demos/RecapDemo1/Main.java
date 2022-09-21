package Demos.RecapDemo1;

public class Main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 25;
        int number3 = 2;

        if(number1 > number2 && number1 > number3){
            System.out.println("The bigest number is "+number1);
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println("The bigest number is "+number2);
        }
        else if(number3 > number1 && number3 > number2){
            System.out.println("The bigest number is "+number3);
        }

        int theBigest = number1;

        if(theBigest < number2){
            theBigest = number2;
        }
        if(theBigest < number3){
            theBigest = number3;
        }
        System.out.println("The bigest number is "+theBigest);
    }
}
