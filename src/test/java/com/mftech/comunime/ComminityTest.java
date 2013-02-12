package com.mftech.communime;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mftech.communime.entity.Community;
import com.mftech.communime.entity.Org;
import com.mftech.communime.entity.Party;
import com.mftech.communime.entity.Person;

public class ComminityTest {
	Community comm;
	Org acmeOrge;
	Person angiePers;
	@Rule
    public ExpectedException thrown= ExpectedException.none();


	@Before
	public void init() {
		acmeOrge = new Org("Acme", 23122);
		angiePers = new Person("angie", "mangie", 3122);
		
		comm = new Community("Comm1");
		
		comm.add(new Person("fred", "morse", 31322));
		comm.add(acmeOrge);	
		comm.add(angiePers);
		comm.add(new Person("Max", "mosley", 31622));
	}

	@Test
	public void testAddMembers() {

		assertNotNull(comm.getMembers());

		assertEquals(4, comm.getMembers().size());

		assertTrue(comm.getMembers().contains(acmeOrge));

	}

	@Test
	public void testRemoveMembers() {
		Party person = new Person("Andfes", "xwes", 31622);
		comm.add(person);
		assertEquals(5, comm.getMembers().size());
		comm.remove(person);
		assertEquals(4, comm.getMembers().size());
	}

	@Test
	public void testRecursion() {
		Community myComm = new Community("Comm2");
		comm.add(myComm);
		assertEquals(5, comm.getMembers().size());
		
	}

	@Test  //(expected=NullPointerException.class)
	public void testDuplicateCommunityMembers() {
		comm.add(angiePers);
		assertEquals(4, comm.getMembers().size());
		
		Person angiePers2 = new Person("angie", "mangie", 3122);  //todo think about how to handle duplicate members
		comm.add(angiePers2);
		
		assertEquals(5, comm.getMembers().size());
		
	}

}
