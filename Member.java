//******************************************************************* 
//David Hand
//October 27, 2011
//CSC 250-01: Accelerated Computer Science I & II
//Peter DePasquale
//******************************************************************* 


//*******************************************************************
//Member.java
//Represents a member of squale.com.  Stores the record number, 
//member info object, and address object.  Implements Comparable
//and rewrites compareTo method to compare different member objects.
//*******************************************************************

public class Member implements Comparable
{
	//record number of the member
	private int number; 
	
	//holds address information of the member
	private Address address; 
	
	//holds member info of the member
	private MemberInfo memberInfo; 
	
	//---------------------------------------------------------------
	//Constructor: Creates member object with record number, member
	//info object, and address object.
	//
	//@param	number	Integer of member's record number
	//@param	memberInfo	Object of member's personal information
	//@param	address	Object of member's address information
	//---------------------------------------------------------------
	public Member (int number, MemberInfo memberInfo, Address address)
	{
	this.number = number;
	this.memberInfo = memberInfo;
	this.address = address;
	}

	//---------------------------------------------------------------
	//compareTo: Overwrites compareTo method in Comparable.  
	//Compares two member objects based first on zip code
	//(descending order), then state (ascending order), then 
	//street ddress (descending order), then last name (descending
	//order).  If all four fields are the same, members are equal.
	//
	//@param	object	Object to be cast as a Member object
	//@return 1 if greater than, -1 if less than, 0 if equal
	//---------------------------------------------------------------
	public int compareTo(Object object)
	{
		Member compared = (Member) object;

		if (address.getZipCode() > compared.address.getZipCode())
			return -1;
		if (address.getZipCode() < compared.address.getZipCode())
			return 1;
		else
		{
			if (address.getState().compareTo(compared.address.getState()) > 0)
			return 1;
			if (address.getState().compareTo(compared.address.getState()) < 0)
			return -1;
		
			else
			{
				if (address.getStreetAddress().compareTo(compared.address.getStreetAddress()) > 0)
				return 1;
				if (address.getStreetAddress().compareTo(compared.address.getStreetAddress()) < 0)
				return -1;

				else
				{
					if (memberInfo.getSurname().compareTo(compared.memberInfo.getSurname()) > 0)
					return 1;
					if (memberInfo.getSurname().compareTo(compared.memberInfo.getSurname()) < 0)
					return -1;

					else
						return 0;
				}
			}
		}
	}
	
	//---------------------------------------------------------------
	//Accessor for record number.
	//
	//@return the record number
	//---------------------------------------------------------------
	public int getNumber ()
	{
	return number;
	}
	
	//---------------------------------------------------------------
	//Accessor for member info object.
	//
	//@return the member info object
	//---------------------------------------------------------------
	public String getMemberInfo ()
	{
	return memberInfo.toString();
	}
	
	//---------------------------------------------------------------
	//Accessor for address object.
	//
	//@return the address object
	//---------------------------------------------------------------
	public String getAddress ()
	{
	return address.toString();
	}
	
	//---------------------------------------------------------------
	//Mutator for record number.  Record number is not modified if 
	//value is not valid.
	//
	//@param	number2	Integer of the new record number
	//---------------------------------------------------------------
	public void setNumber (int number2)
	{
	if (number2 > 0)
		number = number2;
	}
	
	//---------------------------------------------------------------
	//Mutator for member info object.
	//
	//@param	memberInfo2	MemberInfo object of the new member info
	//---------------------------------------------------------------
	public void setMemberInfo (MemberInfo memberInfo2)
	{
	memberInfo = memberInfo2;
	}
	
	//---------------------------------------------------------------
	//Mutator for address object.
	//
	//@param	address2	Address object of the new address
	//---------------------------------------------------------------
	public void setAddress (Address address2)
	{
	address = address2;
	}
	
	//---------------------------------------------------------------
	//Returns a string representation of the member object.
	//
	//@return	String representation of member
	//---------------------------------------------------------------
	public String toString ()
	{
	return (number + "\t" + memberInfo + "\t" + address);
	}
}