package org.aidan;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/9/7 下午3:01
 * @描述: 基于DOM的xml解析器
 */
public class DOMParser {

    private DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

    public Document parse(String filePath) {
        Document document = null;
        try {
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            document = documentBuilder.parse(new File(filePath));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }


    public static void main(String[] args) {
        DOMParser parser = new DOMParser();
        Document document = parser.parse("/Users/aidan/IdeaProjects/aidan-code/aidan-xml-01-dom/src/main/resources/books.xml");

        //get root element
        Element rootElement = document.getDocumentElement();

        //traverse child elements
        NodeList nodes = rootElement.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element child = (Element) node;
                //process child element
                System.out.println(child);
            }
        }

        NodeList nodeList = rootElement.getElementsByTagName("book");
        if (nodeList != null) {
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String id = element.getAttribute("id");
                System.out.println(id);
            }
        }
    }
}
