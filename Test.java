package Experiment4;
import java.util.*;
public class Test {
	public static final double ratio = 0.1;//�̶���˰ϵ��
	public static void WAY (Doctor d) {//���徲̬�������㲢��ʾ˰��
		double tax = ratio*(d.PS()-d.PF());
		System.out.println("������Ҫ���ɵ�˰��Ϊ��"+tax);
		}
	public static void main(String args[]) {
		Scanner scan1 = new Scanner(System.in);	//����Scanner��Ķ���scan�����մӿ���̨�������Ϣ��ʵ�ֽ���ʽ����
		Doctor D1 = new Doctor();//ʵ������һ����ʿ��
		System.out.println("�������һλ��ʿ������Ϣ");
		System.out.println("������");
	    D1.Name= scan1.nextLine();
		System.out.println("�Ա�");
		D1.Sex= scan1.nextLine();
		System.out.println("���䣺");//}catch(ArrayIndexOutOfBoundsException ne) {System.out.println("δ�ṩ�κβ�����������");}
			while(scan1.hasNextLine()) {// hasNextLine()�����жϵ�ǰ�Ƿ������룬�������������ִ��ѭ��
			if(scan1.hasNextInt()) {// �ж������ֵ�Ƿ�Ϊ�������ͣ���Ϊ��������ʱִ��ѭ��
				D1.Age = scan1.nextLine();
				break;
			}else {
				System.out.println("��������������Ŷ��");//�쳣����
				D1.Age = scan1.nextLine();
				continue;
				}
			}
        System.out.println("ÿѧ��ѧ�ѣ�");
        	while(scan1.hasNextLine()) {
    			if(scan1.hasNextInt()) {
    				D1.f = scan1.nextLine();
    				D1.fee  = Integer.parseInt(D1.f);//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
    				break;
    			}else {
    				System.out.println("��������������Ŷ��");//�쳣����
    				D1.f = scan1.nextLine();
    				continue;
    			}
        	}
			System.out.println("ÿ��нˮ��");
			while(scan1.hasNextLine()) {
				if(scan1.hasNextInt()) {
					D1.s = scan1.nextLine();
					D1.salary = Integer.parseInt(D1.s);//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
					break;
				}else {
					System.out.println("��������������Ŷ��");//�쳣����
					D1.s = scan1.nextLine();
					continue;
				}
			}
			System.out.println("ѧϰѧ�ڣ�");
			while(scan1.hasNextLine()) {
    			if(scan1.hasNextInt()) {
    				D1.t = scan1.nextLine();
    				D1.term = Integer.parseInt(D1.t);//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
    				break;
    			}else {
    				System.out.println("��������������Ŷ��");//�쳣����
    				D1.t = scan1.nextLine();
    				continue;
    			}
        	}
			System.out.println("�����·ݣ�");
    	try	{	D1.m = scan1.nextLine();
    			D1.month = Integer.parseInt(D1.m);}//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
	    catch(Exception ea){
	    	System.out.println("������ĸ�ʽ������ע��������������Ŷ������");
	    	D1.month = scan1.nextInt();}//�쳣����	
    	System.out.println(D1);//�����һ����ʿ�Ļ�����Ϣ
		D1.QF();D1.QS();//���ʽӿ�ͳ���������ѧ��
		WAY(D1);//ֱ��ͨ������������˰�������̬��
		Scanner scan2 = new Scanner(System.in);
		Doctor D2 = new Doctor();//ʵ�����ڶ�����ʿ��
		System.out.println("������ڶ�λ��ʿ������Ϣ");
		System.out.println("������");
		D2.Name= scan2.nextLine();
		System.out.println("�Ա�");
		D2.Sex= scan2.nextLine();
		System.out.println("���䣺");
		while(scan2.hasNextLine()) {// hasNextLine()�����жϵ�ǰ�Ƿ������룬�������������ִ��ѭ��
			if(scan2.hasNextInt()) {// �ж������ֵ�Ƿ�Ϊ�������ͣ���Ϊ��������ʱִ��ѭ��
				D2.Age = scan2.nextLine();
				break;
			}else {
				System.out.println("��������������Ŷ��");//�쳣����
				D2.Age = scan2.nextLine();
				continue;
			}
		}
		System.out.println("ÿѧ��ѧ�ѣ�");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.f = scan2.nextLine();
			    D2.fee = Integer.parseInt(D2.f);//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
				break;
			}else {
				System.out.println("��������������Ŷ��");//�쳣����
				D2.f = scan2.nextLine();
				continue;
			}
		}
		System.out.println("ÿ��нˮ��");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.s = scan2.nextLine();
			    D2.salary = Integer.parseInt(D2.s);//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
				break;
			}else {
				System.out.println("��������������Ŷ��");//�쳣����
				D2.s = scan2.nextLine();
				continue;
			}
		}
		System.out.println("ѧϰѧ�ڣ�");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
				D2.t = scan2.nextLine();
				D2.term = Integer.parseInt(D2.t);//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
				break;
			}else {
				System.out.println("��������������Ŷ��");//�쳣����
				D2.t = scan2.nextLine();
				continue;
			}
    	}
		System.out.println("�����·ݣ�");
		try	{	D2.m = scan2.nextLine();
		        D2.month  = Integer.parseInt(D2.m);}//Integer.parseInt()��String�͵��м����ת��Ϊ���ͷ������
        catch(Exception eb) {
	        System.out.println("��ע��������������Ŷ������");
	        D2.month = scan2.nextInt();
        }//�쳣����
		System.out.println(D2);//����ڶ�����ʿ�Ļ�����Ϣ
		D2.QF();D2.QS();//���ʽӿ�ͳ���������ѧ��
		WAY(D2);//ֱ��ͨ������������˰�������̬��

	}
}
