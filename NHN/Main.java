package NHN;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i = 2; i <= 6; i++)
//			list.add(i);
//		System.out.println(list);
//		
//		for(int i = 0; i < list.size(); i++)
//			System.out.print(list.get(i));
//		
//		System.out.println();
//		list.remove(0);
//		System.out.println(list.get(0));
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		System.out.println(map.get(1));
		System.out.println(map.containsKey(1));
		map.put(1, 3);
		System.out.println(map.get(1));
		
		System.out.println(map);

		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		
		list.indexOf(list);
	}
	
	private static void solutuion(int sizeOfMatirx, int[][] matrix) {
		
	}
	
	private static class InputData{
		int sizeOfMatrix;
		int[][] matrix;
	}
	
	private static void solution(int a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        
        int b = list.indexOf(0);
        list.remove(0);
        
	}
	
	private static class Operation{
	}

}
