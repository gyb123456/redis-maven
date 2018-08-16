package m4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void demo1( )
    {
        // 连接远程的 Redis 服务
        Jedis jedis =  new Jedis("m4.beacool.com", 6379);
        jedis.auth("I0tTest2o17");
        jedis.select(1);
        jedis.set("name","GYB-Test-Redis-1");
        String name = jedis.get("name");
        System.out.println("name = " + name);
        jedis.close();
    }
}
