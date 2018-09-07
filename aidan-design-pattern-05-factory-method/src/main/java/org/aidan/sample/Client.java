package org.aidan.sample;

/**
 * @author 胡小宁
 * @创建时间：2018/9/7 上午10:33
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        ExportOperate operate = new ExportTxtFileOperate();
        operate.export("Hello World!");

        operate = new ExportDbFileOperate();
        operate.export("Hello World!");
    }
}
