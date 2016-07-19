package com.courier.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.courier.dto.Employee;

@Repository
public class EmployeeDao {
	SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
	}
}
