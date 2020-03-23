package com.example.demo.vo;

public class CartVo {

	private int no;
	private String id;
	private int gno;
	private int qty;
	
	public CartVo(int no, String id, int gno, int qty) {
		super();
		this.no = no;
		this.id = id;
		this.gno = gno;
		this.qty = qty;
	}

	public CartVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}	
}
