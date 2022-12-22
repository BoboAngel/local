import java.util.Scanner;
public class MulForExercise01{
	
	//编写一个main方法
	public static void main(String[] ages){
		//统计3个班成绩情况，每个班有5名同学，
		//求出每个班平均成绩和所有班的平均成绩
		//求出及格人数

		//创建Scanner对象
		Scanner myScanner = new Scanner(System.in);

		double totalScore = 0;//定义所有班级学生初始总成绩和
		int passNumber = 0;//成绩合格初始化
		int classNumber = 3;//班级数
		int classStudent = 5;//每个班人数
		for(int j=1;j<=classNumber;j++){//j表示班级

		double sum = 0;//定义一个班级的初始总分
		for(int i=1;i<=classStudent;i++){
			System.out.println("请输出第"+j+"个班的第"+i+"个同学的成绩");
			double score = myScanner.nextDouble();//成绩接收
			if(score>=60){
				passNumber++;
			}
			System.out.println("成绩为"+score);
			sum+=score;
			//System.out.println("总分为"+sum+"平均分为"+sum/5);
		}
		System.out.println("总分为"+sum+"平均分为"+sum/5);
		totalScore+=sum;

		}
		System.out.println("三个班的总分"+totalScore+"平均分="+totalScore/15);
		System.out.println("及格人数为"+passNumber);
	}
}