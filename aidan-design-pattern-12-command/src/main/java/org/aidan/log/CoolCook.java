package org.aidan.log;


/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:04
 * @描述: 厨师对象，做冷菜
 */
public class CoolCook implements CookApi {

    @Override
    public void cook(int tableNum, String name) {
        System.out.println(tableNum + "号桌，凉菜" + name + "已经做好，本厨师正在装盘。");
    }
}
