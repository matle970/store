package com.layerdemo.service.imp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.layerdemo.domain.Customer;
import com.layerdemo.service.CustomerService;

class CustomerServiceImpTest {

    CustomerService customerService = null;

    @Before
    void setUp() {
        customerService = new CustomerServiceImp();
    }

    @After
    void tearDown() {
        customerService = null;
    }

    @Test
    
    void login1() {
        Customer customer = new Customer();
        customer.setId("1");
        customer.setPassword("1234");

        assertTrue(customerService.login(customer));
        assertNotNull(customer);
        assertEquals("1", customer.getId());
        assertEquals("David", customer.getName());
        assertEquals("1234", customer.getPassword());
        assertEquals("111", customer.getAddress());
        assertEquals("0987654321", customer.getPhone());
        assertEquals(1975L, customer.getBirthday().getTime());
    }


    @Test
  
    void login2() {
        Customer customer = new Customer();
        customer.setId("tony");
        customer.setPassword("123");

        assertFalse(customerService.login(customer));

    }


    @Test
    void register() {
    }

    @Test
    void search() {
    }
}