package org.aidan.macro;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:02
 * @描述: 厨师对象，做热菜
 */
public class HotCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("本厨师正在做:" + name);
    }
}
