package tests.library;

import static org.junit.Assert.*;
import org.junit.Test;

import library.entities.Member;

import library.*;
import library.daos.*;
import library.interfaces.EBorrowState;
import library.interfaces.daos.*;

public class TestMember {
    
	private void setUpTestData() {
        Member[] member = new Member[5];
                  
        member[0] = member.addMember("fName0", "lName0", "0001", "email0");
        member[1] = member.addMember("fName1", "lName1", "0002", "email1");
                       
        //create a member with overdue loans        
        for (int i=0; i<2; i++) {
            ILoan loan = loanDAO.createLoan(member[1], book[i]);
            loanDAO.commitLoan(loan);
        }
        		
        //create a member with maxed out unpaid fines
        member[2].addFine(10.0f);
        
        //create a member with maxed out loans
        for (int i=2; i<7; i++) {
            ILoan loan = loanDAO.createLoan(member[3], book[i]);
            loanDAO.commitLoan(loan);
        }
        
        //a member with a fine, but not over the limit
        member[4].addFine(5.0f);
        
        //a member with a couple of loans but not over the limit
        for (int i=7; i<9; i++) {
            ILoan loan = loanDAO.createLoan(member[5], book[i]);
            loanDAO.commitLoan(loan);
        }
    }

    
    @Test
    public void testHasOverdueLoans() {
        //arrange
                
        assertTrue();
    }
	
	@Test
    public void testHasReachedLoanLimit() {
        //arrange
                
        assertTrue();
    }
    
}
