//******************************************************************* 
//David Hand
//October 27, 2011
//CSC 250-01: Accelerated Computer Science I & II
//Peter DePasquale
//******************************************************************* 


//*******************************************************************
//MemberInfo.java
//Represents the personal information of a member.  Stores the 
//first name, middle initial, surname, gender, email address, 
//national identification, telephone number, and birthday.
//*******************************************************************

public class MemberInfo
{
	//first name, middle initial, surname, gender, e-mail, and national ID of the member
	private String givenName, middleInitial, surname, gender, emailAddress, nationalID;
	
	//telephone number and birthday of the member
	private String telephoneNumber, birthday;
	
	//---------------------------------------------------------------
	//Constructor: Creates member info object with gender, first 
	//name, middle initial, surname, email address, national ID, 
	//telephone number, and birthday passed in.
	//
	//@param	gender	String of member's gender
	//@param	givenName	String of member's first name
	//@param	middleInitial	String of member's middleInitial
	//@param	surname	String of member's surname
	//@param	emailAddress	String of member's email address
	//@param	nationalID	String of member's national ID
	//@param	telephoneNumber	String of member's telephone number
	//@param	birthday	String of member's birthday
	//---------------------------------------------------------------	
	public MemberInfo (String gender, String givenName, String middleInitial, String surname,
				String emailAddress, String nationalID, String telephoneNumber, String birthday)
	{
	this.gender = gender;
	this.givenName = givenName;
	this.middleInitial = middleInitial;
	this.surname = surname;
	this.emailAddress = emailAddress;
	this.nationalID = nationalID;
	this.telephoneNumber = telephoneNumber;
	this.birthday = birthday;
	}
	
	//---------------------------------------------------------------
	//Accessor for gender.
	//
	//@return the gender
	//---------------------------------------------------------------
	public String getGender ()
	{
	return gender;
	}
	
	//---------------------------------------------------------------
	//Accessor for first name.
	//
	//@return the first name
	//---------------------------------------------------------------
	public String getGivenName ()
	{
	return givenName;
	}
	
	//---------------------------------------------------------------
	//Accessor for middle initial.
	//
	//@return the middle initial
	//---------------------------------------------------------------
	public String getMiddleInitial ()
	{
	return middleInitial;
	}
	
	//---------------------------------------------------------------
	//Accessor for surname.
	//
	//@return the surname
	//---------------------------------------------------------------
	public String getSurname ()
	{
	return surname;
	}
	
	//---------------------------------------------------------------
	//Accessor for email address.
	//
	//@return the email address
	//---------------------------------------------------------------
	public String getEmailAddress ()
	{
	return emailAddress;
	}
	
	//---------------------------------------------------------------
	//Accessor for national ID.
	//
	//@return the national ID
	//---------------------------------------------------------------
	public String getNationalID ()
	{
	return nationalID;
	}
	
	//---------------------------------------------------------------
	//Accessor for telephone number.
	//
	//@return the telephone number
	//---------------------------------------------------------------
	public String getTelephoneNumber ()
	{
	return telephoneNumber;
	}
	
	//---------------------------------------------------------------
	//Accessor for birthday.
	//
	//@return the birthday
	//---------------------------------------------------------------
	public String getBirthday ()
	{
	return birthday;
	}
	
	//---------------------------------------------------------------
	//Mutator for gender.
	//
	//@param	gender2	String of the new gender
	//---------------------------------------------------------------
	public void setGender (String gender2)
	{
	gender = gender2;
	}
	
	//---------------------------------------------------------------
	//Mutator for first name.
	//
	//@param	givenName2	String of the new first name
	//---------------------------------------------------------------
	public void setGivenName (String givenName2)
	{
	givenName = givenName2;
	}
	
	//---------------------------------------------------------------
	//Mutator for middle initial.
	//
	//@param	middleInitial2	String of the new middle initial
	//---------------------------------------------------------------
	public void setMiddleInitial (String middleInitial2)
	{
	middleInitial = middleInitial2;
	}
	
	//---------------------------------------------------------------
	//Mutator for surname.
	//
	//@param	surname2	String of the new surname
	//---------------------------------------------------------------
	public void setSurname (String surname2)
	{
	surname = surname2;
	}
	
	//---------------------------------------------------------------
	//Mutator for email address.
	//
	//@param	emailAddress2	String of the new email address
	//---------------------------------------------------------------
	public void setEmailAddress (String emailAddress2)
	{
	emailAddress = emailAddress2;
	}
	
	//---------------------------------------------------------------
	//Mutator for national ID.
	//
	//@param	nationalID2	String of the new national ID
	//---------------------------------------------------------------
	public void setNationalID (String nationalID2)
	{
	nationalID = nationalID2;
	}
	
	//---------------------------------------------------------------
	//Mutator for telephone number.
	//
	//@param	telephoneNumber2	String of the new telephone number
	//---------------------------------------------------------------
	public void setTelephoneNumber (String telephoneNumber2)
	{
	telephoneNumber = telephoneNumber2;
	}
	
	//---------------------------------------------------------------
	//Mutator for birthday.
	//
	//@param	birthday2	String of the new birthday
	//---------------------------------------------------------------
	public void setBirthday (String birthday2)
	{
	birthday = birthday2;
	}
	
	//---------------------------------------------------------------
	//Returns a string representation of the member info.
	//
	//@return	String representation of member info
	//---------------------------------------------------------------
	public String toString ()
	{
	return (givenName + "\t" + middleInitial + "\t" + surname + "\t" + gender + "\t" + 
			emailAddress + "\t" + nationalID + "\t" + telephoneNumber + "\t" + birthday);
	}
}