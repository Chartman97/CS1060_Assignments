import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            // Mean Computer Original****************************

            Scanner in = new Scanner (System.in);
            System.out.println("Hi");
            in.nextLine();
            // Exchange of hello
            String name;
            System.out.println("...Ummm... Who are you?.. and don't even ask what my name is -_- ");
            name = in.nextLine();
            System.out.println( name + "...  That's your name? I am sorry about that. \n  Well, I guess im pretty bored. Wanna see a magic trick?");
            // Asking of name & magic trick
            String response;
            response = in.nextLine();
            System.out.println( "\"" + response + "\"" + ".. wow so excited. Okay, I could care less. Here is the magic trick.. ");
            // First part of talk, intro and quick qip. Now time for "magic trick"
            int inch;
            double cm;
            Scanner in2 = new Scanner(System.in) ;

            System.out.print("How tall are you in inches... \nYes, do the math.. input it here ->") ;
            inch = in.nextInt();
            final double CMPERINCH = 2.45;
            cm = inch * CMPERINCH;

            System.out.println("You are " + cm + " centimeters tall...") ;
            System.out.println("Wow so cool, am i right!!");

            String Last;
            Last = in.next();
            Scanner in3 = new Scanner(System.in) ;
            System.out.print("Okay... well GOOD BYE");
            System.out.println(" ");
            System.out.println(".......");

            // Mean Computer Original****************************

            // Scratch Code
            // -----------
            String name1;
            name1 = "Caleb";
            int feet1;
            feet1 = inch / 12;
            int inch1;
            inch1 = in;
            String height;
            height = feet1 + "\'" + " " + inch1 + "\"" ;
            System.out.println("so, i actually want to tell you something");
            System.out.printf( "I really don't like %s \n" , name1 );
            System.out.printf("He is only %s \n" , height);
            System.out.print("Now if you lived in almost any other part of the world " + name1 + " would be " ) ;



            // scratch Code




        }
    }