package com.example.config;
//
//import com.example.redis.FastJson2JsonRedisSerializer;
//import com.example.redis.RedisTemplate;
//import com.example.utils.RedisUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisPassword;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//
//import java.time.Duration;
//
///**
// * @Date: 2018/8/28 11:07
// * @Description:
// */
//@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)//注解，开启redis集中session管理
//@PropertySource("classpath:redis.properties")
//@Slf4j
//public class RedisConfig {
//
//    private  final Logger log = LoggerFactory.getLogger(RedisConfig.class);
//    @Value("${redis.hostName}")
//    private String hostName;
//
//    @Value("${redis.password}")
//    private String password;
//
//    @Value("${redis.port}")
//    private Integer port;
//
//    @Value("${redis.maxIdle}")
//    private Integer maxIdle;
//
//    @Value("${redis.timeout}")
//    private Integer timeout;
//
//    @Value("${redis.maxTotal}")
//    private Integer maxTotal;
//
//    @Value("${redis.maxWaitMillis}")
//    private Integer maxWaitMillis;
//
//    @Value("${redis.minEvictableIdleTimeMillis}")
//    private Integer minEvictableIdleTimeMillis;
//
//    @Value("${redis.numTestsPerEvictionRun}")
//    private Integer numTestsPerEvictionRun;
//
//    @Value("${redis.timeBetweenEvictionRunsMillis}")
//    private long timeBetweenEvictionRunsMillis;
//
//    @Value("${redis.testOnBorrow}")
//    private boolean testOnBorrow;
//
//    @Value("${redis.testWhileIdle}")
//    private boolean testWhileIdle;
//
//    /**
//     * @param: []
//     * @return: org.springframework.data.redis.connection.jedis.JedisConnectionFactory
//     * @Description: Jedis配置
//     */
//    @Bean
//    public JedisConnectionFactory JedisConnectionFactory(){
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration ();
//        redisStandaloneConfiguration.setHostName(hostName);
//        redisStandaloneConfiguration.setPort(port);
//        //由于我们使用了动态配置库,所以此处省略
//        //redisStandaloneConfiguration.setDatabase(database);
//        redisStandaloneConfiguration.setPassword(RedisPassword.of(password));
//        JedisClientConfiguration.JedisClientConfigurationBuilder jedisClientConfiguration = JedisClientConfiguration.builder();
//        jedisClientConfiguration.connectTimeout(Duration.ofMillis(timeout));
//        JedisConnectionFactory factory = new JedisConnectionFactory(redisStandaloneConfiguration,
//                jedisClientConfiguration.build());
//        return factory;
//    }
//
//    /**
//     * @param: [redisConnectionFactory]
//     * @return: com.springboot.demo.base.utils.RedisTemplate
//     * @Description: 实例化 RedisTemplate 对象
//     */
//    @Bean
//    public RedisTemplate functionDomainRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        log.info("RedisTemplate实例化成功！");
//        RedisTemplate redisTemplate = new RedisTemplate();
//        initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
//        return redisTemplate;
//    }
//
//    /**
//     * @param: []
//     * @return: org.springframework.data.redis.serializer.RedisSerializer
//     * @Description: 引入自定义序列化
//     */
//    @Bean
//    public RedisSerializer fastJson2JsonRedisSerializer() {
//        return new FastJson2JsonRedisSerializer<Object>(Object.class);
//    }
//
//    /**
//     * @param: [redisTemplate, factory]
//     * @return: void
//     * @Description: 设置数据存入 redis 的序列化方式,并开启事务
//     */
//    private void initDomainRedisTemplate(RedisTemplate redisTemplate, RedisConnectionFactory factory) {
//        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
//        redisTemplate.setValueSerializer(fastJson2JsonRedisSerializer());
//        // 开启事务
//        redisTemplate.setEnableTransactionSupport(true);
//        redisTemplate.setConnectionFactory(factory);
//    }
//
//    /**
//     * @param: [redisTemplate]
//     * @return: com.springboot.demo.base.utils.RedisUtil
//     * @Description: 注入封装RedisTemplate
//     */
//    @Bean(name = "redisUtil")
//    public RedisUtil redisUtil(RedisTemplate redisTemplate) {
//        log.info("RedisUtil注入成功！");
//        RedisUtil redisUtil = new RedisUtil();
//        redisUtil.setRedisTemplate(redisTemplate);
//        return redisUtil;
//    }
//
//}

public class RedisConfig{

}

