/*
Entity Class for Member Object
Creating Member Object as advised in Assignment Instructions
*/

package library.entities;
import java.util.List;

public interface Member {
	private string fname;
	private string lname;
	
	public boolean hasOverDueLoans();
	public boolean hasReachedLoanLimit();
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
