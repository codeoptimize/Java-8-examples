import java.util.Arrays;
import java.util.List;

public class count_numbers {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(56,35,11,561,134,15,78);
		
		long count=list.stream().count();
		
		System.out.print(count);
		
		
		
		
		
		
		

	}

}
