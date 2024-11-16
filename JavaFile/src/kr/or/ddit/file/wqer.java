package kr.or.ddit.file;

public class wqer {
	public static void main(String[] args) {
		
		String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
	       
	       // 기본 for문
	       for(int i = 0; i < names.length; i++) {
	           String name = names[i];
	           System.out.println(name);
	       }
	       
	       System.out.println("------------------");
	       
	       // 향상된 for문
	       for(String name : names) {
	           System.out.println(name);
	       }
	   }
	
	
    public int[] solution(String[] strlist) {
        String [] answer = {};
        String a = "aa";
        
        for (int i = 0; i < strlist.length; i++) {
			answer=strlist[i].split("");
				a= answer.toString();
				int cnt = 0;
				for (int j = 0; j < answer.length; j++) {
					char c=a.charAt(j);
					cnt++;
				}
				
		}
        return answer;
    }
}
	


