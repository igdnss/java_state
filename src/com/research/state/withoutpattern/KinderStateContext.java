package com.research.state.withoutpattern;

public class KinderStateContext {
	KinderState state;

	public KinderStateContext(KinderState state) {
		super();
		this.state = state;
	}
	public void switchKinderState() {
		if(state == KinderState.ATTENDSTATE) {
			System.out.println("С�ַŷźã�ƨ�������ã��۾���ǰ�棬����С��ͣ�����������");
		}else if(state == KinderState.LUNCHSTATE) {
			System.out.println("�Է���������ʳ���Թ��");
		}else if (state == KinderState.SPORTSTATE) {
			System.out.println("���߸ߣ���èè");
		}else {
			System.out.println("do nothing");
		}
	}
	
}
