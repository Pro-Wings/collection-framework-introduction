package complexCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;

public class Example2 {
	
	public static void main(String[] args) {
		
		Map<String, HashSet<Long>> contactDetails = new HashMap<>();
		
		HashSet<Long> ramsPhoneNumbers = new HashSet<>();
		ramsPhoneNumbers.add(111122224444l);
		ramsPhoneNumbers.add(555566668888l);
		ramsPhoneNumbers.add(999977773333l);

		HashSet<Long> shamsPhoneNumbers = new HashSet<>();
		shamsPhoneNumbers.add(12121212l);
		shamsPhoneNumbers.add(23232323l);
		shamsPhoneNumbers.add(45454545l);
		
		contactDetails.put("Ram", ramsPhoneNumbers);
		contactDetails.put("Sham", shamsPhoneNumbers);
		
		Long mobileNum = 23232323l;
		System.out.println(searchContactNameByMobile(mobileNum, contactDetails));
	}

	public static String searchContactNameByMobile(Long mobileNum, Map<String, HashSet<Long>> contactDetails) {
		
		String name = "";
		for(Map.Entry<String, HashSet<Long>> entry : contactDetails.entrySet())
		{
			String key =  entry.getKey();
			HashSet<Long> value = entry.getValue();
			
			if(value.contains(mobileNum))
				name = key;
			
		}
		return name;
	}

}
