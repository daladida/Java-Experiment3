package Experiment4;
import java.util.*;
public class Test {
	public static final double ratio = 0.1;//固定纳税系数
	public static void WAY (Doctor d) {//定义静态函数计算并显示税额
		double tax = ratio*(d.PS()-d.PF());
		System.out.println("您所需要缴纳的税额为："+tax);
		}
	public static void main(String args[]) {
		Scanner scan1 = new Scanner(System.in);	//构造Scanner类的对象scan，接收从控制台输入的信息，实现交互式输入
		Doctor D1 = new Doctor();//实例化第一名博士生
		System.out.println("请输入第一位博士生的信息");
		System.out.println("姓名：");
	    D1.Name= scan1.nextLine();
		System.out.println("性别：");
		D1.Sex= scan1.nextLine();
		System.out.println("年龄：");//}catch(ArrayIndexOutOfBoundsException ne) {System.out.println("未提供任何参数！！！！");}
			while(scan1.hasNextLine()) {// hasNextLine()方法判断当前是否有输入，当键盘有输入后执行循环
			if(scan1.hasNextInt()) {// 判断输入的值是否为整数类型，当为整数类型时执行循环
				D1.Age = scan1.nextLine();
				break;
			}else {
				System.out.println("请输入整型数字哦！");//异常处理
				D1.Age = scan1.nextLine();
				continue;
				}
			}
        System.out.println("每学期学费：");
        	while(scan1.hasNextLine()) {
    			if(scan1.hasNextInt()) {
    				D1.f = scan1.nextLine();
    				D1.fee  = Integer.parseInt(D1.f);//Integer.parseInt()将String型的中间变量转化为整型方便计算
    				break;
    			}else {
    				System.out.println("请输入整型数字哦！");//异常处理
    				D1.f = scan1.nextLine();
    				continue;
    			}
        	}
			System.out.println("每月薪水：");
			while(scan1.hasNextLine()) {
				if(scan1.hasNextInt()) {
					D1.s = scan1.nextLine();
					D1.salary = Integer.parseInt(D1.s);//Integer.parseInt()将String型的中间变量转化为整型方便计算
					break;
				}else {
					System.out.println("请输入整型数字哦！");//异常处理
					D1.s = scan1.nextLine();
					continue;
				}
			}
			System.out.println("学习学期：");
			while(scan1.hasNextLine()) {
    			if(scan1.hasNextInt()) {
    				D1.t = scan1.nextLine();
    				D1.term = Integer.parseInt(D1.t);//Integer.parseInt()将String型的中间变量转化为整型方便计算
    				break;
    			}else {
    				System.out.println("请输入整型数字哦！");//异常处理
    				D1.t = scan1.nextLine();
    				continue;
    			}
        	}
			System.out.println("工作月份：");
    	try	{	D1.m = scan1.nextLine();
    			D1.month = Integer.parseInt(D1.m);}//Integer.parseInt()将String型的中间变量转化为整型方便计算
	    catch(Exception ea){
	    	System.out.println("您输入的格式有误，请注意输入整型数字哦！！！");
	    	D1.month = scan1.nextInt();}//异常处理	
    	System.out.println(D1);//输出第一名博士的基本信息
		D1.QF();D1.QS();//访问接口统计年收入和学费
		WAY(D1);//直接通过方法名调用税额方法（静态）
		Scanner scan2 = new Scanner(System.in);
		Doctor D2 = new Doctor();//实例化第二名博士生
		System.out.println("请输入第二位博士生的信息");
		System.out.println("姓名：");
		D2.Name= scan2.nextLine();
		System.out.println("性别：");
		D2.Sex= scan2.nextLine();
		System.out.println("年龄：");
		while(scan2.hasNextLine()) {// hasNextLine()方法判断当前是否有输入，当键盘有输入后执行循环
			if(scan2.hasNextInt()) {// 判断输入的值是否为整数类型，当为整数类型时执行循环
				D2.Age = scan2.nextLine();
				break;
			}else {
				System.out.println("请输入整型数字哦！");//异常处理
				D2.Age = scan2.nextLine();
				continue;
			}
		}
		System.out.println("每学期学费：");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.f = scan2.nextLine();
			    D2.fee = Integer.parseInt(D2.f);//Integer.parseInt()将String型的中间变量转化为整型方便计算
				break;
			}else {
				System.out.println("请输入整型数字哦！");//异常处理
				D2.f = scan2.nextLine();
				continue;
			}
		}
		System.out.println("每月薪水：");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
			    D2.s = scan2.nextLine();
			    D2.salary = Integer.parseInt(D2.s);//Integer.parseInt()将String型的中间变量转化为整型方便计算
				break;
			}else {
				System.out.println("请输入整型数字哦！");//异常处理
				D2.s = scan2.nextLine();
				continue;
			}
		}
		System.out.println("学习学期：");
		while(scan2.hasNextLine()) {
			if(scan2.hasNextInt()) {
				D2.t = scan2.nextLine();
				D2.term = Integer.parseInt(D2.t);//Integer.parseInt()将String型的中间变量转化为整型方便计算
				break;
			}else {
				System.out.println("请输入整型数字哦！");//异常处理
				D2.t = scan2.nextLine();
				continue;
			}
    	}
		System.out.println("工作月份：");
		try	{	D2.m = scan2.nextLine();
		        D2.month  = Integer.parseInt(D2.m);}//Integer.parseInt()将String型的中间变量转化为整型方便计算
        catch(Exception eb) {
	        System.out.println("请注意输入整型数字哦！！！");
	        D2.month = scan2.nextInt();
        }//异常处理
		System.out.println(D2);//输出第二名博士的基本信息
		D2.QF();D2.QS();//访问接口统计年收入和学费
		WAY(D2);//直接通过方法名调用税额方法（静态）

	}
}
