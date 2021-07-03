package com.research.state.context;

import com.research.state.KinderState;

/**
 *ͨ��״̬ģʽȥ����ÿ��״̬��ҵ���߼�
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
