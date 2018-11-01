package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:41
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        VoteManage voteManage = new VoteManage();
        for (int i = 0; i < 8; i++) {
            voteManage.vote("u1", "A");
        }
    }
}
