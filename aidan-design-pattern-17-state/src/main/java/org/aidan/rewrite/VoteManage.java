package org.aidan.rewrite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:20
 * @描述: 投票管理
 */
public class VoteManage {

    /**
     * 持有状态处理对象
     */
    private VoteState state;

    /**
     * 记录投票结果：Map<String, String> --> Map<用户名称, 投票选项>
     */
    private Map<String, String> mapVote = new HashMap<>();

    /**
     * 记录用户投票次数,Map<String, String> --> Map<用户名称, 投票次数>
     */
    private Map<String, Integer> mapVoteCount = new HashMap<>();


    public Map<String, String> getMapVote() {
        return mapVote;
    }

    /**
     * 投票
     *
     * @param user
     * @param voteItem
     */
    public void vote(String user, String voteItem) {
        // 已投次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        Integer count = oldVoteCount + 1;

        mapVoteCount.put(user, count);

        if (count == 1) {
            state = new NormalVoteState();
        } else if (count > 1 && count < 5) {
            state = new RepeatVoteState();
        } else if (count >= 5 && count < 8) {
            state = new SpiteVoteState();
        } else if (count >= 8) {
            state = new BlackVoteState();
        }

        state.vote(user, voteItem, this);

    }
}
