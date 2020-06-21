package com.predicate;

public class TestPredicateService {
	
	public static void main(String[] args) {
		CustomerPredicate customerObject = new CustomerPredicate();
		customerObject.setAge(18);
		PredicatePromotionsService psObject= new PredicatePromotionsService();
		//we are passing complete condition Customer Object
		psObject.sendPromotion(customer->customerObject.getAge()>=18);
		
	}

}
