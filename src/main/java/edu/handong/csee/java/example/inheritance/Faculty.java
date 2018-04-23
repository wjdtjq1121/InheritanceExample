package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person {

	
	private int facultyNumber;
	
	public int getFacultyNumber() {
		return facultyNumber;
	}
	
	public void setFacultyNumber(int facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public Faculty() {
		super();
		facultyNumber = 0;		
	}

	public Faculty(String initialName, int initialFacultyNumber) {
		super(initialName);
		facultyNumber = initialFacultyNumber;
	}
	
	public void reset(String newName, int newFacultyNumber) {
		setName(newName);
		facultyNumber = newFacultyNumber;
		
	}

	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Faculty Number: " + facultyNumber); 
	}
	
	
	public boolean equals(Faculty otherFaculty) {
		return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);
	}
	
	
}
