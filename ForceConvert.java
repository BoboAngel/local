//ǿ����������ת��   ���߾���    ת��    �;��� ��

public class ForceConvert {
	 //��дһ��main����
	public static void main(String[] args){

		//��ʾǿ������ת��
		int a = (int)1.9;
		System.out.println("a=" +a);//������Ϊ 1��������ʧ�ǳ���

		int e =(byte)2000;
		System.out.println("e="+e);//����������ǰ���-48�������������

	}
}

/*
     1.ǿ������ת��

     ǿת������ֻ������Ĳ�������Ч��������ʹ��С�������������ȼ�
     ��

     int x = (int) 10*3.5+6*1.5;//�������  double �޷��Զ�תΪ int
     ��ȷ int x = (int)(10*3.5+6*1.5);//(int)44.0-----44
        		System.out.pritnln(x);//������Ϊ 44

        		
*/