package com.example.redis;

import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnection;

/**
 * @ClassName: RedisTemplate
 * @Description: 重写RedisTemplate,加入选库
 */
//public class RedisTemplate extends org.springframework.data.redis.core.RedisTemplate {
//
//    public static ThreadLocal<Integer> indexdb = new ThreadLocal<Integer>(){
//        @Override protected Integer initialValue() { return 0; }
//    };
//
//    @Override
//    protected RedisConnection preProcessConnection(RedisConnection connection, boolean existingConnection) {
//        try {
//            Integer dbIndex = indexdb.get();
//            //如果设置了dbIndex
//            if (dbIndex != null) {
//                if (connection instanceof JedisConnection) {
////                    if (((JedisConnection) connection).getNativeConnection().getDB().intValue() != dbIndex) {
//                        connection.select(dbIndex);
////                    }
//                } else {
//                    connection.select(dbIndex);
//                }
//            } else {
//                connection.select(0);
//            }
//        } finally {
//            indexdb.remove();
//        }
//        return super.preProcessConnection(connection, existingConnection);
//    }
//
//
//}

public class RedisTemplate extends org.springframework.data.redis.core.RedisTemplate {

}