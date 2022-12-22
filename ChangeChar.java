//演示转义字符的使用


public class ChangeChar{
	//编写一个main方法
	public static void main(String[] args){
		//     \t  :一个制表符，实现对齐功能
		System.out.println("北京\t云南\t上海");
		//  \n   : 换行符
		System.out.println("xiao\nming\nxiao\nhong");
		//  \\   :输出一个\
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");
		//  \"    :输出一个 "  (相似用法 \'  ：输出一个' )
		System.out.println("老韩说：\"要好好学java，才有前途\"");
		//  \r    :回车符
		System.out.println("北京教育\r星仔");  //输出结果：星仔教育（星仔 替换 北京）
        System.out.println("北京教育\r\n星仔");//输出结果：北京教育 换行 星仔

        System.out.println("北京教育\n\r星仔"); //输出结果与上一行一样
	}
} 