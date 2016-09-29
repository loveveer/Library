/*
Entity Class for Member Object
Creating Member Object as advised in Assignment Instructions
*/

package library.entities;
import java.util.List;

public interface Member {
	public static final int LOAN_LIMIT = 5;
	//setting maximum fine constant to 5
	public static final int FINE_MAX = 5;
	
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
		finesCount = finesCount +1;
	}
	
	public void    payFine(float payment);
	public void    addLoan(ILoan loan);
	public List<ILoan> getLoans();
	public void    removeLoan(ILoan loan);
	public EMemberState   getState();
	public String  getFirstName();
	public String  getLastName();
	public String  getContactPhone();
	public String  getEmailAddress();
	public int     getID();
	
}
