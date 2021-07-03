package com.research.state.client;

import com.research.state.context.KinderStateContext;
import com.research.state.impl.AttendState;

/**
 *����
 */
public class Client {
	public static void main(String[] args) {
		//��������л�״̬
		KinderStateContext kinderStateContext = new KinderStateContext(new AttendState());
		kinderStateContext.switchKinderState();
	}
}
