package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
String unicorn="pink";
if(unicorn.equals("hi")){
System.out.println("cupcakes");
} else{
System.out.println("rainbows");
}
System.out.println("die");

String answer= JOptionPane.showInputDialog(null,"What is your name?");
System.out.println("Hi "+ answer);
String answer1= JOptionPane.showInputDialog(null,"What is your address?");
System.out.println("Thank you! "+ answer1);
String answer2= JOptionPane.showInputDialog(null,"What is the best way to reach you? What is your number?");
System.out.println("Thanks, we appreciate it! "+ answer2);
String answer3= JOptionPane.showInputDialog(null,"What does your life mean to you? ");
System.out.println(answer3);
String answer4= JOptionPane.showInputDialog(null,"What is your instagram username?");
System.out.println("ily! "+ answer4);
String answer5= JOptionPane.showInputDialog(null,"This program will force you to follow me @ritu.10");
System.out.println("ty ;) "+ answer5);
System.out.println("Thanks for visting our page :) ");

}
}
