package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.mftech.communime.entity.Person;
import com.mftech.communime.type.NewStatus;
import com.mftech.communime.type.Status;

public class PersonTest {
	Person person;

	@Before
	public void init() {
		person = new Person("Joe", "Schmoe", 3412414);

	}

	@Test
	public void test() {

		assertNotNull(person.getCreatedDate());
		assertEquals(person.getFirstName(), "Joe");
		assertEquals(person.getCreatedById(), new Integer(3412414));

	}

	@Test
	public void testStatusTypes() {

		assertEquals(NewStatus.name, person.getStatus().name());
		assertTrue(person.isNew());

	}
}
