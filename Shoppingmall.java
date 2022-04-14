package com.motivity.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
@Entity
@Table(name = "shopping")
public class Shoppingmall
{

	@Id
	private int employeeid;

	@Column(name = "branch")
	
	
	private String branch;
	@Column(name = "employees")
	private int employees;
	@Column(name = "revenue")
	private int revenue;

	public Shoppingmall() {}
	public Shoppingmall(int employeeid, String branch, int employees,int revenue) {
	this.employeeid=employeeid;
	this.branch=branch;
	this.employees=employees;
	this.revenue=revenue;
	}
	public Shoppingmall(int employeeid) {
		this.employeeid=employeeid;
	}
	
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
@Override
public String toString()
{
	return "Shoppingmall [employeeid=" + employeeid + ", branch=" + branch
			+ ", employees=" + employees + ", revenue="
			+ revenue +"]";
}
}
