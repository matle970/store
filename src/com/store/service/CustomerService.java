package com.store.service;

import com.store.domain.Customer;

public interface CustomerService {

	/**
	 * 處理使用者登入
	 * @param customer
	 * @return 登入成功返回true,登入失敗返回false
	 * 
	 */
	boolean login(Customer customer);
	/**
	 * 處理使用者註冊
	 * @param customer
	 * @return ServiceException 註冊失敗拋出異常
	 * 
	 */
	void register(Customer customer) throws ServiceException;
}
