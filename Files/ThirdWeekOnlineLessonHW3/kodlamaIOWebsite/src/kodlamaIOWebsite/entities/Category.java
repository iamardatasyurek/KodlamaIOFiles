package kodlamaIOWebsite.entities;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private static int objectId = 1;
	private int id;
	private String name;
	private List<Course> courses;
	
	public Category() {
		id = objectId;
		objectId++;
		this.courses = new ArrayList<Course>();
	}

	public Category(String name) {
		id = objectId;
		objectId++;
		this.name = name;
		this.courses = new ArrayList<Course>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
