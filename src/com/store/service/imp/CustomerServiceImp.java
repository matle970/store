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

            // 把db返回的資料返回表示層
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

        if (dbCustomer != null) { //使用者ID已存在
            throw new ServiceException("使用者ID: " + customer.getId() + "已經存在！");
        }

        // 註冊開始
        customerDao.create(customer);
    }
}
