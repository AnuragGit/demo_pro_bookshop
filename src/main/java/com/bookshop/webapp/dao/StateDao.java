package com.bookshop.webapp.dao;

import java.util.List;

import com.bookshop.webapp.model.State;

public interface StateDao {

	public void saveState(State state);

	public void deleteState(Integer stateId);

	public State getState(Integer stateId);

	public List<State> getStateList();

}
