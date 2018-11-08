package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:56
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        // 创建 ObjectStructure
        ObjectStructure os = new ObjectStructure();

        // 准备些测试数据，创建客户对象，并加入ObjectStructure
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        os.addElement(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE公司");
        os.addElement(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张三");
        os.addElement(cm3);

        // 客户提出服务请求，传入服务请求的Visitor
        CustomerVisitor serviceRequestVisitor = new ServiceRequestVisitor();
        os.handleRequest(serviceRequestVisitor);

        System.out.println("=================华丽的分隔线=================");

        // 要对客户进行偏好分析，传入偏好分析的Visitor
        CustomerVisitor predilectionAnalyzeVisitor = new PredilectionAnalyzeVisitor();
        os.handleRequest(predilectionAnalyzeVisitor);


        System.out.println("=================华丽的分隔线=================");

        // 要对客户进行价值分析，传入偏好分析的Visitor
        CustomerVisitor worthAnalyzeVisitor = new WorthAnalyzeVisitor();
        os.handleRequest(worthAnalyzeVisitor);

    }
}
