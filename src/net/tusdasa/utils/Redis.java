package net.tusdasa.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Redis {
	JedisPoolConfig config = new JedisPoolConfig();
	
	public JedisPool getPool() {
		this.config.setMaxTotal(1000);
		this.config.setMaxIdle(200);
		this.config.setMaxWaitMillis(5000);
		JedisPool pool = new JedisPool(config, "127.0.0.1", 6379);
		return pool;
	}
	
	public void setValue(Jedis jedis, String key, String value,int seconds,int db) {
		jedis.select(db);
		jedis.setex(key, seconds, value);
		//pool.returnBrokenResource(jedis);
	}
	
	
	public void setValue(Jedis jedis, String key, String value,int seconds) {
		jedis.setex(key, seconds ,value);
		//pool.returnBrokenResource(jedis);
	}
	
	public void setValue(Jedis jedis, String key, String value) {
		jedis.set(key, value);
		//pool.returnBrokenResource(jedis);
	}
	
	public String getValue(Jedis jedis, String key, int db) {
		jedis.select(db);
		return jedis.get(key);
		
		
	}
	
	public String getValue(Jedis jedis, String key) {
		return jedis.get(key);
		
	}
	
	
	
	/**
	public static void main(String[] args) {
		Redis redis =new Redis();
		redis.setValue(redis.setpool().getResource(),"1", "key",10,1);
		System.out.println(redis.getValue(redis.setpool().getResource(), "1", 1));
		System.out.println(redis.getValue(redis.setpool().getResource(), "1", 0));
	}
	*/
	
}
