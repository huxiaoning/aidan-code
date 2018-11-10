/**
 * @author Aidan
 * @创建时间：2018/11/10 下午2:43
 * @描述: 导入和混合配置
 *
 * 1 java配置引java配置：
 * @Import(Xxx.class)
 * 2 java配置引xml配置：
 * @ImportResource("classpath:xxx.xml")
 * 3 xml配置引xml配置
 *  <import resource="xxx.xml"/>
 * 4 xml配置引java配置
 *  <bean class="Xxx.class"/>
 *
 *
 *
 * 可以定义一个顶层的配置文件，然后导入各个配置文件。顶层配置文件可以是javaConfig也可以是xml配置。
 */
package org.aidan.chapter2_5;