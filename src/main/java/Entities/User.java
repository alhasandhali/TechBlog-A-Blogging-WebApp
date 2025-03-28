package Entities;

import java.sql.Timestamp;

public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String dob;
	private Timestamp dateTime;
	private String profile;

	public User() {
		super();
	}

	public User(int id, String name, String email, String password, String gender, String dob, Timestamp dateTime) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.dateTime = dateTime;
	}

	public User(String name, String email, String password, String gender, String dob) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
	}

	public User(int id, String name, String email, String password, String gender, String dob, Timestamp dateTime,
			String profile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.dateTime = dateTime;
		this.profile = profile;
	}

	public User(String name, String email, String gender, String dob, Timestamp dateTime, String profile) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.dateTime = dateTime;
		this.profile = profile;
	}

	public User(String name, String email, String password, String gender, String dob, String profile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.profile = profile;
	}
	
	public User(int id, String name, String email, String gender, String dob, Timestamp dateTime, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.dateTime = dateTime;
		this.profile = profile;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

}
