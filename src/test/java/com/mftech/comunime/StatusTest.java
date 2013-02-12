package com.mftech.communime;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mftech.communime.entity.Party;
import com.mftech.communime.entity.Person;
import com.mftech.communime.type.ActiveStatus;
import com.mftech.communime.type.DeletedStatus;
import com.mftech.communime.type.FrozenStatus;
import com.mftech.communime.type.NewStatus;
import com.mftech.communime.type.RegisteredStatus;
import com.mftech.communime.type.Status;

public class StatusTest {

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	Person person;

	@Mock
	Person mockPerson;

	@Before
	public void init() {
		person = new Person("fred", "frog", 31242);
		MockitoAnnotations.initMocks(this);
	}

	

	@Test
	public void testAllStatuses() {

		assertEquals(NewStatus.name, person.getStatus().name());
		person.register();
		assertEquals(RegisteredStatus.name, person.getStatus().name());
		person.activate();
		assertEquals(ActiveStatus.name, person.getStatus().name());
		person.freeze();
		assertEquals(FrozenStatus.name, person.getStatus().name());
		person.delete();
		assertEquals(DeletedStatus.name, person.getStatus().name());
		person.activate();
		assertEquals(ActiveStatus.name, person.getStatus().name());

	}

	@Test
	public void testActivateNew() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to activate, complete registration first");

		person.activate();

		expectedEx.expectMessage("Unvable to activate, complete registration first");
		person.freeze();
	}

	@Test
	public void testFreezeNew() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to freeze, complete registration first");
		person.freeze();
	}

	@Test
	public void testRegisterRegistered() {
		person.register();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to register, already registered");
		person.register();
	}

	@Test
	public void testRegisterActive() {
		person.register();
		person.activate();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to register, member is active");
		person.register();
	}

	@Test
	public void testActivateActive() {

		person.register();
		person.activate();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to activate, member is active");
		person.activate();
	}

	@Test
	public void testRegisterFrozene() {

		person.register();
		person.activate();
		person.freeze();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to register, member frozen");
		person.register();
	}

	@Test
	public void testFreezeFrozen() {

		person.register();
		person.activate();
		person.freeze();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to freeze, member frozen");
		person.freeze();
	}

	@Test
	public void testRegisterDeleted() {

		person.register();
		person.activate();
		person.delete();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to register, member deleted");
		person.register();
	}

	@Test
	public void testFreezeDeleted() {

		person.register();
		person.activate();
		person.delete();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to freeze, member deleted");
		person.freeze();
	}

	@Test
	public void testDeleteDeleted() {

		person.register();
		person.activate();
		person.delete();
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Unable to delete, member deleted");
		person.delete();
	}

	@Test
	public void mockRegister() {
		mockPerson.register();
		verify(mockPerson).register();
		

	}
}
