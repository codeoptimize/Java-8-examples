import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class duplicate_element_display {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,45,1,3);
		
		HashSet<Integer> set = new HashSet<>(); 
		
		list.stream().filter(n->!set.add(n)).forEach(System.out::println);

	}

}
