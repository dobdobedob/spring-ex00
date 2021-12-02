package lecture.p01lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	private int id;
	private String name;
	private String city;
	private String address;
}
