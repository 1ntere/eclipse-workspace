package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music>{
//필드
	private String title;
	private String singer;
//메서드
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	//생성자 - 기본
	public Music() {
		
	}
	//생성자 - 필수
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	/*
	★ 오류 발생
	toString를 사용하지 않으면 목록이나 값이 나오지 않고 주소로 나옴
		[com.kh.practice.list.music.model.vo.Music@4cb2c100]로 출력됨
	-----
	String으로 전달해주는 값이 없기 때문
	=====
	★ 문제 해결 방안
	@Override
	public String toString() {
		return "곡명 : " + title + ", 가수명 : " + singer;
	}
		//[곡명 : ㄱㄱㄱ, 가수명 : ㅁㅁㅁ]로 출력됨
	*/
	@Override
	public String toString() {
		return "곡명 : " + title + ", 가수명 : " + singer;
	}
		//[곡명 : ㄱㄱㄱ, 가수명 : ㅁㅁㅁ]로 출력됨
	
	//sort(), compareTo() 사용하고 싶다면 비교의 기준을 만들어주자!
	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.title);
	}
}
