 //数据类型自动转换（低精度   转换   高精度）
public class AutoConvert{
	//编写一个main方法
	public static void main(String[] args){
		//演示自动转换
		int num = 'a'; //字符型char 转为 整型 int
		double d = 20;//整型int 转为  双精度浮点型double
		System.out.println(num);//结果输出97
		System.out.println(d);//结果输出20.0


		//转换中的细节
		/*
	1.多种数据类型混合运算时
			int a=10;
			float d = a + 1.1;//报错 a + 1.1 结果类型是 double
			正确：float d = a + 1.1F; 强制转换为float型
			但  double d = a + 1.1; 正确，无精度损失

			 当我们把精度大（容量大）的数据类型赋值给低精度（容量小）的 数据类型时，
			 就会报错，出现精度损失，反之就会进行自动类型转换


	2.(byte,short) 和char 之间不会相互自动转换
			 byte b = 10;//范围 -128~127
			 int a = 2;
			 byte c = a;//报错：int无法装换字节型byte,也不能转为 char

			 char f =b;//报错 byte不能转换为char

	3.byte,short,char 他们三者可以计算，但在  计算前  会自动转为 int类型

			 byte a =1;
			 byte c =2;
			 short g = 3;
			 short e =a + c;//报错  计算前 先转为 int类型，int无法转为short,精度损失

			 int d = a + c; 对

			 byte v = a + c;//报错 计算前被转为 int类型


	4.boolean 类型不参与转换 
			 boolean nu = true;
			 int r = nu;//boolean 类型不参与数据类型的自动转换

		*/


	}
}