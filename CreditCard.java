//******************************************************************* 
//David Hand
//October 27, 2011
//CSC 250-01: Accelerated Computer Science I & II
//Peter DePasquale
//******************************************************************* 

//Import the NumberFormat class from Java

import java.text.NumberFormat;

//*******************************************************************
//CreditCard.java
//Represents the credit card of a member.  Stores the credit card
//type, number, verification number, and expiration date.
//*******************************************************************

public class CreditCard
{
	//credit card number of the member
	private long ccNumber; 
	
	//credit card verification number of the member
	private int cvv2;  
	
	//credit card type and expiration date of the member
	private String ccType, ccExpires;  
	
	//---------------------------------------------------------------
	//Constructor: Creates credit card object with credit card type, 
	//number, verification number, and expiration date passed in.
	//
	//@param	ccType	String of credit card's type
	//@param	ccNumber	Long of credit card's number
	//@param	cvv2	Integer of credit card's verification number
	//@param	ccExpires	String of credit card's expiration date
	//---------------------------------------------------------------	
	public CreditCard (String ccType, long ccNumber, int cvv2, String ccExpires)
	{
	this.ccType = ccType;
	this.ccNumber = ccNumber;
	this.cvv2 = cvv2;
	this.ccExpires = ccExpires;
	}
	
	//---------------------------------------------------------------
	//Accessor for credit card type.
	//
	//@return the credit card type
	//---------------------------------------------------------------
	public String getCCType ()
	{
	return ccType;
	}
	
	//---------------------------------------------------------------
	//Accessor for credit card number.
	//
	//@return the credit card number
	//---------------------------------------------------------------	
	public long getCCNumber ()
	{
	return ccNumber;
	}
	
	//---------------------------------------------------------------
	//Accessor for credit card verification number.
	//
	//@return the credit card verification number
	//---------------------------------------------------------------
	public int getCVV2 ()
	{
	return cvv2;
	}
	
	//---------------------------------------------------------------
	//Accessor for credit card expiration date.
	//
	//@return the credit card expiration date
	//---------------------------------------------------------------
	public String getCCExpires ()
	{
	return ccExpires;
	}
	
	//---------------------------------------------------------------
	//Mutator for credit card type.
	//
	//@param	ccType2	String of the new credit card type
	//---------------------------------------------------------------
	public void setCCType (String ccType2)
	{
	ccType = ccType2;
	}
	
	//---------------------------------------------------------------
	//Mutator for credit card number.  Credit card number is not
	//modified if value is not valid.
	//
	//@param	ccNumber2	Long of the new credit card number
	//---------------------------------------------------------------
	public void setCCNumber (long ccNumber2)
	{
	if (ccNumber2 >= 0)
		ccNumber = ccNumber2;
	}
	
	//---------------------------------------------------------------
	//Mutator for credit card verification number.  Credit card
	//verification number is not modified if value is not valid.
	//
	//@param	cvv22	Integer of the new credit card verification number
	//---------------------------------------------------------------
	public void setCVV2 (int cvv22)
	{
	if (cvv22 >= 0)
		cvv2 = cvv22;
	}
	
	//---------------------------------------------------------------
	//Mutator for credit card expiration date.
	//
	//@param	ccExpires2	String of the new credit card expiration date
	//---------------------------------------------------------------
	public void setCCExpires (String ccExpires2)
	{
	ccExpires = ccExpires2;
	}
	
	//---------------------------------------------------------------
	//Returns a string representation of the credit card.  Formats
	//the credit card number to always have 16 digits and the
	//verification code to always have 3 digits.
	//
	//@return	String representation of credit card
	//---------------------------------------------------------------
	public String toString ()
	{
	NumberFormat form1 = NumberFormat.getInstance();
	form1.setMinimumIntegerDigits(16);
	form1.setGroupingUsed(false);
	
	NumberFormat form2 = NumberFormat.getInstance();
	form2.setMinimumIntegerDigits(3);
	form2.setGroupingUsed(false);
	
	return (ccType + "\t" + form1.format(ccNumber) + "\t" + form2.format(cvv2) + "\t" + ccExpires);
	}
}