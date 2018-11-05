package org.aidan.rewrite;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * @author Aidan
 * @创建时间：2018/11/3 上午11:18
 * @描述: 上下文，用来包含解释器需要的一些全局信息
 */
public class Context {

    /**
     * 上一个被处理的元素
     */
    private Element preEle;

    /**
     * Dom解析xml的Document对象
     */
    private Document document;

    /**
     * 构造方法
     *
     * @param filePathName 需要读取的xml的路径和名字
     */
    public Context(String filePathName) {
        this.document = XmlUtil.getRoot(filePathName);
    }

    /**
     * 重新初始化上下文
     */
    public void reInit() {
        this.preEle = null;
    }

    /**
     * 各个Expression公共使用方法
     * 根据父元素和当前元素的名称来获取当前元素
     *
     * @param pEle    父元素
     * @param eleName 当前元素的名称
     * @return 当前元素
     */
    public Element getNowEle(Element pEle, String eleName) {
        NodeList childNodes = pEle.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element currEle = (Element) item;
                if (currEle.getTagName().equals(eleName)) {
                    return currEle;
                }
            }
        }
        return null;
    }

    public Element getPreEle() {
        return preEle;
    }

    public void setPreEle(Element preEle) {
        this.preEle = preEle;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
