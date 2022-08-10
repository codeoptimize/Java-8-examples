import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class decending_order {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(56,35,11,561,134,15,78);
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
		
	}

}
