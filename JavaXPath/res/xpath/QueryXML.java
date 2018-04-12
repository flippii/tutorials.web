package com.vogella.xml.xpathexample;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class QueryXML {
	public void simplePersonQuery()
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		// standard for reading an XML file
		// create an XPathFactory
		Document doc = createDocument("person.xml");
		XPath xpath = XPathFactory.newInstance().newXPath();
		// compile the XPath expression
		XPathExpression expr = xpath.compile("//person");
		// run the query and show result
		NodeList result = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
		printOutResult(result);
	}

	public void extractNumbersOfLars() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		Document doc = createDocument("person.xml");
		XPath xpath = XPathFactory.newInstance().newXPath();
		// new XPath expression to get the number of people with name Lars
		XPathExpression expr = xpath.compile("count(//person[firstname='Lars'])");
		// run the query and get the number of nodes
		Double number = (Double) expr.evaluate(doc, XPathConstants.NUMBER);
		System.out.println("Number of objects " + number);
	}

	public void extractLastNameFromAllFirstNamesWithLarsQuery()
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		Document doc = createDocument("person.xml");
		XPath xpath = XPathFactory.newInstance().newXPath();

		// get last name for person nodes with first name lars
		XPathExpression expr = xpath.compile("//person[firstname='Lars']/lastname/text()");
		// run the query and show result
		NodeList result = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
		printOutResult(result);
	}
	

	private Document createDocument(String fileName) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(fileName);
	}

	private void printOutResult(NodeList result) {
		NodeList nodes = (NodeList) result;
		for (int i = 0; i < nodes.getLength(); i++) {
			System.out.print("Node Name: " + nodes.item(i).getNodeName());
			if (nodes.item(i).getNodeValue() != null) {
				System.out.println(" Node Value: " + nodes.item(i).getNodeValue());
			} else {
				System.out.println(" No value found.");
			}
		}
	}

	public static void main(String[] args)
			throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		QueryXML process = new QueryXML();
		process.simplePersonQuery();
		process.extractNumbersOfLars();
		process.extractLastNameFromAllFirstNamesWithLarsQuery();
	}

}