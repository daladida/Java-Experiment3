# Java-Experiment3
 **Java课程作业项目仓库**

## 实验目的
* 掌握Java中抽象类和抽象方法的定义;  
* 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;  
* 了解异常的使用方法，并在程序中根据输入情况做异常处理;  

## 实验内容
  ### 说明
***某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份:学生和助教教师。(*设计并使用学生与教师两个接口*)***
  ### 对象
    人员（姓名、性别、年龄）;  
    学生接口（包括缴纳学费、查学费的方法）;  
    教师接口（包括发放薪水和查询薪水的方法）;  
    博士研究生类（实现上述的两个接口且具有每学期学费、每月薪水、学习学期、工作月份等属性）;  
 >编写上述实体类以及测试主类（***注意类之间继承关系的适用***）;    
 >在测试主类中，至少实例化两名博士研究生，统计他们的年收入和学费，根据两者之差，算出每名博士研究生的年应纳税金额;  
 >打印每位博士研究生的相关信息;  

## 实验要求
    * 在博士研究生类中实现各个接口定义的抽象方法;  
    * 对年学费和年收入进行统计，用收入减去学费，求得纳税额;  
    * 国家最新纳税标准（系数)，属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用*static final*修饰定义;  
    * 实例化研究生类时，可采用运行时通过*main*方法的参数*args*一次性赋值，也可采用*Scanner类*实现运行时交互式输入;  
    * 根据输入情况，要在程序中做异常处理;  

## 实验过程
>* SMI接口(*学生管理接口*)声明缴纳学费(*PF*)、查询学费(*QF*)的抽象方法;  
>* TMI接口(*教师管理接口*)声明发放薪水(*PS*)、查询薪水(*QS*)的抽象方法;  
>* Person类下定义三个基本属性（*Age、Name、Sex*），利用Scanner类交互式输入为属性赋值;      
>* Doctor类继承Person类，获得父类属性，定义类下四个基本属性(*fee、term、salary、month*)同时将SMI、TMI两接口的所有抽象方法实现;  
>查询方法(*QF、QS*)打印fee*term与salary*month的计算结果，即显示计算的学费金额与薪水金额;  
>支付方法(*PF、PS*)计算salary*month与fee*term的结果，即计算学费金额与薪水金额;  
>重写toString()方法，将相关属性以既定方式输出显示;        
>>* 在Test主类中，定义类下的特有属性static final double ratio(*纳税系数*)以及静态方法WAY(Doctor d)为其下tax赋值,即输出并打印纳税金额;    
>>>main方法中构造Scanner类的对象scan，接收从控制台输入的信息，实现交互式输入;  
>>>main方法中创建一个Doctor对象D1，实例化第一名博士生,并通过Scanner类运行时交互式输入为其所有属性依次赋值;(*有属性提示*);  
>>>main方法中创建一个Doctor对象D2，实例化第二名博士生,并通过Scanner类运行时交互式输入为其所有属性依次赋值;(*有属性提示*);   
>>>在通过Scanner类交互式输入赋值时，对每位博士生每个属性赋值嵌入while循环和if else条件判断,当输入值的格式有误时进行else异常处理，继续执行循环重新赋值(*有错误提示*);  
>>>调用每位博士生类下重写的toString()方法,输出其各种属性赋值信息以及相关值的计算结果(*纳税金额、学费金额、薪水金额*);    
>>>在每位博士生的基本信息输入后直接通过方法名调用Test类下的税额WAY方法，将形参分别修改为D1、D2（*静态*）;    
>>>>* 异常处理
>>>>在交互式输入博士生基本属性时，将可能出现错误赋值的语句用try{}包含，并catch(Exception e){}捕获错误，进行异常处理，输出相应错误提示信息，然后重新赋值;    
## 核心代码(省略Person类与SMI、TMI两接口)
### Doctor类
```javascript
package Experiment4;
/*博士研究生类*/
public class Doctor extends Person implements SMI,TMI {
	public int fee;public String f;//每学期学费(引入中间变量便于异常处理)
	public int salary;public String s;//每月薪水
	public int term; public String t;//学习学期
	public int month;public String m;//工作月份
	public int PF () {//定义缴纳学费的抽象方法
		return this.fee*this.term;
	}
	public int PS () {//定义发放薪水的抽象方法
		return this.salary*this.month;
	}
	public void QF () {//定义查询学费的抽象方法
		System.out.println("学费金额:"+this.fee*this.term);
	}
	public void QS () {//定义查询薪水的抽象方法
		System.out.println("薪水金额:"+this.salary*this.month);
	}
	public String toString() {//重写toString()方法，将相关属性以既定方式输出显示
		return "姓名:"+this.Name+" 年龄:"+this.Age+" 性别:"+this.Sex+" 每学期学费："+this.fee+" 每月薪水:"+this.salary+" 学习学期:"+this.term+" 工作月份:"+this.month;
	}
}
```
### Test类(第二名博士生实例化省略)
```javascript
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
```
## 系统运行截图
![image](https://github.com/daladida/Java-Experiment3/blob/main/images/%E5%AE%9E%E9%AA%8C%EF%BC%88%E4%B8%89%EF%BC%89%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C-1.png)
![image](https://github.com/daladida/Java-Experiment3/blob/main/images/%E5%AE%9E%E9%AA%8C%EF%BC%88%E4%B8%89%EF%BC%89%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C-1.png)
## 实验感想
