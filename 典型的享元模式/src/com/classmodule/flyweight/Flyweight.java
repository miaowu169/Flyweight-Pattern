package com.classmodule.flyweight;
/*
 * ����������Ԫ��
 */
public abstract class Flyweight {
	//�ڲ�״̬
	public String intrinsic;
	//�ⲿ״̬
	public String extrinsic;
	
	//Ҫ����Ԫ��ɫ��������ⲿ״̬
	public Flyweight(String extrinsic) {
		this.extrinsic = extrinsic;
	}
	
	//����ҵ�����
	public abstract void operate(int extrinsic);
	
	public String getInstrinsic() {
		return intrinsic;
	}
	
	public void setIntrinsic(String _intrinsic) {
		this.intrinsic = _intrinsic;
	}
}
