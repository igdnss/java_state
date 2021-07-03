package com.research.state.withoutpattern;


/**
 *测试
 */
public class Client {
	public static void main(String[] args) {
		//这里可以切换状态
		KinderStateContext kinderStateContext = new KinderStateContext(KinderState.ATTENDSTATE);
		kinderStateContext.switchKinderState();
	}
}
