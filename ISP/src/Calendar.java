import java.util.ArrayList;
import java.util.List;

public class Calendar {
	private List<Person> persons = new ArrayList<Person>();
	
	public void add(Person person) {
		this.persons.add(person);
	}
}
