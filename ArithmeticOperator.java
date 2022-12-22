/*
   演示算术运算法的使用

*/

public class ArithmeticOperator{
	
	//编写一个main方法
	public static void main(String[] args){
		//使用算术运算
		System.out.println(10/4);//从数学角度是2.5 ，但java中 是2
		System.out.println(10.0 / 4); //精度提升为double ，输出 2.5

		double d = 10/4;//java中 10/4=2 ，2————2.0
		System.out.println(d);//输出是2.0

		//++的使用 ,单独使用++时，前后++都一样 
		int i = 10;
		i++;//自增 等价于i=i+1; 输出 i = 11
		++i;//自增 等价于i=i+1; 输出 i = 12
		System.out.println("i="+i);//12

		/*
			作为表达式使用
			前++：++i先自增后赋值
			后++：++i先赋值后自增
		*/

		int j = 8;
		//int k = ++j;//等价于 j=j+1;k=j;//输出j=9;k=9;
		int k = j++;//等价于 k=j;j=j+1;//输出k=8;j=9;
		System.out.println("k="+k+"j="+j);


		//面试 练习题

		int s = 1;
		s = s++;   //本质（1）temp（临时空间开辟）=s;(2) s=s;(3)s=temp
		System.out.println("s="+s);//结果输出为1

		int s2 = 1;
		s2 = ++s2;//本质 (1) s2=s2+1; 	(2) temp = s2;(3)s2 = temp
		System.out.println("s2="+s2);//结果输出为2

		//输出测试
		 int i1 = 10;
		 int i2 = 20;
		 int f = i1++;
		 System.out.println("f="+f);//10
		 System.out.println("i2="+i2);//20
		 f = --i2;
		 System.out.println("f="+f);//19
		 System.out.println("i2="+i2);//19

		 //课堂练习2
		 //1、需求：
		 //加入还有59天放假，问：合几个星期零几天？
		 //2、思路分析
		 //(1) 使用int 变量 days 保存 天数
		 //(2)  一个星期是7天 星期数是weeks：days / 7  零几天 days % 7
		 //(3) 输出

		 int days = 59;
		 int weeks = days / 7;
		 int leftDays = days % 7;
		 System.out.println(days + "天 合"+weeks+ "星期 零"+leftDays+"天");


		 //练习2  华氏温度（公式：5/9*(华氏温度-100)）转换  摄氏温度

		 double huaShi = 234.6;
		 double sheShi = 5.0/9*(huaShi-100);
		 System.out.println("华氏温度"+huaShi+"对应的摄氏温度"+sheShi);


		 //关系运算符(>,<,>=,<=,==,!=)

		 //演示逻辑运算符的使用
		 //短路与&&  和 逻辑与& 案列演示
		 int age = 50;
		 if(age>20 && age<90){
		 	System.out.println("星仔，你好");
		 }

       int leag = 50;
		 if(leag>20 & leag<90){
		 	System.out.println("粉色信笺");
		 }
		 	//区别
		 /*
		 短路与&&当条件1为false时，后边的条件2便不会再判断
		 逻辑与& 当条件1位false时，即使结果已经为false，但依旧会对条件2进行判断执行
		 （当然，只做单纯判断，无实际意义）*/

	 //短路或||  和逻辑或|
		 //只要有一个结果为true ,输出结果就为真（true）

		 //区别： 
		 /*
		 短路或|| ，只要有一个条件为true,则第二个结果就不会判断，最终结果为
		 true，相比逻辑或| 效率高（逻辑或|依旧要对第二个条件判断，但结果依旧为true）*/


	}
}