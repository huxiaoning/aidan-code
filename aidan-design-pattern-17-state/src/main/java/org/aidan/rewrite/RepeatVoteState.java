package org.aidan.rewrite;


/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:33
 * @描述: RepeatVoteState
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManage voteManage) {
        System.out.println("请不要重复投票");
    }
}
