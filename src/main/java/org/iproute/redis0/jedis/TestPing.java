package org.iproute.redis0.jedis;

import redis.clients.jedis.Jedis;

/**
 * TestPing
 *
 * @author winterfell
 * @since 2021/11/17
 */
public class TestPing {
    public static void main(String[] args) {
        // 1. new Jedis 对象即可
        Jedis jedis = new Jedis("172.100.1.100", 6379);

        jedis.auth("123456");

        System.out.println(jedis.ping());
    }
}
