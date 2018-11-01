package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:35
 * @描述: SpiteVoteState
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManage voteManage) {
        String s = voteManage.getMapVote().get(user);
        if (s != null) {
            voteManage.getMapVote().remove(user);
        }
        System.out.println("你有恶意投票行为，取消投票资格");
    }
}
