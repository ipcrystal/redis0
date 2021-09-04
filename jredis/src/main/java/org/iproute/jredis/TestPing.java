package org.iproute.jredis;

import redis.clients.jedis.Jedis;

/**
 * Demo
 *
 * @author winterfell
 * @since 2021/9/4
 */
public class TestPing {

    public static void main(String[] args) {

        // 1. new Jedis 对象即可
        Jedis jedis = new Jedis("172.100.1.100", 6379);

        jedis.auth("Root@123#");

        System.out.println(jedis.ping());
    }
}
