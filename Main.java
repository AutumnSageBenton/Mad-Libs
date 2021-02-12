
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
      System.out.println("\n\n\nMADLIBS");
      

       System.out.println("\n\n\nPlease input a VERB. ");
       String verb1 = sc.nextLine();

       System.out.println("\nPlease input another VERB. ");
       String verb2 = sc.nextLine();

       System.out.println("\nA third VERB does the charm! ");
       String verb3 = sc.nextLine();

       System.out.println("\nJust kidding only one more VERB. ");
       String verb4 = sc.nextLine();

       System.out.println("\n\nLet\'s get some descripitons going here. PLease input an ADJECTIVE. ");
       String adj1 = sc.nextLine();

       System.out.println("\nAnd a second ADJECTIVE ... ");
       String adj2 = sc.nextLine();

       System.out.println("\nA third time really will do the charm this time. PLease input a final ADJECTIVE. ");
       String adj3 = sc.nextLine();

       System.out.println("\n\nNow we need some nouns! Please input a NOUN. ");
       String noun1 = sc.nextLine();

       System.out.println("\nMaybe one more NOUN. ");
       String noun2 = sc.nextLine();

       System.out.println("\nA final NOUN for the win. ");
       String noun3 = sc.nextLine();

       System.out.println("\n\nHow about an object or two. \nPlease input an OBJECT. ");
       String object1 = sc.nextLine();

       System.out.println("\nI think two objects will do the trick. \nPlease input one more OBJECT. ");
       String object2 = sc.nextLine();

       System.out.println("\n\nPLease input a FORM OF COMMUNICATION. ");
       String formOCommunication = sc.nextLine();

       System.out.println("\n\nPlease input a person\'s NAME. ");
       String person = sc.nextLine();

       System.out.println("\n\nPlease input a PLACE. ");
       String place = sc.nextLine();
       
       System.out.print("\n\n\nIt's time to stop the " + verb1 + ". It's time to " + verb2 + " up tall." +
       "\nSing hey " + place + ", I'm " + adj1 + ", and here I am " + adj2 + " and all! " +
       "\n" + adj2 + " and all" + 
       "\nLet your " + adj3 + " flag wave" + 
       "\nMy what?" +
       "\nLet your " +  adj3 + " flag fly" + 
       "\nThats what I'm " + formOCommunication + " about!" +
       "\nNever " + verb3 + " it down, never " + verb3 + " it down" +
       "\n" + verb4 + " it way up high! Yeah! Let your " + adj3 + " flag fly! Let it fly, " + verb4 + ", fly!" +
       "\nIt's hard to be a " + object1 +
       "\nSo many " + object2 + "s attached. " +
       "\nYes! It all makes sense! We may be " + adj3 + ", but we're  " + adj3 + " with " + noun1 + "s, and " + noun2 +
       "s and magic " + noun3 + "s! \nAnd together, we can stand up to " + person + "\n\n\n\n");
       
       
    }
    
}