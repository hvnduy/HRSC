/*
 * $Id: CommonFunction.java,v 1 2015/01/14 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Common Function (Utility, parse JSON, convert..).
 */
public class CommonFunction {

	/**
	 * LOG.
	 * @author 
	 */
	private static final Logger LOG = Logger.getLogger(CommonFunction.class);

	/**
	 * Custom a String.
	 * @param str
	 *            Original string
	 * @param singleQuote
	 *            A QUOTE character
	 * @param doubleQuote
	 *            A double QUOTE character
	 * @return String
	 * @author 
	 */
	public static String addString(String str, String singleQuote, String doubleQuote) {
		StringBuilder builder = new StringBuilder();
		String strValue = str;
		String[] str1 = null;
		if (str.indexOf(singleQuote) >= 0) {
			str1 = str.split(singleQuote);
			if (str1.length == 0) {
				builder.append(str);
				builder.append(str);
			} else {
				str1[0] = str1[0] + doubleQuote;
				for (String value : str1) {
					builder.append(value);
				}
			}
			strValue = builder.toString();
		}
		return strValue;
	}

	/**
	 * Clone an object.
	 * @param object
	 *            Object need to be clone.
	 * @return Return an object after cloned.
	 * @author sydo
	 */
	public static Object cloneObject(Object object) {
		Object dest = null;
		try {
			dest = BeanUtils.cloneBean(object);
		} catch (IllegalAccessException e) {
			LOG.error(e.getMessage(), e);
		} catch (InstantiationException e) {
			LOG.error(e.getMessage(), e);
		} catch (InvocationTargetException e) {
			LOG.error(e.getMessage(), e);
		} catch (NoSuchMethodException e) {
			LOG.error(e.getMessage(), e);
		}

		return dest;
	}

	/**
	 * Convert Date to String with format pattern.
	 * @param date
	 *            The date of Date type need to convert
	 * @param pattern
	 *            The pattern of date will be converted
	 * @return The date string was converted
	 * @throws MASSException
	 *             If cannot parse date of Date type with pattern to date string
	 * @author ThangHT
	 */
	public static String date2String(Date date, String pattern) throws MASSException {
		String result = null;
		SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
		result = formatter.format(date);
		return result;
	}

	/**
	 * Get under stroke with width.
	 * @param width
	 *            The width value of under stroke need to get
	 * @return The under stroke string
	 * @author ThangHT
	 */
	public static String generateUnderStroke(int width) {
		String line = Constants.EMPTY_STRING;
		for (int i = 0; i < width; i++) {
			line = line.concat(Constants.UNDERSTROKE);
		}
		return line;
	}

	/**
	 * Get Bigdecimal Value.
	 * @param value
	 *            -A input String.
	 * @return BigDecimal
	 */
	public static BigDecimal getBigdecimalValue(final int value) {
		BigDecimal bigDec = BigDecimal.ZERO;
		if (!(isEmpty(value))) {
			bigDec = new BigDecimal(value);
		}
		return bigDec;
	}

	/**
	 * Get Phone number.
	 * @param str
	 *            - An input String
	 * @return Return a array of formatted Phone number.
	 * @author 
	 */
	public static String[] getPhoneNumber(final String str) {
		String[] phoneNumberStr;
		String areaNumber = Constants.EMPTY_STRING;
		String number = Constants.EMPTY_STRING;
		if (str != null && !Constants.EMPTY_STRING.equals(str)) {
			String[] strNbr = str.trim().split(" ");

			int length = strNbr.length;

			if (length == AntiMagicNumber.ONE) {
				areaNumber = strNbr[0];
			} else if (length == AntiMagicNumber.TWO) {
				areaNumber = strNbr[0];
				number = strNbr[1];
			} else if (length == AntiMagicNumber.THREE) {
				areaNumber = strNbr[0];
				number = strNbr[1] + strNbr[2];
			}

		}
		phoneNumberStr = new String[]{ areaNumber, number };
		return phoneNumberStr;
	}

	/**
	 * Read content from <i>sql.properties</i> file.
	 * @param propFileName
	 *            Properties file name
	 * @return Properties class
	 */
	private static Properties getProp(String propFileName) {
		Properties prop = new Properties();
		InputStream iStream = CommonFunction.class.getResourceAsStream("/" + propFileName);
		try {
			prop.load(iStream);
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		} finally {
			try {
				iStream.close();
			} catch (IOException e) {
				LOG.error(e.getMessage(), e);
			}
		}
		return prop;
	}

	/**
	 * Get value from property file.
	 * @param fileName
	 *            Property file name.
	 * @param key
	 *            Key value
	 * @return Value of key in property file
	 */
	public static String getPropertyValueByKey(String fileName, String key) {
		return CommonFunction.getProp(fileName).getProperty(key);
	}

	/**
	 * Get string.
	 * @param str
	 *            - An input String.
	 * @return Return an available String.
	 * @author anhtran.
	 */
	public static String getString(final String str) {
		return str == null ? Constants.EMPTY_STRING : str;
	}

	/** Validate Date.
	 * This method checks if the input string is a valid phone number.
	 * @param email String. Phone number to validate
	 * @return boolean: true if phone number is valid, false otherwise.
	 */
	public static boolean isDate(String date){
		boolean isValid = true;
		try{
			isValid = validateDatePattern(date);
			SimpleDateFormat formatter = new SimpleDateFormat(Constants.STRING_DATE_FM, Locale.US);
			formatter.parse(date);
		}catch(ParseException e){
			isValid=false;
		}
		return isValid;
	}

	/** isEmailValid: Validate email address using Java reg ex.
	 * This method checks if the input string is a valid email address.
	 * @param email String. Email address to validate
	 * @return boolean: true if email address is valid, false otherwise.
	 */
	public static boolean isEmailValid(String email){
		boolean isValid = false;


		/*
		Email format: A valid email address will have following format:
		        [\\w\\.-]+: Begins with word characters, (may include periods and hypens).
			@: It must have a '@' symbol after initial characters.
			([\\w\\-]+\\.)+: '@' must follow by more alphanumeric characters (may include hypens.).
		This part must also have a "." to separate domain and subdomain names.
			[A-Z]{2,4}$ : Must end with two to four alaphabets.
		(This will allow domain names with 2, 3 and 4 characters e.g pa, com, net, wxyz)

		Examples: Following email addresses will pass validation
		abc@xyz.net; ab.c@tx.gov
		 */

		//Initialize reg ex for email.
		String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputStr = email;
		//Make the comparison case-insensitive.
		Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		if(matcher.matches()){
			isValid = true;
		}
		return isValid;
	}

	/**
	 * <b>Method check string is empty.</b>
	 * @param obj
	 *            - An Input Object.
	 * @return Returns true if Object is null, otherwise false.
	 * @author 
	 */
	public static boolean isEmpty(final Object obj) {
		return obj == null;
	}



	/**
	 * <b>Method check a string is empty.</b>
	 * @param obj
	 *            - An Input String.
	 * @return Return true if object is empty or null and otherwise false.
	 * @author 
	 */
	public static boolean isEmpty(final String obj) {
		return obj == null || Constants.EMPTY_STRING.equals(obj.trim());
	}

	/**
	 * <p>
	 * Test valid number.
	 * </p>
	 * @param value
	 *            - Input String.
	 * @return Return true if the Input String is parsed to Integer type
	 *         successful, otherwise false.
	 * @author 
	 */
	public static boolean isInteger(final String value) {
		boolean reValue = false;
		try {
			Integer.parseInt(value);
			reValue = true;
		} catch (NumberFormatException e) {
			reValue = false;
		}
		return reValue;
	}

	/**
	 * Test valid number.
	 * @param value
	 *            - Input String.
	 * @return Return true if the Input String is parsed to Long type
	 *         successful, otherwise false.
	 * @author anhtran
	 */
	public static boolean isLong(final String value) {
		boolean reValue = false;
		try {
			Long.parseLong(value);
			reValue = true;
		} catch (NumberFormatException e) {
			reValue = false;
		}
		return reValue;
	}

	/** Validate Month year.
	 * This method checks if the input string is a valid phone number.
	 * @param email String. Phone number to validate
	 * @return boolean: true if phone number is valid, false otherwise.
	 */
	public static boolean isMonthYear(String date){
		boolean isValid = true;
		try{
			SimpleDateFormat formatter = new SimpleDateFormat(Constants.STRING_MONTH_FM, Locale.US);
			formatter.parse(date);
		}catch(ParseException e){
			isValid=false;
		}
		return isValid;
	}

	/**
	 * Check a valid List of Objects.
	 * @param inVal
	 *            A list of random Object need to be checked.
	 * @return Return TRUE if this list is not null and It contains elements,
	 *         otherwise false.
	 * @author 
	 */
	public static boolean isNormalList(List<? extends Object> inVal) {
		return inVal != null && !inVal.isEmpty();
	}

	/** isPhoneNumberValid: Validate phone number using Java reg ex.
	 * This method checks if the input string is a valid phone number.
	 * @param email String. Phone number to validate
	 * @return boolean: true if phone number is valid, false otherwise.
	 */
	public static boolean isPhoneNumberValid(String phoneNumber){
		boolean isValid = false;
		/* Phone Number formats: (nnn)nnn-nnnn; nnnnnnnnnn; nnn-nnn-nnnn
			^\\(? : May start with an option "(" .
			(\\d{3}): Followed by 3 digits.
			\\)? : May have an optional ")"
			[- ]? : May have an optional "-" after the first 3 digits or after optional ) character.
			(\\d{3}) : Followed by 3 digits.
			 [- ]? : May have another optional "-" after numeric digits.
			 (\\d{4})$ : ends with four digits.

		         Examples: Matches following phone numbers:
		         (123)456-7890, 123-456-7890, 1234567890, (123)-456-7890

		 */
		//Initialize reg ex for phone number.
		String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
		CharSequence inputStr = phoneNumber;
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(inputStr);
		if(matcher.matches()){
			isValid = true;
		}
		return isValid;
	}

	/** Validate Range Date.
	 * This method checks if the input string is a valid phone number.
	 * @param email String. Phone number to validate
	 * @return boolean: true if phone number is valid, false otherwise.
	 */
	public static boolean isRangeDate(String date){
		boolean isValid = true;
		try{
			String[] s = date.split("-");
			isValid = validateDatePattern(s[0].trim());
			if(isValid) isValid = validateDatePattern(s[1].trim());
			SimpleDateFormat formatter = new SimpleDateFormat(Constants.STRING_DATE_FM, Locale.US);
			formatter.parse(s[0].trim());
			formatter.parse(s[1].trim());
		}catch(ParseException e){
			isValid=false;
		}
		return isValid;
	}

	/**
	 * Check maximum number in all numbers.
	 * @param value
	 *            - A input List of Integers
	 * @return Return a maximum number.
	 * @author 
	 */
	public static int maxInt(List<Integer> value) {
		int max = value.get(0);
		for (int i : value) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	/**
	 * New byte array.
	 *
	 * @param value the value
	 * @return the byte[]
	 * @author quang.phan
	 */
	public static byte[] newByteArray(byte[] value) {
		return value;
	}

	/**
	 * @param value
	 * @return Date
	 * @author binhth
	 */
	public static Date newDate(Date value) {
		return new Date(value.getTime());
	}

	/**
	 * New integer.
	 *
	 * @param integer the integer
	 * @return the integer
	 */
	public static Integer newInteger(Integer integer) {
		return Integer.valueOf(integer.intValue());
	}

	/**
	 * Parsing a list to JSON string.
	 * @param list
	 *            List<OrderHeaderModel> of OrderHeaderModels
	 * @return JSON string
	 * @author sydo
	 */
	public static String parseJSON() {
		String json = Constants.JSON_EMPTY;
		return json;
	}

	/**
	 * Parsing a map to JSON string.
	 * @param map
	 *            Map<String, Object> need to be parsed.
	 * @return JSON string
	 * @author sydo
	 */
	public static String parseJSON(Map<String, Object> map) {
		String json = Constants.JSON_EMPTY;
		if (map != null) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				json = mapper.writeValueAsString(map);
			} catch (IOException e) {
				LOG.error("parse JSON error:" + e.getMessage(), e);
			}
		}

		return json;
	}

	/**
	 * Parse a string contains int value separated by COMMAS (,) character to
	 * Integer array.
	 * @param list
	 *            - An input string need to be parse.
	 * @return Array of Integer values have int Type are parsed.
	 * @author sydo
	 */
	public static List<Integer> parseStringToInteger(String list) {
		List<Integer> dest = new ArrayList<Integer>();
		if (list != null) {
			try {
				String[] array = list.split(Constants.COMMAS);
				for (String s : array) {
					dest.add(Integer.valueOf(s));
				}
			} catch (NumberFormatException e) {
				LOG.error(e.getMessage(), e);
			}
		}
		return dest;
	}

	/**
	 * Parse string value to Integer object.
	 * @param value
	 *            - A input string
	 * @return Integer object
	 */
	public static int parseStringToIntValue(String value) {
		int dest = 0;
		try {
			dest = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			LOG.error(e.getMessage(), e);
		}
		return dest;
	}

	/**
	 * Parse string to list integer value, these each element separated by
	 * COMMA.
	 * @param value
	 *            - A input string
	 * @return List<Integer> of Integer
	 * @author sydo
	 */
	public static List<Integer> parseStringToListInteger(String value) {
		List<Integer> dest = new ArrayList<Integer>();
		if (value == null || Constants.EMPTY_STRING.equals(value)) {
			return dest;
		}

		String[] arr = value.split(Constants.COMMAS);
		for (String s : arr) {
			try {
				dest.add(Integer.valueOf(s.trim()));
			} catch (NumberFormatException e) {
				LOG.error(e.getMessage(), e);
			}
		}
		return dest;
	}

	/**
	 * Convert number(string) array to integer list.
	 * @param intStr
	 *            The string array will be converted to list integer
	 * @return The list integer
	 * @throws MASSException
	 *             If cannot parse string to integer
	 * @author ThangHT
	 */
	public static List<Integer> str2Integer(String[] intStr) throws MASSException {
		List<Integer> ids = new ArrayList<Integer>(intStr.length);
		try {
			for (String id : intStr) {
				ids.add(Integer.valueOf(id));
			}
		} catch (NumberFormatException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
		return ids;
	}

	/**
	 * Convert String to Date with format pattern.
	 * @param dateStr
	 *            The date string need to convert
	 * @param pattern
	 *            The pattern of date will be converted
	 * @return The date of Date type
	 * @throws MASSException
	 *             If cannot parse date string with pattern to date of Date type
	 * @author ThangHT
	 */
	public static Date string2Date(String dateStr, String pattern) throws MASSException {
		Date result = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
			result = formatter.parse(dateStr);
		} catch (ParseException e) {
			LOG.error(e.getMessage(), e);
			throw new MASSException(e);
		}
		return result;
	}


	/**
	 * Just workaround checkstyle warning (Boolean expression complexity).
	 * @param bs
	 *            List of boolean values.
	 * @return Return True if all values are true.
	 * @author khoapkl
	 */
	public static boolean testMultiBoolean(boolean... bs) {
		boolean retVal = true;
		for (boolean item : bs) {
			if (!item) {
				retVal = false;
				break;
			}
		}
		return retVal;
	}

	/**
	 * Handle a String if it have content be % character.
	 * @param str
	 *            - An input String.
	 * @return Returns a string has been processed.
	 * @author 
	 */
	public static String testStringIsPercentString(String str) {
		String result = Constants.EMPTY_STRING;
		if (Constants.PERCENT_STRING.equals(str.trim())) {
			result = Constants.EMPTY_STRING;
		} else {
			result = str.trim().replaceAll(Constants.PERCENT_STRING,"\\\\" + Constants.PERCENT_STRING);
		}
		return result;
	}

	/**
	 * Convert timestamp to String with format pattern.
	 * @param timestamp
	 *            :Timestamp
	 * @param pattern
	 *            :String
	 * @return String
	 * @author anhtran
	 */
	public static String timestampToString(Timestamp timestamp, String pattern) {
		String retVal = Constants.EMPTY_STRING;
		if (timestamp != null) {
			try {
				Date date = new Date(timestamp.getTime());
				DateFormat dateFormat = new SimpleDateFormat(pattern, Locale.US);
				retVal = dateFormat.format(date);
			} catch (IllegalArgumentException e) {
				LOG.error(e.getMessage(), e);
			}
		}
		return retVal;
	}

	/** Validate Date.
	 * This method checks if the input string is a valid phone number.
	 * @param email String. Phone number to validate
	 * @return boolean: true if phone number is valid, false otherwise.
	 */
	public static boolean validateDatePattern(String date){
		boolean isValid = false;

		String DATE_PATTERN = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)";

		Pattern pattern = Pattern.compile(DATE_PATTERN);
		Matcher matcher = pattern.matcher(date);
		if(matcher.matches()){
			isValid = true;
		}

		return isValid;
	}

	/**
	 * Constructor function.
	 * @author 
	 */
	public CommonFunction() {
	}
}
