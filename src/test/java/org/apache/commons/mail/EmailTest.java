package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import javax.mail.BodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EmailTest {

	private static final String[] TEST_EMAILS = {"ab@bc.com", "ab@c.org", 
			"hjdfh@fjdfh.com"};
	
	private static final String TEST_EMAIL = "jiji@hj.com";

	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception{
		
	}
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * 1
	 * Test addBcc(String...) by comparing the size 
	 */
	@Test
	public void testAddBcc() throws Exception{
		
		email.addBcc(TEST_EMAILS);
		assertEquals(3, email.getBccAddresses().size());
	}
	
	
	
	
}