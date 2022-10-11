package kodlamaIOWebsite.entities;

public class Course {
	private static int objectId = 1;
	private int id;
	private String name;
	private String description;
	private Educator educator;
	private Category category;
	private double price;
	
	public Course() {
		id = objectId;
		objectId++;
	}

	public Course(String name, String description, Educator educator, Category category, double price) {
		id = objectId;
		objectId++;
		this.name = name;
		this.description = description;
		this.educator = educator;
		this.category = category;
		this.price = price;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Educator getEducator() {
		return educator;
	}

	public void setEducator(Educator educator) {
		this.educator = educator;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
