package collectionApp;

import java.util.Comparator;

public class ItemNoComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
//		if (o1.getNum()>o2.getNum()) {
//			return 1;
//		} else if(o1.getNum()<o2.getNum()){
//			return -1;
//		}else {
//			return 0;
//		}
		Integer obj01 = Integer.valueOf(o1.getNum());
		Integer obj02 = Integer.valueOf(o2.getNum());
		return -obj01.compareTo(obj02);
	}
	
}
	