/*
Entity Class for Member Object
Creating Member Object as advised in Assignment Instructions
*/

package library.entities;
import java.util.List;

public interface Member {
	public static final int LOAN_LIMIT = 5;
	
	private int id;
	private string firstName;
	private string lastName;
	private string contactPhone;
	private string emailAddress;
	private float totalFines;
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
	
	public boolean hasFinesPayable();
	public boolean hasReachedFineLimit();
	public float   getFineAmount();
	public void    addFine(float fine);
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
