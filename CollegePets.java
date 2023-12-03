/**Student Name: First Last
 * *Date Completed: 02/21/2022
 * *Project No. and Page No. in the book: Chapter 2 PP
 * *Extra Credit: No 
 * *Project Description: The program is collecting the users input to show a college student 
 * 						 that misses there pet, while also collecting the user's pet's information
 * 						 to display the amount of seconds the user misses their pets and also calculating the 
 * 						 amount of times the user would say their phrase to their pet
 **/ 


package college;

import java.util.Scanner;
public class CollegePets {

	public static void main(String[] args) {
	// declare constants and variables to appropriate data types
	final long HOURS_DAY = 24,SECONDS_HR = 3600, DAYS_WEEK = 7;
	
	double petAge, awayPet;
	
	String name, college, petName, phraseToPet;
	
	Scanner scan = new Scanner (System.in); //creating scanner object to be used in code
	
	//-----------------------------------------------
	//Retrieves user input through the scanner object 
	//-----------------------------------------------
	System.out.println("What is your full name: ");
	name = scan.nextLine();
	
	System.out.println("What college are you attending: ");
	college = scan.nextLine();
	
	System.out.println("What is your pet's name? ");
	petName = scan.nextLine();
	
	System.out.println("What do you say to your pet " + petName + " every day? ");
	phraseToPet = scan.nextLine();
	
	System.out.println("How old is " + petName + " ? ");
	petAge = scan.nextInt();
	
	System.out.println("How many days have you been away from your pet? ");
	awayPet = scan.nextInt();
	
	//----------------------------
	//Display's user inputs. Makes use of calculations with users input 
	//----------------------------
	System.out.println(); // empty line's to give space between user input and user display
	
	System.out.println();
	
	System.out.println("Hello, my name is " + name +"\n");
	
	System.out.println("I am enjoying my time at " + college + 
						"\nthough I miss my pet " + petName + " very much\n");
	
	System.out.println("I have been away from " + petName + " for " + (int)awayPet + " days\n");
	//convert calculations to long so that the calculations will display as a whole number
	System.out.println("and that is an unbelievable " + (long)(HOURS_DAY*awayPet*SECONDS_HR) + " seconds\n");
	// cast as an int to keep output as a solid number
	System.out.println("I have missed saying " + "\""+ phraseToPet +"\"" + " to " + petName + " for " + (int)awayPet + " days\n");
	
	System.out.println ("Even if I say it every week, not every day \nI would still have missed saying " 
						+ "\"" + phraseToPet + "\" for " + (awayPet/DAYS_WEEK) + " times."); 
	}

}