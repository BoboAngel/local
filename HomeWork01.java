public class HomeWork01{
	//编写一个main方法

	public static void main(String[] args){

	//使用char 类型，分别保存 \n \t \r \\  1 2 3 等字符，并打印输出

	char c1 = '\n';//换行
	char c2 = '\t'; //制表位 
	char c3 = '\r';//回车
	char c4 = '\\';//输出一个\
	char c5 = '1';
	char c6 = '2';
	char c7 = '3';

	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(c7);


	//字符串的拼接输出

	String book1 = "天龙八部";
	String book2 ="笑傲江湖";
	System.out.println(book1 + book2);//天龙八部笑傲江湖

	//性别应该使用char 保存

	char a1 = '男';
	char a2 = '女';
	//char a3 =(char)(a1 +a2); ???????
	System.out.println(a1 + a2);//得到 男 女分别对应的 编码值相加（int类型）


	//姓名
	String name = "Bobo";
	int age =20;
	double score =56.2;
	char gender = '男';
	String hobby = "羽毛球";

	//信息输出，换行输出 \t
	System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+ name +"\t" + age + 
		"\t" + score +"\t" + gender + '\t' + hobby); 
	}
}
