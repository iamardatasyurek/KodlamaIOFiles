package Strings;

public class Main {
    public static void main(String[] args) {
        String message = "Weather is such a wonderful today.";

        System.out.println(message);
        System.out.println("Message Length: " + message.length());
        System.out.println("5th letter of message: " + message.charAt(4));
        System.out.println(message.concat(" Yey!"));
        System.out.println("Does message start with 'W' ?" + message.startsWith("W"));
        System.out.println("Does message end with '.' ?" + message.endsWith("."));

        char[] characters = new char[7];
        message.getChars(0, 7, characters, 0);
        for (char c : characters) {
            System.out.println(c);
        }

        System.out.println("'t' is " + message.indexOf('t') + "th character");
        System.out.println("'t' is " + message.lastIndexOf('t') + "th character");

        System.out.println("---------------------------------------------------");

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        System.out.println(message.substring(11)); // 11 - last
        System.out.println(message.substring(11, 15)); // 11-15

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim()); //delete begining and ending spaces
    }
}
