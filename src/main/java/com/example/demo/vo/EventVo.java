package com.example.demo.vo;

public class EventVo {
	private int no;
	private String event;
	private String day;
	
	public EventVo(int no, String event, String day) {
		super();
		this.no = no;
		this.event = event;
		this.day = day;
	}

	public EventVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}	
}
