package com.packtpub.microservice.service;

import java.util.Set;

import rx.Observable;

public interface MeetupService {
	
	public Observable<Boolean> create(Meetup m);
	
	public Observable<Set<String>> listByType(String typez);
	
}
