package dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Sdao {
private int id;
private String name;
private int phno;
@Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}

}
