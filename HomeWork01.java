public class HomeWork01{
	//��дһ��main����

	public static void main(String[] args){

	//ʹ��char ���ͣ��ֱ𱣴� \n \t \r \\  1 2 3 ���ַ�������ӡ���

	char c1 = '\n';//����
	char c2 = '\t'; //�Ʊ�λ 
	char c3 = '\r';//�س�
	char c4 = '\\';//���һ��\
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


	//�ַ�����ƴ�����

	String book1 = "�����˲�";
	String book2 ="Ц������";
	System.out.println(book1 + book2);//�����˲�Ц������

	//�Ա�Ӧ��ʹ��char ����

	char a1 = '��';
	char a2 = 'Ů';
	//char a3 =(char)(a1 +a2); ???????
	System.out.println(a1 + a2);//�õ� �� Ů�ֱ��Ӧ�� ����ֵ��ӣ�int���ͣ�


	//����
	String name = "Bobo";
	int age =20;
	double score =56.2;
	char gender = '��';
	String hobby = "��ë��";

	//��Ϣ������������ \t
	System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n"+ name +"\t" + age + 
		"\t" + score +"\t" + gender + '\t' + hobby); 
	}
}
