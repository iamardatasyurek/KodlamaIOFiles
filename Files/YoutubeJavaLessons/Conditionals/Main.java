package Conditionals;

public class Main {
    public static void main(String[] args) {
        int number = 14;

        if (number < 20) {
            System.out.println(number+" is lower then 20");
        }
        if (number < 15) {
            System.out.println(number+" is lower then 15");
        }

        number = 25;
        if (number < 20) {
            System.out.println(number+" is lower then 20");
        } 
        else {
            System.out.println(number+" is higher then 20");
        }

        number = 20;
        if (number < 20) {
            System.out.println(number+" is lower then 20");
        } 
        else if(number == 20){
            System.out.println(number+" is equal 20");
        }
        else{
            System.out.println(number+" is higher then 20");
        }

    }
}
