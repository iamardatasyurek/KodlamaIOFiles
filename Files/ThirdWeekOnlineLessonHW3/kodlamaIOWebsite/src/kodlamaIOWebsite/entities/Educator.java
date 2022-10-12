package kodlamaIOWebsite.entities;

import java.util.ArrayList;
import java.util.List;

public class Educator implements Entity{
	private static int classId = 1;
	private int id;
	private String firstName;
	private String lastName;
	private List<Course> courses;
	
	public Educator() {
		id = classId;
		classId++;
		this.courses = new ArrayList<Course>();
	}

	public Educator(String firstName, String lastName) {
		id = classId;
		classId++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = new ArrayList<Course>();
	}

	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}
}
