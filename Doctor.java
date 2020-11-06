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
