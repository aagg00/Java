package sub2;

/*
 * ��¥: 2020/05/01
 * �̸�: �迵��
 * ����: �ݺ��� for �ǽ��ϱ�
 */
public class ForTest {

	public static void main(String[] args) {
		
		//for
		for(int i=1 ; i<3 ; i++) {
			System.out.println("Hello Java!");
		}
		
		//1���� 10���� ��
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum = sum + 1;
		}
		
		System.out.println("1���� 10���� ��: "+sum);
		
		
		//1���� 10���� ¦�� ��
		int eSum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			if(k % 2 == 0) {
				eSum += k;
			}
			
		}
		
		System.out.println("1���� 10���� ¦���� : "+eSum );
		
		//���� for����
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : "+a);
			
			for(int b=1 ; b<=5 ; b++) {
				System.out.println("b : "+b);
				
			}
		}
		
		//������
		//�� �ﰢ�� I
		//�� ��r���� II
		
		
	}
}
