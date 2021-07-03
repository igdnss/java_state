package com.research.state.client;

import com.research.state.context.KinderStateContext;
import com.research.state.impl.AttendState;

/**
 *测试
 */
public class Client {
	public static void main(String[] args) {
		//这里可以切换状态
		KinderStateContext kinderStateContext = new KinderStateContext(new AttendState());
		kinderStateContext.switchKinderState();
	}
}
