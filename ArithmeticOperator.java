/*
   ��ʾ�������㷨��ʹ��

*/

public class ArithmeticOperator{
	
	//��дһ��main����
	public static void main(String[] args){
		//ʹ����������
		System.out.println(10/4);//����ѧ�Ƕ���2.5 ����java�� ��2
		System.out.println(10.0 / 4); //��������Ϊdouble ����� 2.5

		double d = 10/4;//java�� 10/4=2 ��2��������2.0
		System.out.println(d);//�����2.0

		//++��ʹ�� ,����ʹ��++ʱ��ǰ��++��һ�� 
		int i = 10;
		i++;//���� �ȼ���i=i+1; ��� i = 11
		++i;//���� �ȼ���i=i+1; ��� i = 12
		System.out.println("i="+i);//12

		/*
			��Ϊ���ʽʹ��
			ǰ++��++i��������ֵ
			��++��++i�ȸ�ֵ������
		*/

		int j = 8;
		//int k = ++j;//�ȼ��� j=j+1;k=j;//���j=9;k=9;
		int k = j++;//�ȼ��� k=j;j=j+1;//���k=8;j=9;
		System.out.println("k="+k+"j="+j);


		//���� ��ϰ��

		int s = 1;
		s = s++;   //���ʣ�1��temp����ʱ�ռ俪�٣�=s;(2) s=s;(3)s=temp
		System.out.println("s="+s);//������Ϊ1

		int s2 = 1;
		s2 = ++s2;//���� (1) s2=s2+1; 	(2) temp = s2;(3)s2 = temp
		System.out.println("s2="+s2);//������Ϊ2

		//�������
		 int i1 = 10;
		 int i2 = 20;
		 int f = i1++;
		 System.out.println("f="+f);//10
		 System.out.println("i2="+i2);//20
		 f = --i2;
		 System.out.println("f="+f);//19
		 System.out.println("i2="+i2);//19

		 //������ϰ2
		 //1������
		 //���뻹��59��ż٣��ʣ��ϼ��������㼸�죿
		 //2��˼·����
		 //(1) ʹ��int ���� days ���� ����
		 //(2)  һ��������7�� ��������weeks��days / 7  �㼸�� days % 7
		 //(3) ���

		 int days = 59;
		 int weeks = days / 7;
		 int leftDays = days % 7;
		 System.out.println(days + "�� ��"+weeks+ "���� ��"+leftDays+"��");


		 //��ϰ2  �����¶ȣ���ʽ��5/9*(�����¶�-100)��ת��  �����¶�

		 double huaShi = 234.6;
		 double sheShi = 5.0/9*(huaShi-100);
		 System.out.println("�����¶�"+huaShi+"��Ӧ�������¶�"+sheShi);


		 //��ϵ�����(>,<,>=,<=,==,!=)

		 //��ʾ�߼��������ʹ��
		 //��·��&&  �� �߼���& ������ʾ
		 int age = 50;
		 if(age>20 && age<90){
		 	System.out.println("���У����");
		 }

       int leag = 50;
		 if(leag>20 & leag<90){
		 	System.out.println("��ɫ�ż�");
		 }
		 	//����
		 /*
		 ��·��&&������1Ϊfalseʱ����ߵ�����2�㲻�����ж�
		 �߼���& ������1λfalseʱ����ʹ����Ѿ�Ϊfalse�������ɻ������2�����ж�ִ��
		 ����Ȼ��ֻ�������жϣ���ʵ�����壩*/

	 //��·��||  ���߼���|
		 //ֻҪ��һ�����Ϊtrue ,��������Ϊ�棨true��

		 //���� 
		 /*
		 ��·��|| ��ֻҪ��һ������Ϊtrue,��ڶ�������Ͳ����жϣ����ս��Ϊ
		 true������߼���| Ч�ʸߣ��߼���|����Ҫ�Եڶ��������жϣ����������Ϊtrue��*/


	}
}