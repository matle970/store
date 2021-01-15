package com.layerdemo.dao.imp;

import static org.junit.Assert.assertNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.layerdemo.dao.CustomerDao;
import com.layerdemo.domain.Customer;

/**
 * 
 */

/**
 * @author TP1909027
 *
 */
public class CustomerDaoImpJdbcTest {

	
	CustomerDao dao = null;
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	@Before
	public void setUp() {
		dao = new CustomerDaoImpJdbc();
	}
	@After
	public void tearDown() {
		dao = null;
	}
//	@Test
//	public void findByPk() {
//		  Customer customer = dao.findByPk("1");
//	        assertNotNull(customer);
//	        assertEquals("1", customer.getId());
//	        assertEquals("David", customer.getName());
//	        assertEquals("1234", customer.getPassword());
//	        assertEquals("111", customer.getAddress());
//	        assertEquals("0987654321", customer.getPhone());
//	        assertEquals(1975L, customer.getBirthday().getTime());
//	}
	
//	@Test
//	public void findAll() {
//		List<Customer> list = dao.findAll();
//		assertEquals(list.size(),2);
//	}
	
//	@Test
//    void create() {
//        Customer customer = new Customer();
//        customer.setId("too");
//        customer.setName("John");
//        customer.setPassword("4321");
//        customer.setAddress("222222");
//        customer.setPhone("0912345678");
//
//        java.util.Date birthday = null;
//        try {
//            birthday = df.parse("2222");
//        } catch (java.text.ParseException e) {
//			
//		}
//
//        customer.setBirthday(birthday);
//
//        //插入数据
//        dao.create(customer);
//        // 按照主键查询数据
//        Customer customer1 = dao.findByPk("too");
//        assertNotNull(customer1);
//        assertEquals("too", customer1.getId());
//        assertEquals("John", customer1.getName());
//        assertEquals("4321", customer1.getPassword());
//        assertEquals("222222", customer1.getAddress());
//        assertEquals("0912345678", customer1.getPhone());
//        assertEquals(birthday, customer1.getBirthday());
//    }

//    @Test
//    void modify() {
//
//        Customer customer = new Customer();
//        customer.setId("3");
//        customer.setName("John Cent");
//        customer.setPassword("4444");
//        customer.setAddress("333333");
//        customer.setPhone("0800222333");
//
//        Date birthday = null;
//        try {
//            birthday = (Date) df.parse("1988-12-08");
//        } catch (java.text.ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//        customer.setBirthday(birthday);
//
//
//        dao.modify(customer);
//
//        // 按照主键查询数据
//        Customer customer1 = dao.findByPk("3");
//        assertNotNull(customer1);
//        assertEquals("3", customer1.getId());
//        assertEquals("John", customer1.getName());
//        assertEquals("4321", customer1.getPassword());
//        assertEquals("222222", customer1.getAddress());
//        assertEquals("0912345678", customer1.getPhone());
//        assertEquals(birthday, customer1.getBirthday());
//    }
//
    @Test
    void remove() {

        Customer customer = new Customer();
        customer.setId("2");

        dao.remove(customer);
        Customer customer1 = dao.findByPk("2");
        assertNull(customer1);

    }
}
