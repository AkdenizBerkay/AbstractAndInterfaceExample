package Game.entities;

public class Player {
	private int id;
	private String firsName;
	private String lastName;
	private int yearOfBirth;
	private long nationalityId;
	public Player(int id, String firsName, String lastName, int yearOfBirth, long nationalityId) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
}
