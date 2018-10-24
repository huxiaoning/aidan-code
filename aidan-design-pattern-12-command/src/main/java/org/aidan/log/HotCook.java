package org.aidan.log;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:02
 * @描述: 厨师对象，做热菜
 */
public class HotCook implements CookApi, Runnable {

    /**
     * 厨师姓名
     */
    private String name;

    /**
     * 构造方法，传入厨师的姓名
     *
     * @param name 厨师姓名
     */
    public HotCook(String name) {
        this.name = name;
    }

    @Override
    public void cook(int tableNum, String name) {
        // 每次做菜的时间是不一定的，用随机数模拟一下
        int cookTime = (int) (20 * Math.random());
        System.out.println(this.name + "厨师正在为" + tableNum + "号桌做：" + name);
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + "厨师为" + tableNum + "号桌做好了：" + name + ",共计耗时=" + cookTime + "秒");
    }

    @Override
    public void run() {
        while (true) {
            Command cmd = CommandQueue.getOneCommand();
            if (cmd != null) {
                // 说明取到命令对象了，这个命令对象还没有设置接收者
                // 因为目前还不知道到底哪一个厨师来真正执行这个命令
                // 现在知道了，就是当前厨师实例，设置到命令对象里面去
                cmd.setCookApi(this);
                // 然后真正执行这个命令
                cmd.execute();
            }

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
