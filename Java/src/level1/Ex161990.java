package level1;

/**
 * lv1 - 바탕화면 정리
 * https://school.programmers.co.kr/learn/courses/30/lessons/161990
 * @author heoseo
 *
 */
public class Ex161990 {

	public static void main(String[] args) {

//		String[] wallpaper = {".#...", "..#..", "...#."};
//		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//		String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
		String[] wallpaper = {"..", "#."};
		
		
		for(int answer : solution(wallpaper)) System.out.print(answer + " ");
	}
	
	public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int sizeX = wallpaper.length;		// 0~n
        int sizeY = wallpaper[0].length();	// 0~n
        
        answer[0] = sizeX;
        answer[1] = sizeY;
        
        
        for(int i = 0; i < wallpaper.length; i++) {
        	String xy = wallpaper[i];
        	
        	if(xy.contains("#")) {
        		//xy 좌표값(아이콘 좌상단 기준)
        		int minX = i;
        		int minY = xy.indexOf('#');
        		int maxX = i;
        		int maxY = xy.lastIndexOf('#');
        		
        		System.out.println(minX + " " + minY + " " + maxX + " " + maxY);
        		
        		if(minX < answer[0]) answer[0] = minX;
        		if(minY < answer[1]) answer[1] = minY;
    			if(maxX > answer[2]) answer[2] = maxX;
    			if(maxY > answer[3]) answer[3] = maxY;
    			
        	}
        }
        
        answer[2]++;
        answer[3]++;
        System.out.println("========");
        
        return answer;
    }

}
