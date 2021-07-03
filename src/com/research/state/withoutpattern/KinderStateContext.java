package com.research.state.withoutpattern;

public class KinderStateContext {
	KinderState state;

	public KinderStateContext(KinderState state) {
		super();
		this.state = state;
	}
	public void switchKinderState() {
		if(state == KinderState.ATTENDSTATE) {
			System.out.println("小手放放好，屁股坐坐好，眼睛看前面，闭上小嘴巴，认真听讲讲");
		}else if(state == KinderState.LUNCHSTATE) {
			System.out.println("吃饭饭，不挑食，吃光光");
		}else if (state == KinderState.SPORTSTATE) {
			System.out.println("爬高高，躲猫猫");
		}else {
			System.out.println("do nothing");
		}
	}
	
}
