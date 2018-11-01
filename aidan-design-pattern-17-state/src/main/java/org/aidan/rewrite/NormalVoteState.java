package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:21
 * @描述: NormalVoteState
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManage voteManage) {
        voteManage.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
    }
}
