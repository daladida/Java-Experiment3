package Experiment4;
/*��ʿ�о�����*/
public class Doctor extends Person implements SMI,TMI {
	public int fee;public String f;//ÿѧ��ѧ��(�����м���������쳣����)
	public int salary;public String s;//ÿ��нˮ
	public int term; public String t;//ѧϰѧ��
	public int month;public String m;//�����·�
	public int PF () {//�������ѧ�ѵĳ��󷽷�
		return this.fee*this.term;
	}
	public int PS () {//���巢��нˮ�ĳ��󷽷�
		return this.salary*this.month;
	}
	public void QF () {//�����ѯѧ�ѵĳ��󷽷�
		System.out.println("ѧ�ѽ��:"+this.fee*this.term);
	}
	public void QS () {//�����ѯнˮ�ĳ��󷽷�
		System.out.println("нˮ���:"+this.salary*this.month);
	}
	public String toString() {//��дtoString()����������������Լȶ���ʽ�����ʾ
		return "����:"+this.Name+" ����:"+this.Age+" �Ա�:"+this.Sex+" ÿѧ��ѧ�ѣ�"+this.fee+" ÿ��нˮ:"+this.salary+" ѧϰѧ��:"+this.term+" �����·�:"+this.month;
	}
}
