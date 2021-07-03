package com.research.state.impl;

import com.research.state.KinderState;

public class LunchState implements KinderState {

	@Override
	public void kinderService() {
		System.out.println("吃饭饭，不挑食，吃光光");
	}

}
