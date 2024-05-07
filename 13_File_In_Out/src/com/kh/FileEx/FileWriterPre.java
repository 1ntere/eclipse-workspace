package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre {
	public static void main(String[] args) {
		//Hello World.txt 파일에 나는 자바가 너무 재밌다 라는 내용을 작성하고
		//파일을 저장하기
		//헬로우월드에 자바는 정말정말 재밌다. 라는 말을 이어쓰기
		String 헬로우월드 = "Hello World.txt";
		try {
			FileWriter 글쓰기 = new FileWriter(헬로우월드, true);
				//최초 코드 실행 이후 ,true를 추가해주고 "내용"을 바꾼 다음
				//다시 실행해주면 해당 파일에 바로 이어서 작성해줌
				//계속 실행하면 실행한 만큼 작성해줌
			String 내용 = "\n나는 자바가 너무 재밌다.";
			글쓰기.write(내용);
			글쓰기.close();
			System.out.println("글쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
