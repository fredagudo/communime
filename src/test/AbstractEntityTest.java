package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mftech.communime.entity.AbstractEntity;
import com.mftech.communime.entity.Person;

public class AbstractEntityTest {

	@Test
	public void testCreation() {
		AbstractEntity ab = new Person("fred","led",null);
        
		assertNotNull(ab.getCreatedDate());
	}
}
