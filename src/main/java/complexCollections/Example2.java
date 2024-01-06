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
		ramsPhoneNumbers.add(12121212l);
		ramsPhoneNumbers.add(23232323l);
		ramsPhoneNumbers.add(45454545l);
		
		contactDetails.put("Ram", ramsPhoneNumbers);
		contactDetails.put("Sham", shamsPhoneNumbers);
		
		Long mobileNum = 111122224444l;
		System.out.println(searchContactNameByMobile(mobileNum));
	}

	public static String searchContactNameByMobile(Long mobileNum) {
		
		return null;
	}

}
