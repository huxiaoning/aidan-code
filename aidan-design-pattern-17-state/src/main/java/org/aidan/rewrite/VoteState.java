package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:18
 * @描述: 封装一个投票状态相关的行为
 */
public interface VoteState {

    /**
     * 处理状态对应的行为
     *
     * @param user
     * @param voteItem
     * @param voteManage
     */
    void vote(String user, String voteItem, VoteManage voteManage);
}
