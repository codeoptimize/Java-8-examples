import java.util.Arrays;
import java.util.List;

public class num_start_with_1 {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(56,35,11,561,134,15,78);
		
		list.stream().map(n->n + "").filter(n-> n.startsWith("1")).forEach(System.out::println);//
		
		
		
		
		

	}

}
