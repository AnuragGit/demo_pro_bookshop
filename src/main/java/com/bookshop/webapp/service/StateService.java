package com.bookshop.webapp.service;

import java.util.List;

import com.bookshop.webapp.model.State;

public interface StateService {

	public void saveState(State state);

	public void deleteState(Integer stateId);

	public State getState(Integer stateId);

	public List<State> getStateList();

	
}
