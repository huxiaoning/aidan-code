package org.aidan;

/**
 * 测试一下不可重复读:   同一事务两次读取的数据不一致，两次读取中间有其他事务修改并提交了事务
 * 当事务的隔离级别为    读未提交(Read committed)时 会产生不可重复读的问题
 * <p>
 * // * 解决办法：将读写线程的事务隔离级别调成 读已提交或更高级别
 */
public class TestUnrepeatableRead {
}
