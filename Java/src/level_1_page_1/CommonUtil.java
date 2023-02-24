package level_1_page_1;

public class CommonUtil {
	
	// 1부터 k까지의 정수를 n개 랜덤 뽑기. 중복X
	public static int[] makeR(int num, int k) {
    	int[] numbers = new int[num]; // num개의 정수를 담는 배열 선언
   	 
    	for(int insertCur = 0; insertCur < numbers.length ; insertCur++){
    	    numbers[insertCur] = (int)(Math.random() * k) + 1;
    	 
    	    for(int searchCur = 0; searchCur < insertCur; searchCur ++){
    	        if(numbers[insertCur] == numbers[searchCur]){
    	            insertCur--; // insertCur를 앞으로 민다
    	            break; // 다음 것을 검색할 필요가 없으므로 중복검사 반복을 나갑니다.
    	        }
    	    }
    	}
    	 
    	
    	return numbers;
    }
}
