package com.mftech.communime;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mftech.communime.entity.Org;
import com.mftech.communime.entity.Person;

public class OrgTest {

	@Test
	public void test() {
		Org org = new Org("ACME", 44552);

		assertNotNull(org.getCreatedDate());
		assertEquals(org.getName(), "ACME");
		assertEquals(org.getCreatedById(), new Integer(44552));

	}

}
