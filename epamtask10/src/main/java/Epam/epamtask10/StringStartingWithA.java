package Epam.epamtask10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class StringStartingWithA {
	public static List<Object> sample(List<Object> funcStr){
		List<Object> resultStr = funcStr.stream()
				
				.collect(Collectors.toList());
		return resultStr;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Object> arr = new ArrayList<Object>(n);
		for(int i = 0; i < n; i++) {
			String z = sc.next();
			arr.add(z);
        }
        List<Object> finalstr = new ArrayList<Object>();
       	finalstr = sample(arr); 
       	for(Object i : finalstr)  
       		System.out.println(i);  
       	sc.close();
	}
}