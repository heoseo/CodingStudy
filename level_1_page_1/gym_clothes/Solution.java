package level_1_page_1.gym_clothes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import level_1_page_1.CommonUtil;

//https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
    	Arrays.sort(lost);
    	Arrays.sort(reserve);
    	long beforeTime = System.currentTimeMillis();
    	List<Integer> lList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> rList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        List<Integer> same = new ArrayList<Integer>();
        List<Integer> borrow = new ArrayList<Integer>();
        
        System.out.println(lList);
        System.out.println(rList);
        
        for(int r = 0; r < reserve.length; r++) {
        	if(lList.contains(reserve[r])) {
        		same.add(reserve[r]);
        		System.out.println("빌려주고싶은데 잃어버림!!!!");
        		continue;
        	}
        	if(lList.contains(reserve[r]-1)) {
        		if(borrow.contains(reserve[r]-1)) {
        			System.out.println("앞사람은 이미 빌림ㅋ");
        			continue;
        		}
        		borrow.add(reserve[r]-1);
        		System.out.println("앞사람을 빌려줌!");
        		continue;
        	}
        	if(rList.contains(reserve[r]+1)) {
        		if(borrow.contains(reserve[r]+1)) {
        			System.out.println("뒷사람은 이미 빌림ㅋ");
        			continue;
        		}
        		borrow.add(reserve[r]+1);
        		System.out.println("뒷사람을 빌려줌!");
        		continue;
        	}
        }
        
		System.out.println("same:"+same);
		System.out.println("borrow:"+borrow);
		
        return (n - (lost.length)) + same.size() + borrow.size();
        
    }
    
    public static void main(String[] args) {
    	int n2 = 20;
//    	int[] lost = {1, 4, 5, 7, 8, 9, 13 ,14, 15, 18, 20};
//    	int[] reserve = {1, 2, 5, 6, 7, 8, 11, 19};
    	// 5	2, 4	3	4
    	
    	// 3	3		1	2
    	
    	
    	///////////////////////////////////////////
    	System.out.println("======================");
    	int l = (int)(Math.random() * 20) + 1;
    	int r = (int)(Math.random() * 20) + 1;
    	
    	System.out.println("l:"+l+" r:"+r);
    	int[] lost = CommonUtil.makeR(l, 20);
    	int[] reserve = CommonUtil.makeR(r, 20);
    	System.out.println("======================");
    	System.out.println("행운의 번호는 아래와 같습니다:");
    	for(int i = 0; i < lost.length; i ++){
    	    if(i > 0){
    	        System.out.print(", ");
    	    }
    	    System.out.print(lost[i]);
    	}
    	
    	System.out.println("\n행운의 번호는 아래와 같습니다:");
    	for(int i = 0; i < reserve.length; i ++){
    	    if(i > 0){
    	        System.out.print(", ");
    	    }
    	    System.out.print(reserve[i]);
    	}
    	System.out.println();
    	
    	System.out.println(new Solution().solution(n2, lost, reserve));
	}
    
    
    
    
}

