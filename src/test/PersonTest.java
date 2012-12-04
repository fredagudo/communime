package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mftech.communime.entity.Person;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person("Joe", "Schmoe", 3412414);

		assertNotNull(person.getCreatedDate());
		assertEquals(person.getFirstName(), "Joe");
		assertEquals(person.getCreatedById(), new Integer(3412414));

	}
}
