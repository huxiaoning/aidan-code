/**
 * @author Aidan
 * @创建时间：2018/11/3 上午11:05
 * @描述: 使用解释器模式重写示例
 *
 *<?xml version="1.0" encoding="UTF-8" ?>
 * <root id="rootId">
 *     <a>
 *         <b>
 *             <c name="testC">12345</c>
 *             <d id="1">d1</d>
 *             <d id="2">d2</d>
 *             <d id="3">d3</d>
 *             <d id="4">d4</d>
 *         </b>
 *     </a>
 * </root>
 *
 *
 * root/a/b/c       表示获取c元素的值
 * root/a/b/c.name  表示获取c元素name属性的值
 * root/a/b/d$      表示获取多个d元素值的集合
 * root/a/b/d$.id$  表示获取多个d元素的id属性值的集合
 */
package org.aidan.rewrite;