package com.example.neattest.example;

import static junit.framework.Assert.*;

import org.junit.Test;

import com.example.neattest.example.NextDateTimeCalcualtor;

import de.bitnoise.neattest.annotation.NTestIgnoreAsserts;
import de.bitnoise.neattest.annotation.NTestRecord;

public class NextDateTimeCalcualtorTest {

	NextDateTimeCalcualtor sut = new NextDateTimeCalcualtor();

	@Test
	@NTestIgnoreAsserts
	public void testname() throws Exception {

		prepare("Raienr");

		assertEquals(3, sut.sqrt(9));

		assertEquals(3.0, sut.sqrt(9));
	}

	@NTestRecord( { "input1" })
	protected void prepare(String string) {
		prepareMagic2(string);
	}

	@NTestRecord( { "input2" })
	protected void prepareMagic2(String string) {
	}

	public void myMethod() {

	}
}
