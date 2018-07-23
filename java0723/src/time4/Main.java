package time4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ObjectOutputStream o = null;//객체 단위로 데이터를 기록할 수 있는 클래스의 변수 선
		ObjectInputStream k = null;
		try {
			// o = new ObjectOutputStream(new FileOutputStream("./4timeread.txt")); // 파일에
			// 객체 단위로 기록할 수 있는 클래스의 객체 만들기
			k = new ObjectInputStream(new FileInputStream("./4timeread.txt")); // 파일에 객체 단위로 기록할 수 있는 클래스의 객체 만들기
			MemberHealth m = new MemberHealth();
			// m.setEmail("tadlennon@gmail.com");
			// m.setPhone("01043301610");
			// m.setPw("비밀번호");
			// o.writeObject(m);//객체를 파일에 기록한다.
			MemberHealth mb = (MemberHealth) k.readObject();// read로 읽어 올 때는 Object타입으로 리턴하기 때문에 강제 형 변환을 해서 원래의 자료형으로
														   // 되돌려서 사용해야 합니다.

			System.out.println(mb);

		} catch (Exception e) {

		} finally {

			try {
				k.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
