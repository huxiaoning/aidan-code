package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午2:07
 * @描述: 享元接口，通过这个享元可以接受并作用于外部状态
 */
public interface Flyweight {

    /**
     * 示例操作，传入外部状态
     *
     * @param extrinsicState 示例参数，外部状态
     */
    void operation(String extrinsicState);
}
