package com.collections.linkedlist;

public class Book {
	private String bookName;
	private String authorName;
	private int bookNo;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getauthorName() {
		return authorName;
	}

	public void setauthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public Book(String bookName, String authorName, int bookNo) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookNo = bookNo;
	}

	public String toString() {
		return "Library [bookName=" + bookName + ", authorName=" + authorName + ", bookNo=" + bookNo + "]";
	}
}
