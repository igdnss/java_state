package com.research.state.withoutpattern;


public class Client {
	public static void main(String[] args) {
		KinderStateContext kinderStateContext = new KinderStateContext(KinderState.ATTENDSTATE);
		kinderStateContext.switchKinderState();
	}
}
