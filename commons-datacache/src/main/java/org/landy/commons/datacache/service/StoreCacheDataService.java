package org.landy.commons.datacache.service;

import org.landy.commons.datacache.data.MyCustomCacheData;

import java.util.List;

public interface StoreCacheDataService extends  CacheDataOperateService{
	
	/**
	 * 写数据
	 * @param key
	 * @param value
	 * @return
	 */
	public <T> boolean store(String key, MyCustomCacheData<T> value);
	
	/**
	 * 存储单值
	 * @param key
	 * @param value
	 * @return
	 */
	public <T> boolean store(String key, T value);
	/**
	 * 替换
	 * @param key
	 * @param value
	 * @return
	 */
	public <T> boolean replace(String key, T value);
	/**
	 * 删除操作
	 * @param key
	 * @return
	 */
	public boolean  delete(String key);
	/**
	 * 删除所有
	 * @return
	 */
	public  boolean deleteAll();
	/**
	 * 根据key进行删除
	 * @param keyList
	 * @return
	 */
	public boolean delete(List<String> keyList);

	
	
	
	
	
	
	

	

}