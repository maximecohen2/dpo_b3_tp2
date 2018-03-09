import java.util.Date;

public class User {
	private Date BirthDate;
	private String FirstName;
	private String LastName;
	private int Userid;
	
	public User(Date birthDate, String firstName, String lastName, int userid) {
		super();
		BirthDate = birthDate;
		FirstName = firstName;
		LastName = lastName;
		Userid = userid;
	}

}
