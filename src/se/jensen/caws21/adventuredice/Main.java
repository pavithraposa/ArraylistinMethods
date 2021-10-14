package se.jensen.caws21.adventuredice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code using Methods in class Arraylist
        ArrayList<String> movienames = telugumovie();//creating a Method withe name telugumovie
        Collections.sort(movienames);//sorting the names in an alphabetical order
        System.out.println("The list of favorite names: " + movienames);
        for(int i =0; i< movienames.size();i++){
            System.out.print("Write the actor name Film " + (i+1) + ":");
            String Actornames= leadactor();
            movienames.set(i,Actornames);
        }

        System.out.print("The list of actor names: " + movienames);
    }

    public static ArrayList<String> telugumovie(){  //Method that creates list

        ArrayList<String> listing = new ArrayList<String>();
        listing.add("Bahubali1");
        listing.add("U Turn");
        listing.add("Rangasthalam");
        listing.add("Bahubali2");
        return listing;
    }
    public static String leadactor(){

        Scanner favoritemoviename= new Scanner(System.in);//write the new favorite movie name
        String Writethename=favoritemoviename.nextLine();
        return Writethename;
    }
}
