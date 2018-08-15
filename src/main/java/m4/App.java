package m4;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // 连接本地的 Redis 服务
        Jedis jedis =  new Jedis("m4.beacool.com", 6379);
        jedis.auth("I0tTest2o17");
        jedis.select(1);
        jedis.set("name","GYB-Test-Redis");
        String name = jedis.get("name");
        System.out.println("name = " + name);
        jedis.close();
    }
}
