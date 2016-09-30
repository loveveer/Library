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
                  
        member[0] = member.addMember("Abhishek", "Gaba", "0451222334", "email@gmail.com");
        member[1] = member.addMember("Lakhveer", "Singh", "0451234454", "email@gmail.com");
    }                   
     
	@Test
    public void testHasFinesPayable() {
        member[0].finesCount = 2;
		member[0].hasFinesPayable();
        assertTrue();
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
