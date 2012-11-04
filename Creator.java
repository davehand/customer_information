//******************************************************************* 
//David Hand
//October 27, 2011
//CSC 250-01: Accelerated Computer Science I & II
//Peter DePasquale
//******************************************************************* 

//Import various classes from Java

import java.io.*;
import java.util.Scanner;
import java.net.URL;

//*******************************************************************
//Creator.java
//Performs various methods for Driver.java.  Performs methods to 
//either create the array of Member and GoldMember objects or write 
//an array of Members to a newly created file.
//*******************************************************************

public class Creator
{
	//record number, zip code, and credit card verification number of the member
	private int number, zipCode, cvv2;
	
	//credit card number of the member
	private long ccNumber;
	
	//gender, first name, middle initial, surname, and birthday of the member
	private String gender, givenName, middleInitial, surname, birthday;
	
	//street address, city, state, e-mail, telephone number, and national ID of the member
	private String streetAddress, city, state, emailAddress, telephoneNumber, nationalID;
	
	//credit card type, credit card expiration date, and ups tracking code of the member
	private String ccType, ccExpires, upsTrackingCode;
	
	//integer for counting purposes
	private int count = 0;
	
	//String of data that will be read in from file
	String urlLine;
	
	//Array to store Members and Gold Members
	Member [] members = new Member [40000];
	
	
	//-------------------------------------------------------------------
	//buildArray: Creates two scanners to scan each line of the data file
	//and scan each separate token of each data line.  Passes data 
	//scanned in to each variable.  Uses variables to build MemberInfo
	//and Address objects.  Checks if there is more data in the string.  
	//If there is no more data, creates a Member object with the data 
	//and objects already created.  If there is more data, scans in and 
	//assigns the rest of the data, then creates a GoldMember object 
	//with the data and objects created.  The Member or GoldMember 
	//object is then placed into the array.  Once both scanners are 
	//finished, the populated array is returned.  Performs a try-catch
	//and throws IOException if it occurs.
	//
	//@return	members	Array holding Member and GoldMember objects
	//@throws	IOException	if not connected to Internet
	//-------------------------------------------------------------------
	public Member[] buildArray ()
	{
	
	try
	{
		
	//declares URL to be used
	URL input = new URL ("https://s3.amazonaws.com/depasquale/personalData.txt");
		
	//creates Scanner to scan the URL
	Scanner lineScan = new Scanner (input.openStream());
	
	//scans first line to disregard column titles
	lineScan.nextLine();  
		
	while (count <= 39999)		
	{		
			urlLine = lineScan.nextLine();
	
			//scans a line of data and assigns each token to a variable
			Scanner dataScan = new Scanner (urlLine);
			dataScan.useDelimiter("\t");
			
			number = dataScan.nextInt();
			gender = dataScan.next();
			givenName = dataScan.next();
			middleInitial = dataScan.next();
			surname = dataScan.next();
			streetAddress = dataScan.next();
			city = dataScan.next();
			state = dataScan.next();
			zipCode = dataScan.nextInt();
			emailAddress = dataScan.next();
			telephoneNumber = dataScan.next();
			nationalID = dataScan.next();
			birthday = dataScan.next();
			
			//uses variables to make objects
			MemberInfo memberInfo1 = new MemberInfo (gender, givenName, middleInitial, surname, 
												emailAddress, nationalID, telephoneNumber, birthday);
			Address address1 = new Address (streetAddress, city, state, zipCode);
			
			
			//creates either a Member or GoldMember object based on amount of data on the line
			//Places the created object into the members array
			if (dataScan.hasNext(""))
			{
				Member member = new Member (number, memberInfo1, address1);
				members[count] = member;
			}
			else
			{
				ccType = dataScan.next();
				ccNumber = dataScan.nextLong();
				cvv2 = dataScan.nextInt();
				ccExpires = dataScan.next();
				upsTrackingCode = dataScan.next();
				
				CreditCard creditCard1 = new CreditCard (ccType, ccNumber, cvv2, ccExpires);
				
				GoldMember goldMember = new GoldMember (number, memberInfo1, address1, creditCard1, 
														upsTrackingCode);
				members[count] = goldMember;
			}
			
			//increments after object is created
			count++;  
	}
	
	}
	//catches IOException and terminates program gracefully
	catch (IOException exception)
	{
	System.out.println ("Please connect to the internet and try again.");
	System.exit(1);
	}
	
	
	return members;	
	}
	
	
	//-------------------------------------------------------------------
	//writeToFile: Creates an empty text file titled "sortedData.txt"
	//with the FileWriter class.  Then, uses FileWriter to write the 
	//category of each column to the file.  Then, writes each member of 
	//the array passed to the method on a separate line of the file.  
	//Closes the connection used to write to the file.  Performs a 
	//try-catch and throws IOException if it occurs.
	//
	//@param	members	Array holding the members created by input file
	//@throws	IOException if encounters any problems creating or writing to the file
	//-------------------------------------------------------------------
	public void writeToFile (Member[] members)
	{
		try
		{
		//creates new file
		FileWriter file = new FileWriter("sortedData.txt");
		
		//writes to file
		file.write ("Number\tName\tMI\tSurname\tGender\tE-mail\t\t\tNational ID\tPhone Number\t" + 
					  "Birthday\tStreet Address\tCity\tState\tZip Code\tCard Type\tCredit Card " +
					  "Number\tCVV\tExp. Date\tUPS Tracking Code");
		file.write ("\n");
		
		for (int i = 0; i <= 39999; i++)
		{
			file.write (members[i].toString());
			file.write ("\n");
		}
		
		file.close();
		
		}
		//catches IOException and terminates program gracefully		
		catch (IOException exception)
		{
		System.out.println ("Could not generate file");
		System.exit(1);
		}
	}
}
