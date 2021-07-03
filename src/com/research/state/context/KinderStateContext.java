package com.research.state.context;

import com.research.state.KinderState;

/**
 *通过状态模式去处理每种状态的业务逻辑
 */
public class KinderStateContext {
	KinderState kinderState;
	public KinderStateContext(KinderState kinderState) {
		this.kinderState = kinderState;
	}
	
	public void switchKinderState(){
		kinderState.kinderService();
	}
}
