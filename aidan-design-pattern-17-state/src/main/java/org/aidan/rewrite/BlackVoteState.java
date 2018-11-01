package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:37
 * @描述: BlackVoteState
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManage voteManage) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
