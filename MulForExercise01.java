import java.util.Scanner;
public class MulForExercise01{
	
	//��дһ��main����
	public static void main(String[] ages){
		//ͳ��3����ɼ������ÿ������5��ͬѧ��
		//���ÿ����ƽ���ɼ������а��ƽ���ɼ�
		//�����������

		//����Scanner����
		Scanner myScanner = new Scanner(System.in);

		double totalScore = 0;//�������а༶ѧ����ʼ�ܳɼ���
		int passNumber = 0;//�ɼ��ϸ��ʼ��
		int classNumber = 3;//�༶��
		int classStudent = 5;//ÿ��������
		for(int j=1;j<=classNumber;j++){//j��ʾ�༶

		double sum = 0;//����һ���༶�ĳ�ʼ�ܷ�
		for(int i=1;i<=classStudent;i++){
			System.out.println("�������"+j+"����ĵ�"+i+"��ͬѧ�ĳɼ�");
			double score = myScanner.nextDouble();//�ɼ�����
			if(score>=60){
				passNumber++;
			}
			System.out.println("�ɼ�Ϊ"+score);
			sum+=score;
			//System.out.println("�ܷ�Ϊ"+sum+"ƽ����Ϊ"+sum/5);
		}
		System.out.println("�ܷ�Ϊ"+sum+"ƽ����Ϊ"+sum/5);
		totalScore+=sum;

		}
		System.out.println("��������ܷ�"+totalScore+"ƽ����="+totalScore/15);
		System.out.println("��������Ϊ"+passNumber);
	}
}