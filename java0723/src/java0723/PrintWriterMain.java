package java0723;

import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) {
		//파일, 네트워크, 데이터베이스 관련 클래스들은 예외처리를 강제합니다.
		PrintWriter pw = null;
		try {
		     pw = new PrintWriter("./tx.txt"); //현재 디렉토리에 파일 생
		     pw.println("hi hi i am java");    // 파일에 문자열 기
		     pw.flush();                       // 마지막에 버퍼의 내용을 전부 출력 
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(pw != null) {
				pw.close();
			}
		}

	}

}
