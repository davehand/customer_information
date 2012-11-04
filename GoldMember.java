//******************************************************************* 
//David Hand
//October 27, 2011
//CSC 250-01: Accelerated Computer Science I & II
//Peter DePasquale
//******************************************************************* 


//*******************************************************************
//GoldMember.java
//Represents a gold member of squale.com.  Extends member object to 
//include credit card and ups tracking information.  Stores the 
//record number, member info object, address object, credit card 
//object, and ups tracking code.
//*******************************************************************

public class GoldMember extends Member
{
	//ups tracking code of a gold member
	private String upsTrackingCode;  
	
	//holds credit card information of a gold member
	private CreditCard creditCard; 
	
	//---------------------------------------------------------------
	//Constructor: Creates gold member object with record number, 
	//member info object, address object, credit card object, and
	//ups tracking code.
	//
	//@param	number	Integer of member's record number
	//@param	memberInfo	Object of member's personal information
	//@param	address	Object of member's address information
	//@param	creditCard	Object of member's credit card information
	//@param	upsTrackingCode	String of member's ups tracking code
	//---------------------------------------------------------------
	public GoldMember (int number, MemberInfo memberInfo, Address address, CreditCard creditCard, 
						String upsTrackingCode)
	{
		super (number, memberInfo, address);
		this.creditCard = creditCard;
		this.upsTrackingCode = upsTrackingCode;
	}
	
	//---------------------------------------------------------------
	//Accessor for credit card object.
	//
	//@return the credit card object
	//---------------------------------------------------------------
	public String getCreditCard ()
	{
	return creditCard.toString();
	}
	
	//---------------------------------------------------------------
	//Accessor for ups tracking code.
	//
	//@return the ups tracking code
	//---------------------------------------------------------------
	public String getUpsTrackingCode ()
	{
	return upsTrackingCode;
	}
	
	//---------------------------------------------------------------
	//Mutator for credit card object.
	//
	//@param	creditCard2	CreditCard object of the new credit card.
	//---------------------------------------------------------------
	public void setCreditCard (CreditCard creditCard2)
	{
	creditCard = creditCard2;
	}
	
	//---------------------------------------------------------------
	//Mutator for ups tracking code.
	//
	//@param	upsTrackingCode2	String of the new ups tracking code.
	//---------------------------------------------------------------
	public void setUpsTrackingCode (String upsTrackingCode2)
	{
	upsTrackingCode = upsTrackingCode2;
	}
	
	//---------------------------------------------------------------
	//Returns a string representation of the gold member object.
	//
	//@return	String representation of gold member
	//---------------------------------------------------------------
	public String toString ()
	{
	String result = super.toString();
	result = result + "\t" + creditCard + "\t" + upsTrackingCode;
	return result;
	}
}