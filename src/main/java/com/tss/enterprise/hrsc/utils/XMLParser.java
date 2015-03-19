/*
 * $Id.: $XMLParser.java
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.utils;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * The Class XMLParser.
 */
public final class XMLParser {

	/**
	 * String to dom.
	 *
	 * @param xmlSource the xml source
	 * @return the document
	 * @throws SAXException the SAX exception
	 * @throws ParserConfigurationException the parser configuration exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static Document stringToDom(String xmlSource)
	throws SAXException, ParserConfigurationException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(new InputSource(new StringReader(xmlSource)));
	}

	/**
	 * Instantiates a new XML parser.
	 */
	private XMLParser() {
	}
}
