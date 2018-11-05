package org.aidan.nopattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/11/3 上午10:02
 * @描述: 读取配置文件
 */
public class ReadAppXml {


    /**
     * 读取配置文件内容
     *
     * @param filePathName
     */
    public void read(String filePathName) {
        // 建立解析器工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            // 获得DocumentBuilder对象，这个对象代码了具体的Dom解析器
            DocumentBuilder builder = factory.newDocumentBuilder();
            // 得到表示xml文档的Document对象
            Document doc = builder.parse(filePathName);
            // 去掉xml中作为格式化内容的空白而映射在Dom树的Test Node对象
            doc.normalize();
            // 获取jdbc配置
            NodeList jdbcList = doc.getElementsByTagName("jdbc");
            // 只有一个jdbc节点，算了，还是遍历一下
            for (int i = 0; i < jdbcList.getLength(); i++) {
                Node item = jdbcList.item(i);
                NodeList driverClassNodeList = ((Element) item).getElementsByTagName("driver-class");
                String driverClass = driverClassNodeList.item(0).getFirstChild().getNodeValue();
                System.out.println(driverClass);

                NodeList urlNodeList = ((Element) item).getElementsByTagName("url");
                String url = urlNodeList.item(0).getFirstChild().getNodeValue();
                System.out.println(url);

                NodeList userNodeList = ((Element) item).getElementsByTagName("user");
                String user = userNodeList.item(0).getFirstChild().getNodeValue();
                System.out.println(user);

                NodeList passwordNodeList = ((Element) item).getElementsByTagName("password");
                String password = passwordNodeList.item(0).getFirstChild().getNodeValue();
                System.out.println(password);
            }

            // 获取application-xml
            NodeList applicationXmlNodeList = doc.getElementsByTagName("application-xml");
            Node applicationXmlNode = applicationXmlNodeList.item(0);
            String applicationXmlValue = applicationXmlNode.getFirstChild().getNodeValue();
            System.out.println(applicationXmlValue);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ReadAppXml().read("/Users/aidan/IdeaProjects/aidan-code/aidan-design-pattern-20-interpreter/src/main/resources/config.xml");
    }
}
