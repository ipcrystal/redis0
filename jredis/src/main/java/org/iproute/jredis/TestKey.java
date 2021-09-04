package org.iproute.jredis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * TestString
 *
 * @author winterfell
 * @since 2021/9/4
 */
public class TestKey {

    public static void main(String[] args) {
        // 1. new Jedis 对象即可
        Jedis jedis = new Jedis("172.100.1.100", 6379);
        jedis.auth("Root@123#");

        System.out.println("清空数据: " + jedis.flushDB());
        System.out.println("判断某个值是否存在： " + jedis.exists("username"));
        System.out.println("新增<username,zhuzhenjie>的键值对: " + jedis.set("username", "zhuzhenjie"));
        System.out.println("新增<password,password>的键值对: " + jedis.set("password", "password"));
        System.out.println("系统中所有的键值如下");
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);


        System.out.println("删除键值：" + jedis.del("password"));
        System.out.println("判断键值是否存在：" + jedis.exists("password"));
        System.out.println("查看username存储的类型：" + jedis.type("username"));
        System.out.println("随机返回key空间的一个：" + jedis.randomKey());
        System.out.println("重命名key：" + jedis.rename("username", "name"));
        System.out.println("取出改后的name：" + jedis.get("name"));

        System.out.println("按索引查询：" + jedis.select(1));
        System.out.println("删除当前数据库中所有的key：" + jedis.flushDB());
        System.out.println("返回当前数据库中key的数目：" + jedis.dbSize());
        System.out.println("删除所有数据库中对所有key：" + jedis.flushAll());

    }
}
