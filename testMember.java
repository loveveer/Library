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
        member[1] = member.addMember("Loveveer", "Singh", "0451234454", "email@gmail.com");
    }                   

	/*
	Unit test for  hasFinesPayable() method of entity class Member
	*/	
	@Test
    public void testHasFinesPayable() {
        member[0].finesCount = 2;
		member[0].hasFinesPayable();
        assertTrue();
    }
	
	/*
	Unit test for testAddFines() method of entity class Member
	*/	 
	@Test
    public void testAddFines() {
        member[1].addFine(1000);
		member[1].addFine(1500);
        member[1].addFine(500);        
        assertEquals(3000, member[1].totalFines);
    } 
	
	/*
	Unit test for payFines() method of entity class Member
	*/
	@Test
    public void testPayFines() {
        member[1].payFines(1000);
		assertEquals(2000, member[1].totalFines);
    }
	
	/*
	Unit test for addLoan() method of entity class Member
	*/
	@Test
    public void testAddLoan() {
        member[1].payFines(1000);
		assertEquals(2000, member[1].totalFines);
    }
	
	/*
	Unit test for removeLoan() method of entity class Member
	*/
	@Test
    public void testRemoveLoan() {
        member[1].payFines(1000);
		assertEquals(2000, member[1].totalFines);
    }
	
	/*
	Unit test for getFirstName() method of entity class Member
	*/
	@Test
    public void testGetFirstName() {
		string  fname = member[1].getFirstName();
		assertEquals("Loveveer", fname);
	}
	
	/*
	Unit test for getLastName() method of entity class Member
	*/
	@Test
    public void testGetLastName() {
		string  lname = member[1].getLastName();
		assertEquals("Singh", lname);
	}
	
	/*
	Unit test for getContactPhone() method of entity class Member
	*/
	@Test
    public void testGetContactPhone() {
		string  phone = member[1].getContactPhone();
		assertEquals("0456687784", phone);
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
