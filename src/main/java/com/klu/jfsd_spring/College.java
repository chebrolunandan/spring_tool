package com.klu.jfsd_spring;

public class College 
{
	College()
	{
		
	}
	String cname;
	Student stud;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}	
	public String toString()
	{
		return (stud+" "+ cname);
	}
}
