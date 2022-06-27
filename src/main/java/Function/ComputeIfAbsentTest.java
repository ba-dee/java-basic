package Function;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComputeIfAbsentTest {


	public static void main(String[] args) {
		Map<String,String> testMap = new LinkedHashMap<>();

		testMap.put("a","a");
		testMap.put("b","b");
		testMap.put("c","c");
		testMap.put("d","d");
		testMap.put("e","e");
		testMap.put("f","f");
		testMap.put("g","g");

		//如果不存在就返回，如果存在就新增一个并返回
		testMap.computeIfAbsent("&&&&&x",(beanName)->{
			do{
				beanName = beanName.substring(1);
				System.out.println(beanName + "------------------");
			}while (beanName.startsWith("&"));

			return beanName;
		});

		testMap.forEach((key,v)->{
		});

		testMap.replaceAll((k,v)->{
			v = v+":xss";
			return v;
		});
		testMap.forEach((k,v)->{
			System.out.println(k + "::" + v);
		});
		System.out.println(testMap.get("&&&&&x"));
	}
}
