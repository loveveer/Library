/*
Entity Class for Member Object
Creating Member Object as advised in Assignment Instructions
*/

package library.entities;
import java.util.List;

public interface Member implements IMember, IMemberDAO {
	public static final int LOAN_LIMIT = 5;
	//setting maximum fine constant to 5
	public static final int FINE_MAX = 5;
	//initializing borrowing allowed for a member
	public static final int BORROWING_DISALLOWED = TRUE;
	
	private int id;
	private string firstName;
	private string lastName;
	private string contactPhone;
	private string emailAddress;
	//declaring total fines var and initialing it to 0;
	private float totalFines = 0;
	//declaring fines counter var and initialing it to 0;
	private int finesCount = 0;
	private ILoan loanList[LOAN_LIMIT];
	private int loansCount = 0;
	//declaring member object of IMember class
	private List<IMember> member;
	
	/*
	Implementing IMemberDAO Interface class methods and integrating with Member
	*/	
	public IMember addMember(String fName, String lName, String Phone, String eAddress){	
		member.firstName = fName;
		member.lastName = lName;
		member.contactPhone = Phone;
		member.emailAddress = eAddress;
	}
	
	/*
	Integrating IMemberDAO and Member classes, implementing getMemberByID() of IMemberDAO class
	*/
	public IMember getMemberByID(int id){
		if(member.binarySearch(id, 3) == 0){
			return member;
		}
	}
	
	/*
	Integrating IMemberDAO and Member classes, implementing listMembers() of IMemberDAO class
	*/	
	public List<IMember> listMembers(){
		return member;
	}
	
	/*
	Integrating IMemberDAO and Member classes, implementing findMembersByLastName() of IMemberDAO class
	*/
	public List<IMember> findMembersByLastName(String lName){
		if(member.binarySearch(lastName, lName) == 0){
			return member;
		}
	}

	/*
	Integrating IMemberDAO and Member classes, implementing findMembersByEmailAddress() of IMemberDAO class
	*/
	public List<IMember> findMembersByEmailAddress(String email){
		if(member.binarySearch(emailAddress, email) == 0){
			return member;
		}		
	}
	
	/*
	Integrating IMemberDAO and Member classes, implementing findMembersByNames() of IMemberDAO class
	*/
	public List<IMember> findMembersByNames(String fName, String lName){
		if(member.binarySearch(firstName, fName) == 0 && member.binarySearch(lastName, lName) == 0){
			return member;
		}
	}
	
	/*
	Implementing IMember Interface class methods
	*/
	
	public boolean hasOverDueLoans(){
		if loanList[0].isOverDue() == 1
			return true;
		return false;
	}
	
	public boolean hasReachedLoanLimit(){
		if count(loanList[]) < LOAN_LIMIT
			return false;
		retrun true;
	}
	
	/* 	
	returns true if the fines currently owed by the Member exceeds zero 
	returns false otherwise 
	*/
	public boolean hasFinesPayable(){
		if finesCount > 0
			return true;
		return false;
	}
	
	/*
	returns true if	the fines owing by the Member is equals or is greater than FINE_MAX 
	returns false otherwise 
	*/
	public boolean hasReachedFineLimit(){
		if finesCount == FINE_MAX
			return true;
		return false;
	}
	
	/*
	returns the amount of fines owing by the Member 
	*/
	public float   getFineAmount(){
		return totalFines;
	}
	
	/*
	Increments the fines owing by amount 
	*/
	public void    addFine(float fine){
		totalFines = totalFines + fine;
		finesCount = finesCount + 1;
	}
	
	/*
	Increments the fines owing by amount 
	*/	
	public void    payFine(float payment){
		totalFines = totalFines - payment;
		finesCount = finesCount - 1;
	}
	
	/*
	Adds loan to the Members list of current loans 
	*/
	public void    addLoan(ILoan loan){
		loanList[loansCount] = loan;
		loansCount = loansCount + 1;
	}
	
	/*
	returns a copy of the Members current loan list 
	*/
	public List<ILoan> getLoans(){
		return loanList;
	}
	
	/*
	Removes a loan from the Members list of current loans 
	*/
	public void    removeLoan(ILoan loan){
		loansCount = loansCount - 1;
		loanList[loansCount] = NULL;		
	}
	
	/*
	returns the current MemberState of the Member 
	*/
	public EMemberState   getState(){
		return;
	}
	
	/*
	returns the firstName of the Member 
	*/
	public String  getFirstName(){
		return firstName;
	}
	
	/*
	returns the lastName of the Member 
	*/
	public String  getLastName(){
		return lastName;
	}
	
	/*
	returns the contactPhone of the Member 
	*/
	public String  getContactPhone(){
		return contactPhone;
	}
	
	/*
	returns the emailAddress of the Member 
	*/
	public String  getEmailAddress(){
		return emailAddress;
	}
	
	/*
	returns the unique id of the member 
	*/
	public int     getID(){
		return id;
	}
	
}
