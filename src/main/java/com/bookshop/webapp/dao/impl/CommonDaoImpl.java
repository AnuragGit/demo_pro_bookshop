package com.bookshop.webapp.dao.impl;

import java.sql.Blob;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.webapp.dao.CommonDao;

@Repository
public class CommonDaoImpl implements CommonDao {

	@Autowired SessionFactory factory;
	
	@Override
	public Blob getBlob(byte[] blob) {
		return factory.getCurrentSession().getLobHelper().createBlob(blob);

	}

}
