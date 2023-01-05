package com.javapractice.javaclasses;

public class JavaClasses {
 int length,width,height;
 public void setLength(int l) {
 length=l;
 }
 public void setWidth(int w) {
	 width=w;
 }
 public void setHeight(int h) {
	 height=h;
	 }
 public void volume() {
 int volume=length*width*height;
 System.out.println(volume);
}
}
