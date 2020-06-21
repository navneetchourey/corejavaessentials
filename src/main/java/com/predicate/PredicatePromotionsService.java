package com.predicate;

import java.util.function.Predicate;

public class PredicatePromotionsService {

	private CustomerPredicate customer = new CustomerPredicate();
	public void sendPromotion(Predicate<CustomerPredicate>p)
	{
		if(p.test(customer)) {
			//send promotonal mailing
		}
	}
}

