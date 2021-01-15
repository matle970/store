package com.store.service.imp;

import com.db.core.DataAccessException;
import com.store.dao.CustomerDao;
import com.store.dao.imp.CustomerDaoImpJdbc;
import com.store.domain.Customer;
import com.store.service.CustomerService;
import com.store.service.ServiceException;

public class CustomerServiceImp implements CustomerService {

    CustomerDao customerDao = new CustomerDaoImpJdbc();

    @Override
    public boolean login(Customer customer) {

        Customer dbCustomer = customerDao.findByPk(customer.getId());

        if (dbCustomer != null &&
                dbCustomer.getPassword().equals(customer.getPassword())) {

            // ��db��^����ƪ�^��ܼh
            customer.setName(dbCustomer.getName());
            customer.setBirthday(dbCustomer.getBirthday());
            customer.setAddress(dbCustomer.getAddress());
            customer.setPhone(dbCustomer.getPhone());

            return true;
        }

        return false;
    }

    @Override
    public void register(Customer customer) throws ServiceException {

        Customer dbCustomer = customerDao.findByPk(customer.getId());

        if (dbCustomer != null) { //�ϥΪ�ID�w�s�b
            throw new ServiceException("�ϥΪ�ID: " + customer.getId() + "�w�g�s�b�I");
        }

        // ���U�}�l
        customerDao.create(customer);
    }
}
