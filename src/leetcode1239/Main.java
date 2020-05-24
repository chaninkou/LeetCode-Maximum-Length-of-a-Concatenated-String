package leetcode1239;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		
		input.add("un");
		input.add("iq");
		input.add("ue");
		
		System.out.println(input);
		
		FindMaximumLength solution = new FindMaximumLength();
		
		System.out.println("Solution: " + solution.maxLength(input));
		
		
	}
}
