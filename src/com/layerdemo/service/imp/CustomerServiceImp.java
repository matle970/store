package com.layerdemo.service.imp;

import java.util.List;

import com.layerdemo.dao.CustomerDao;
import com.layerdemo.dao.imp.CustomerDaoImpJdbc;
import com.layerdemo.domain.Customer;
import com.layerdemo.service.CustomerService;

public class CustomerServiceImp implements CustomerService {

    CustomerDao customerDao = new CustomerDaoImpJdbc();

    @Override
    public boolean login(Customer customer) {
        Customer dbCustomer = customerDao.findByPk(customer.getId());
        if (dbCustomer != null
                && dbCustomer.getPassword().equals(customer.getPassword())) {
            // 登录成功
            customer.setPhone(dbCustomer.getPhone());
            customer.setBirthday(dbCustomer.getBirthday());
            customer.setAddress(dbCustomer.getAddress());
            customer.setName(dbCustomer.getName());
            return true;
        }
        return false;
    }

    @Override
    public boolean register(Customer customer) {
        //TODO
        return false;
    }

    @Override
    public List<Customer> search() {
        //TODO
        return null;
    }
}
