package com.entity;
import jakarta.persistence.*;

@Entity
public class Staff {
@Id
int sid;
String sname;
String address;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Staff [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
}


}
