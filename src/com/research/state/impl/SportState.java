package com.research.state.impl;

import com.research.state.KinderState;

/**
 *运动状态业务逻辑
 */
public class SportState implements KinderState {

	@Override
	public void kinderService() {
		System.out.println("爬高高，躲猫猫");
	}

}
