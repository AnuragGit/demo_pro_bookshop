package com.bookshop.webapp.dao;

import java.sql.Blob;

public interface CommonDao {

	public Blob getBlob(byte[] blob);
}
