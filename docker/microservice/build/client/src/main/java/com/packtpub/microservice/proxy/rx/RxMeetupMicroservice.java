package com.packtpub.microservice.proxy.rx;

import java.util.Set;

import rx.Observable;

public interface RxMeetupMicroservice {
	
	public Observable<Boolean> create(String name,String typez);
	
	public Observable<Set<String>> listByType(String typez);
	
}
