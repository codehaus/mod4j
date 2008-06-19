package BusinessDomainDsl.validation;

import java.util.ArrayList;
import java.util.List;

import BusinessDomainDsl.BusinessClass;

public class ValidationUtils {

	public static boolean circularInheritance(BusinessClass cls){
		if( cls.getSuperclass() == null ) { return false; }

		List<BusinessClass> tmp = new ArrayList<BusinessClass>();
		return checkInheritance(tmp, cls.getSuperclass(), cls);
	}
	
	private static boolean checkInheritance(List<BusinessClass> children, BusinessClass cls, BusinessClass original) {
		if( children.contains(original) ) {
			return true;
		} else if( children.contains(cls) ){
			return false;
		} else {
			if( cls.getSuperclass() == null ) {
				return false; 
			}
			children.add(cls);
			return checkInheritance(children, cls.getSuperclass(), original);
		}
	}
}
