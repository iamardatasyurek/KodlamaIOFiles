package kodlamaIOWebsite.entities;

import java.util.ArrayList;
import java.util.List;

public class Educator{
	private int id;
	private String firstName;
	private String lastName;
	private List<Course> courses;
	
	public Educator() {
		this.courses = new ArrayList<Course>();
	}

	public Educator(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = new ArrayList<Course>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
