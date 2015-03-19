package com.tss.enterprise.hrsc.utils;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.tss.enterprise.hrsc.utils.AntiMagicNumber;
import com.tss.enterprise.hrsc.utils.CommonFunction;
import com.tss.enterprise.hrsc.utils.Constants;
import com.tss.enterprise.hrsc.utils.MASSException;

/**
 * CommonFunction.
 * 
 * @author vule
 */
public class CommonFunctionTest {
	private static final Logger LOG = Logger
	.getLogger(CommonFunctionTest.class);

	/**
	 * Test for method addString.
	 * 
	 * @author vule
	 */

	@Test
	public void testAddStringTc1() {
		String str = "str";
		String singleQuote = "singleQuote";
		String doubleQuote = "doubleQuote";
		String actual = CommonFunction.addString(str, singleQuote, doubleQuote);
		assertEquals(str, actual);
	}

	/**
	 * Test for method addString.
	 * 
	 * @author vule
	 */
	@Test
	public void testAddStringTc2() {
		String str = "";
		String singleQuote = "";
		String doubleQuote = "";
		String actual = CommonFunction.addString(str, singleQuote, doubleQuote);
		assertEquals(str, actual);
	}

	/**
	 * Test for method addString.
	 * 
	 * @author vule
	 */
	@Test
	public void testAddStringTc3() {
		String str = "singleQoute";
		String singleQuote = "singleQoute";
		String doubleQuote = "double-Quote";
		String actual = CommonFunction.addString(str, singleQuote, doubleQuote);
		assertEquals("singleQoutesingleQoute", actual);
	}

	/**
	 * Test for method cloneObject clone object.
	 * 
	 * @author vule
	 */

	@Test
	public void testCloneObjectTc1() {
		Object object = "";
		Object actual = CommonFunction.cloneObject(object);
		assertEquals(object, actual);
	}

	/**
	 * Test for method cloneObject clone object.
	 * 
	 * @author vule
	 */
	@Test
	public void testCloneObjectTc2() throws InstantiationException {
		Object object = 1234;
		Object actual = CommonFunction.cloneObject(object);
		assertEquals(null, actual);
	}

	/**
	 * Test for method generateUnderStroke.
	 * 
	 * @author vule
	 */
	@Test
	public void testGenerateUnderStrokeTc1() {
		int value = AntiMagicNumber.ZERO;
		String line = "";
		String actual = CommonFunction.generateUnderStroke(value);
		assertEquals(line, actual);
	}

	/**
	 * Test for method generateUnderStroke.
	 * 
	 * @author vule
	 */
	@Test
	public void testGenerateUnderStrokeTc2() {
		int value = AntiMagicNumber.THREE;
		String line = "___";
		String actual = CommonFunction.generateUnderStroke(value);
		assertEquals(line, actual);
	}

	/**
	 * Test for method getBigdecimalValue.
	 * 
	 * @author vule
	 */

	@Test
	public void testGetBigdecimalValueTc1() {
		int value = AntiMagicNumber.ONE;
		BigDecimal bigDec = BigDecimal.ONE;
		BigDecimal bigDecimal = CommonFunction.getBigdecimalValue(value);
		assertEquals(bigDec, bigDecimal);
	}

	/**
	 * Test for method getBigdecimalValue.
	 * 
	 * @author vule
	 */
	@Test
	public void testGetBigdecimalValueTc2() {
		int value = AntiMagicNumber.ZERO;
		BigDecimal bigDec = BigDecimal.ZERO;
		BigDecimal bigDecimal = CommonFunction.getBigdecimalValue(value);
		assertEquals(bigDec, bigDecimal);
	}

	/**
	 * Test for method getPropertyValueByKey.
	 * 
	 * @author vule
	 */
	@Test
	public void testGetPropertyValueByKeyTc1() {
		String fileName = "";
		String key = "";
		String actual = CommonFunction.getPropertyValueByKey(fileName, key);
		assertEquals(null, actual);
	}

	/**
	 * Test for method getString .
	 * 
	 * @author vule
	 */
	@Test
	public void testGetStringTc1() {
		String str = Constants.EMPTY_STRING;
		String actual = CommonFunction.getString(str);
		assertEquals(str, actual);
	}

	/**
	 * Test for method getString.
	 * 
	 * @author vule
	 */
	@Test
	public void testGetStringTc2() {
		String str = "str";
		String actual = CommonFunction.getString(str);
		assertEquals(str, actual);
	}

	/**
	 * Test for method isEmty.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsEmtyTc1() {
		String expected = "testEmty";
		boolean actual = CommonFunction.isEmpty(expected);
		assertEquals(false, actual);
	}

	/**
	 * Test for method isEmty.
	 * 
	 * @author vule.
	 */
	@Test
	public void testIsEmtyTc2() {
		String expected = null;
		boolean actual = CommonFunction.isEmpty(expected);
		assertEquals(true, actual);
	}

	/**
	 * Test for method isEmty.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsEmtyTc3() {
		String expected = Constants.EMPTY_STRING;
		boolean actual = CommonFunction.isEmpty(expected);
		assertEquals(true, actual);
	}

	/**
	 * Test for method isEmty.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsEmtyTc4() {
		Object expected = null;
		boolean actual = CommonFunction.isEmpty(expected);
		assertEquals(true, actual);
	}

	/**
	 * Test for method isEmty.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsEmtyTc5() {
		Object expected = "object";
		boolean actual = CommonFunction.isEmpty(expected);
		assertEquals(false, actual);
	}

	/**
	 * Test for method isInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsIntegerTc1() {
		String expected = "";
		boolean actual = CommonFunction.isInteger(expected);
		assertEquals(false, actual);
	}

	/**
	 * Test for method isInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsIntegerTc2() {
		String expected = "123456";
		boolean actual = CommonFunction.isInteger(expected);
		assertEquals(true, actual);
	}

	/**
	 * Test for method isInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsIntegerTc3() {
		String expected = null;
		boolean actual = CommonFunction.isInteger(expected);
		assertEquals(false, actual);
	}

	/**
	 * Test for method isLong.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsLongTc1() {
		String expected = "testIsLong";
		boolean actual = CommonFunction.isLong(expected);
		assertEquals(false, actual);
	}

	/**
	 * Test for method isLong.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsLongTc2() {
		String expected = "123456";
		boolean actual = CommonFunction.isLong(expected);
		assertEquals(true, actual);
	}

	/**
	 * Test for method isLong.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsLongTc3() {
		String expected = null;
		boolean actual = CommonFunction.isLong(expected);
		assertEquals(false, actual);
	}

	/**
	 * Test for method isNormalList.
	 * 
	 * @author vule
	 */

	@Test
	public void testIsNormalListTc1() {
		List<String> inVal = new ArrayList<String>();
		inVal.add("data1");
		inVal.add("data2");
		boolean actual = CommonFunction.isNormalList(inVal);
		assertEquals(true, actual);
	}

	/**
	 * Test for method isNormalList.
	 * 
	 * @author vule
	 */

	@Test
	public void testIsNormalListTc2() {
		List<String> inVal = null;
		boolean actual = CommonFunction.isNormalList(inVal);
		assertEquals(false, actual);
	}

	/**
	 * Test for method isNormalList.
	 * 
	 * @author vule
	 */
	@Test
	public void testIsNormalListTc3() {
		List<String> inVal = new ArrayList<String>();
		inVal.add("");
		inVal.add("");
		boolean actual = CommonFunction.isNormalList(inVal);
		assertEquals(true, actual);
	}

	/**
	 * Test for method maxInt.
	 * 
	 * @author vule
	 */
	@Test
	public void testMaxInt() {
		List<Integer> value = new ArrayList<Integer>();
		value.add(AntiMagicNumber.ONE);
		value.add(AntiMagicNumber.SEVEN);
		value.add(AntiMagicNumber.EIGHT);
		value.add(AntiMagicNumber.FIVE);
		value.add(AntiMagicNumber.FOUR);
		int max = value.get(AntiMagicNumber.TWO);
		int actual = CommonFunction.maxInt(value);
		assertEquals(max, actual);
	}

	/**
	 * Test for method testMultiBoolean.
	 * 
	 * @author vule
	 */
	@Test
	public void testMultiBooleanTc1() {
		boolean expectd = true;
		boolean actual = CommonFunction.testMultiBoolean(expectd);
		assertEquals(expectd, actual);
	}

	/**
	 * Test for method testMultiBoolean.
	 * 
	 * @author vule
	 */
	@Test
	public void testMultiBooleanTc2() {
		boolean expectd = false;
		boolean actual = CommonFunction.testMultiBoolean(expectd);
		assertEquals(expectd, actual);
	}

	/**
	 * Test for method parseStringToInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToIntegerTc1() {
		String list = "s,456";
		list.split(Constants.COMMAS);
		CommonFunction.parseStringToInteger(list);
	}

	/**
	 * Test for method parseStringToInteger.
	 * 
	 * @author vule
	 */

	@Test
	public void testParseStringToIntegerTc2() {
		String list = "";
		list.split(Constants.COMMAS);
		CommonFunction.parseStringToInteger(list);
	}

	/**
	 * Test for method parseStringToInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToIntegerTc3() {
		String list = "123,456";
		list.split(Constants.COMMAS);
		CommonFunction.parseStringToInteger(list);
	}

	/**
	 * Test for method parseStringToIntValue.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToIntValueTc1() throws NumberFormatException {
		String value = "m";
		CommonFunction.parseStringToIntValue(value);
		CommonFunction.parseStringToIntValue(value);
	}

	/**
	 * Test for method parseStringToIntValue.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToIntValueTc2() {
		String value = "2";
		int dest = AntiMagicNumber.TWO;
		int actual = CommonFunction.parseStringToIntValue(value);
		assertEquals(dest, actual);
	}

	/**
	 * Test for method parseStringToListInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToListIntegerTc1() {
		String value = "123";
		List<Integer> dest = new ArrayList<Integer>();
		dest.add(Integer.valueOf(value));
		List<Integer> lst = CommonFunction.parseStringToListInteger(value);
		assertEquals(dest, lst);
	}

	/**
	 * Test for method parseStringToListInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToListIntegerTc2() {
		String value = Constants.EMPTY_STRING;
		List<Integer> dest = new ArrayList<Integer>();
		List<Integer> lst = CommonFunction.parseStringToListInteger(value);
		assertEquals(dest, lst);
	}

	/**
	 * Test for method parseStringToListInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToListIntegerTc3() {
		String value = "value";
		List<Integer> dest = new ArrayList<Integer>();
		List<Integer> lst = CommonFunction.parseStringToListInteger(value);
		assertEquals(dest, lst);
	}

	/**
	 * Test for method parseStringToListInteger.
	 * 
	 * @author vule
	 */
	@Test
	public void testParseStringToListIntegerTc4() {
		String value = null;
		List<Integer> dest = new ArrayList<Integer>();
		List<Integer> lst = CommonFunction.parseStringToListInteger(value);
		assertEquals(dest, lst);
	}

	/**
	 * Test for method phoneNumber
	 * 
	 * @author vule
	 */
	@Test
	public void testPhoneNumberTc1() {
		String str = Constants.EMPTY_STRING;
		String areaNumber = Constants.EMPTY_STRING;
		String number = Constants.EMPTY_STRING;
		String[] phoneNumberStr = { areaNumber, number };
		String[] actual = CommonFunction.getPhoneNumber(str);
		assertEquals(phoneNumberStr, actual);

	}

	/**
	 * Test for method phoneNumber.
	 * 
	 * @author vule
	 */
	@Test
	public void testPhoneNumberTc2() {
		String str = "name";
		String[] strNbr = str.trim().split(" ");
		String areaNumber = strNbr[AntiMagicNumber.ZERO];
		String number = Constants.EMPTY_STRING;
		String[] phoneNumberStr = { areaNumber, number };
		String[] actual = CommonFunction.getPhoneNumber(str);
		assertEquals(phoneNumberStr, actual);
	}

	/**
	 * Test for method phoneNumber.
	 * 
	 * @author vule
	 */
	@Test
	public void testPhoneNumberTc3() {
		String str = "name1 nane2";
		String[] strNbr = str.trim().split(" ");
		String[] actual = CommonFunction.getPhoneNumber(str);
		assertEquals(strNbr, actual);
	}

	/**
	 * Test for method phoneNumber.
	 * 
	 * @author vule
	 */

	@Test
	public void testPhoneNumberTc4() {
		String str = "name1 nane2 name3";
		String[] strNbr = str.trim().split(" ");
		String areaNumber = strNbr[AntiMagicNumber.ZERO];
		String number = strNbr[AntiMagicNumber.ONE]
		                       + strNbr[AntiMagicNumber.TWO];
		String[] phoneNumberStr = { areaNumber, number };
		String[] actual = CommonFunction.getPhoneNumber(str);
		assertEquals(phoneNumberStr, actual);
	}

	/**
	 * Test for method phoneNumber.
	 * 
	 * @author vule
	 */
	@Test
	public void testPhoneNumberTc5() {
		String str = null;
		String areaNumber = Constants.EMPTY_STRING;
		String number = Constants.EMPTY_STRING;
		String[] phoneNumberStr = { areaNumber, number };
		String[] actual = CommonFunction.getPhoneNumber(str);
		assertEquals(phoneNumberStr, actual);

	}

	/**
	 * Test for method str2Integer.
	 * 
	 * @throws MASSException
	 * @author vule
	 */
	@Test
	public void testStr2IntegerTc1() throws MASSException {
		String[] str = { "1", "2" };
		CommonFunction.str2Integer(str);
	}

	/**
	 * Test for method str2Integer.
	 * 
	 * @throws MASSException
	 * @author vule
	 */
	@Test
	public void testStr2IntegerTc2() throws MASSException {
		try {
			String[] str = { "abc", "char", "3", "4", "5" };
			List<Integer> lstInter = CommonFunction.str2Integer(str);
			assertEquals(str, lstInter);
		} catch (MASSException e) {
			LOG.error(e.getMessage(), e);
		}
	}

	/**
	 * Test for method stirng2Date.
	 * 
	 * @throws MASSException
	 * @author vule
	 */

	@Test
	public void testString2DateTc1() throws MASSException {
		String dateStr = "02/21/2014";
		String pattern = "MM/dd/yyyy";
		CommonFunction.string2Date(dateStr, pattern);
	}

	/**
	 * Test for method stirng2Date.
	 * 
	 * @throws MASSException
	 * @author vule
	 */

	@Test
	public void testString2DateTc2() throws MASSException {
		try {
			String dateStr = "20-20-2014";
			String pattern = "MM/dd/yyyy";
			CommonFunction.string2Date(dateStr, pattern);
		} catch (MASSException e) {
			LOG.error(e.getMessage(), e);
		}
	}

	/**
	 * Test for method testStringIsPercentString.
	 * 
	 * @author vule
	 */
	@Test
	public void testStringIsPercentStringTc1() {
		String str = Constants.PERCENT_STRING;
		String actual = CommonFunction.testStringIsPercentString(str);
		assertEquals(Constants.EMPTY_STRING, actual);
	}

	/**
	 * Test for method testStringIsPercentString.
	 * 
	 * @author vule
	 */
	@Test
	public void testStringIsPercentStringTc2() {
		String str = "str";
		String actual = CommonFunction.testStringIsPercentString(str);
		assertEquals(str, actual);
	}

	/**
	 * Test for method timestampToString.
	 * 
	 * @author vule
	 */
	@Test
	public void testTimestampToStringTc1() {
		Timestamp timestamp = null;
		String pattern = "2013-10-05 00:00:00.0";
		String actual = CommonFunction.timestampToString(timestamp, pattern);
		assertEquals("", actual);
	}

	/**
	 * Test for method timestampToString.
	 * 
	 * @author vule
	 */
	@Test
	public void testTimestampToStringTc2() {
		Timestamp timestamp = new Timestamp(2014, 07, 03, 8, 56, 50, 00);
		String pattern = "MM/DD/YYYY";
		Date date = new Date(timestamp.getTime());
		DateFormat dateFormat = new SimpleDateFormat(pattern, Locale.US);
		String retVal = dateFormat.format(date);
		String actual = CommonFunction.timestampToString(timestamp, pattern);
		assertEquals(retVal, actual);

	}
}
