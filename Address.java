//******************************************************************* 
//David Hand
//October 27, 2011
//CSC 250-01: Accelerated Computer Science I & II
//Peter DePasquale
//******************************************************************* 

//Import the NumberFormat class from Java

import java.text.NumberFormat;

//*******************************************************************
//Address.java
//Represents the address of a member.  Stores the street address,
//city, state, and zip code.
//*******************************************************************

public class Address
{
	//zip code of the member
	private int zipCode;
	
	//street address, city, and state of the member
	private String streetAddress, city, state;  
	
	//---------------------------------------------------------------
	//Constructor: Creates address object with street address, city,
	//state, and zipCode parameters passed in.
	//
	//@param	streetAddress	String of address' street address
	//@param	city	String of address' city
	//@param	state	String of address' state
	//@param	zipCode	Integer of address' zip code
	//---------------------------------------------------------------
	public Address (String streetAddress, String city, String state, int zipCode)
	{
	this.streetAddress = streetAddress;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
	}
	
	//---------------------------------------------------------------
	//Accessor for street address.
	//
	//@return the street address
	//---------------------------------------------------------------
	public String getStreetAddress ()
	{
	return streetAddress;
	}
	
	//---------------------------------------------------------------
	//Accessor for city.
	//
	//@return the city
	//---------------------------------------------------------------
	public String getCity ()
	{
	return city;
	}
	
	//---------------------------------------------------------------
	//Accessor for state.
	//
	//@return the state
	//---------------------------------------------------------------
	public String getState ()
	{
	return state;
	}
	
	//---------------------------------------------------------------
	//Accessor for zip code.
	//
	//@return the zip code
	//---------------------------------------------------------------
	public int getZipCode ()
	{
	return zipCode;
	}
	
	//---------------------------------------------------------------
	//Mutator for street address.
	//
	//@param	streetAddress2	String of the new street address
	//---------------------------------------------------------------
	public void setStreetAddress (String streetAddress2)
	{
	streetAddress = streetAddress2;
	}
	
	//---------------------------------------------------------------
	//Mutator for city.
	//
	//@param	city2	String of the new city
	//---------------------------------------------------------------
	public void setCity (String city2)
	{
	city = city2;
	}
	
	//---------------------------------------------------------------
	//Mutator for state.
	//
	//@param	state2	String of the new state
	//---------------------------------------------------------------
	public void setState (String state2)
	{
	state = state2;
	}
	
	//---------------------------------------------------------------
	//Mutator for zip code.  Zip code is not modified if value is 
	//not valid.
	//
	//@param	zipCode2	Integer of the new zip code
	//---------------------------------------------------------------
	public void setZipCode (int zipCode2)
	{
	if (zipCode2 >= 0)
		zipCode = zipCode2;
	}
	
	//---------------------------------------------------------------
	//Returns a string representation of the address.  Formats the
	//zip code to always have five digits.
	//
	//@return	String representation of address
	//---------------------------------------------------------------
	public String toString ()
	{
	NumberFormat form = NumberFormat.getInstance();
	form.setMinimumIntegerDigits(5);
	form.setGroupingUsed(false);
	
	return (streetAddress + "\t" + city + "\t" + state + "\t" + form.format(zipCode));
	}
}