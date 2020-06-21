import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestApp implements ITestMap{

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put("Name", "Navneet");
		map.put("age", "100");
		map.put("addrees", "Indore");
		map.put("Tech", "Java");
		
		String str = (String) map.get("Name");
		System.out.println("value is "+str);
		
		
	}
}


//car is a vehicle
