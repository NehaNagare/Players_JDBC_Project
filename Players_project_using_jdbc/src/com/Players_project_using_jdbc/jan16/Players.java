package com.Players_project_using_jdbc.jan16;

public class Players {

	private int j_no;
	private String p_names;
	private int runs;
	private int wicket;
	private String t_name;
	private int age;
	public Players(int j_no, String p_names, int runs, int wicket, String t_name, int age) {
		super();
		this.j_no = j_no;
		this.p_names = p_names;
		this.runs = runs;
		this.wicket = wicket;
		this.t_name = t_name;
		this.age = age;
	}
	public int getJ_no() {
		return j_no;
	}
	@Override
	public String toString() {
		return "Players [j_no=" + j_no + ", p_names=" + p_names + ", runs=" + runs + ", wicket=" + wicket + ", t_name="
				+ t_name + ", age=" + age + "]";
	}
	public void setJ_no(int j_no) {
		this.j_no = j_no;
	}
	public String getP_names() {
		return p_names;
	}
	public void setP_names(String p_names) {
		this.p_names = p_names;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Players() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
