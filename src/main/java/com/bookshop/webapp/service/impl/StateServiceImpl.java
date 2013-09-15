package com.bookshop.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.webapp.dao.StateDao;
import com.bookshop.webapp.model.State;
import com.bookshop.webapp.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired StateDao stateDao;
	
	@Override
	@Transactional
	public void saveState(State state) {
		stateDao.saveState(state);
	}

	@Override
	@Transactional
	public void deleteState(Integer stateId) {
		stateDao.deleteState(stateId);
	}

	@Override
	@Transactional
	public State getState(Integer stateId) {
		return stateDao.getState(stateId);
		 
	}

	@Override
	@Transactional
	public List<State> getStateList() {
		return stateDao.getStateList();
	}

}
