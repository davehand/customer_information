//******************************************************************* 
//David Hand
//October 27, 2011
//CSC 250-01: Accelerated Computer Science I & II
//Peter DePasquale
//******************************************************************* 

//Import the Array class from Java

import java.util.Arrays;

//*******************************************************************
//Driver.java
//Creates an array of Members and a Creator object.  Performs 
//various tasks with the Creator object to change and output the
//array of members.
//*******************************************************************

public class Driver
{

//-------------------------------------------------------------------
//main: instantiates an array of Members.  Calls a method to 
//populate the array with Member and GoldMember objects.  Sorts the 
//array.  Then, calls another method to output the sorted array to
//a text file, one member per line.
//-------------------------------------------------------------------
	public static void main (String[] args)
	{
		//creates members array
		Member [] members = new Member [40000];
		
		//instantiates Creator object
		Creator creator = new Creator();
		
		//populates the members array
		members = creator.buildArray();

		//sorts the array using the compareTo method in the Member class
		Arrays.sort(members);  

		//creates a new text file and writes each Member of the array to the text file 
		creator.writeToFile(members);
		
		//prints successful message if array is populated, sorted, and output
		System.out.println ("Member data has been sorted and output to a local text file");
	}
}