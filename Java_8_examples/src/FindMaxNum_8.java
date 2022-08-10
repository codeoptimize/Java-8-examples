import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxNum_8 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,8,2,9,3,7,1);
		
		int max=list.stream().max(Integer::compare).get();
		System.out.println(max);
		
		//list=list.stream().sorted().collect(Collectors.toList());
		//System.out.println(list.get(list.size()-1));
		

	}
}
