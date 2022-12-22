//.java源文件；.class字节码文件
//一个源文件中最多只可有一个public类，但可以有多个其他类
//每一个类编译后，都会有一个字节码文件

 public class Hello{ //class类，Hello是当前公共类名，应与保存文件名一致

	public static void main(String[] args){ //main主方法，程序主入口

 		System.out.println("Hello,world~");//结果输出
 	}
 }
        //非public类的运用
 class tiger{
 	public static void main(String[] args){
 		System.out.println("hello,小老虎！");

 	}
 }