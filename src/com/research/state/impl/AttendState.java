package com.research.state.impl;

import com.research.state.KinderState;

/**
 * 上课状态业务逻辑
 *
 */
public class AttendState implements KinderState {

	@Override
	public void kinderService() {
		System.out.println("小手放放好，屁股坐坐好，眼睛看前面，闭上小嘴巴，认真听讲讲");
	}

}
