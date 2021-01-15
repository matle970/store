package com.store.service;

import com.store.domain.Customer;

public interface CustomerService {

	/**
	 * �B�z�ϥΪ̵n�J
	 * @param customer
	 * @return �n�J���\��^true,�n�J���Ѫ�^false
	 * 
	 */
	boolean login(Customer customer);
	/**
	 * �B�z�ϥΪ̵��U
	 * @param customer
	 * @return ServiceException ���U���ѩߥX���`
	 * 
	 */
	void register(Customer customer) throws ServiceException;
}
