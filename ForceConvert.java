//强制数据类型转换   （高精度    转换    低精度 ）

public class ForceConvert {
	 //编写一个main方法
	public static void main(String[] args){

		//演示强制类型转换
		int a = (int)1.9;
		System.out.println("a=" +a);//结果输出为 1，精度损失非常大

		int e =(byte)2000;
		System.out.println("e="+e);//结果溢出，当前输出-48，数据随机生成

	}
}

/*
     1.强制类型转换

     强转换符号只对最近的操作数有效，往往会使用小括号来提升优先级
     例

     int x = (int) 10*3.5+6*1.5;//编译错误  double 无法自动转为 int
     正确 int x = (int)(10*3.5+6*1.5);//(int)44.0-----44
        		System.out.pritnln(x);//结果输出为 44

        		
*/