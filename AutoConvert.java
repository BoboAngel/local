 //���������Զ�ת�����;���   ת��   �߾��ȣ�
public class AutoConvert{
	//��дһ��main����
	public static void main(String[] args){
		//��ʾ�Զ�ת��
		int num = 'a'; //�ַ���char תΪ ���� int
		double d = 20;//����int תΪ  ˫���ȸ�����double
		System.out.println(num);//������97
		System.out.println(d);//������20.0


		//ת���е�ϸ��
		/*
	1.�����������ͻ������ʱ
			int a=10;
			float d = a + 1.1;//���� a + 1.1 ��������� double
			��ȷ��float d = a + 1.1F; ǿ��ת��Ϊfloat��
			��  double d = a + 1.1; ��ȷ���޾�����ʧ

			 �����ǰѾ��ȴ������󣩵��������͸�ֵ���;��ȣ�����С���� ��������ʱ��
			 �ͻᱨ�����־�����ʧ����֮�ͻ�����Զ�����ת��


	2.(byte,short) ��char ֮�䲻���໥�Զ�ת��
			 byte b = 10;//��Χ -128~127
			 int a = 2;
			 byte c = a;//����int�޷�װ���ֽ���byte,Ҳ����תΪ char

			 char f =b;//���� byte����ת��Ϊchar

	3.byte,short,char �������߿��Լ��㣬����  ����ǰ  ���Զ�תΪ int����

			 byte a =1;
			 byte c =2;
			 short g = 3;
			 short e =a + c;//����  ����ǰ ��תΪ int���ͣ�int�޷�תΪshort,������ʧ

			 int d = a + c; ��

			 byte v = a + c;//���� ����ǰ��תΪ int����


	4.boolean ���Ͳ�����ת�� 
			 boolean nu = true;
			 int r = nu;//boolean ���Ͳ������������͵��Զ�ת��

		*/


	}
}