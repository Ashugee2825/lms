package com.entity;
import jakarta.persistence.*;

@Entity

public class Book {
@Id
	int isbn;
String bname;
int price;
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", bname=" + bname + ", price=" + price + "]";
}


}
