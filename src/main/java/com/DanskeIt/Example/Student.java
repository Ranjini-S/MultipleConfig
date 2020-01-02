package com.DanskeIt.Example;

public class Student {
public String name;
public String Id;
public Hostel hostel;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public Hostel getHostel() {
	return hostel;
}
public void setHostel(Hostel hostel) {
	this.hostel = hostel;
}
@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + Id + ", hostel=" + hostel + "]";
}


}
