package com.sunbeam.dao;
import org.hibernate.*;

import static com.sunbeam.utils.HibernateUtils.getFactory;

import java.io.Serializable;

import com.sunbeam.entities.User;
import com.sunbeam.utils.HibernateUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public String signUp(User user) {
		String mesg="user registration failed!!!!";
		Session session=getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try{
			Serializable userId = session.save(user);
		tx.commit();
		mesg="user registered successfully , with ID"+userId;
		}
		 catch (RuntimeException e) {
				
				if(tx != null)
					tx.rollback();
		
				throw e;
			}
			return mesg;
		
	}

	@Override
	public User getUserDetailsById(Long userId) {
		
		return null;
	}

}
