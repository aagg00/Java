package sub2;
/*
 * 날짜 : 2020/05/04
 * 이름 : 김영민
 * 내용 : 반복문 while 실습하기
 */
public class WhileTest {

	
	public static void main(String[] args) {

		// 1부터 10까지함
	    int sum = 0;
	    int k = 1;
	    
	    
	    while( k <= 10) {
			
			sum + = k;
			k++;
		}
	    		
	    System.out.println("1부터 10까지 합 : "+sum);
		
		
		// do ~ while
	    int eSum = 0;
	    int i = 1;
	    
	    do {
	    	 if(i%2 == 0) {
	    		 eSum += i;
	    	}
	    	
	    	i++;	
	    }
	    while(i <=10);
	    
	    System.out.println("1부터 10까지 짝수합 : "+eSum);
	    
	    
		// break
	    int num = 0;
	    
	    
	    while(true) {
	    	
	    	num++;
	    	
	    	if(num%5 == 0 && num%7 == 0) {
	    		break;
	    	}
	    	
	    }
	    
	    System.out.println("5와 7의 최소공배수 : "+num);
		// continue 
	}
	
}







