package com.bookshop.webapp.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookshop.webapp.dao.StateDao;
import com.bookshop.webapp.model.State;

@Repository
public class StateDaoImpl implements StateDao {

	@Autowired SessionFactory factory;
	
	@Override
	public void saveState(State state) {
		factory.getCurrentSession().merge(state);
	}

	@Override
	public void deleteState(Integer stateId) {
		State state = getState(stateId);
		if(state!=null){
			factory.getCurrentSession().delete(state);
		}
				
	}

	@Override
	public State getState(Integer stateId) {
		State state = (State) factory.getCurrentSession().get(State.class, stateId);
		return state;
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public List<State> getStateList() {
		List<State> stateList = factory.getCurrentSession().createQuery("From State").list();
		return stateList;
	}

}
