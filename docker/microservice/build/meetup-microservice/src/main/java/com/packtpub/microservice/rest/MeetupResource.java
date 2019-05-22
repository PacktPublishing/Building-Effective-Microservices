package com.packtpub.microservice.rest;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.packtpub.microservice.service.Meetup;
import com.packtpub.microservice.service.MeetupService;

import rx.Observable;
import scmspain.karyon.restrouter.annotation.QueryParam;

@Singleton
@Path("/meetup")
public class MeetupResource {
	
	private MeetupService service;
	
	@Inject
	public MeetupResource(MeetupService service) {
		this.service = service;
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public Observable<Boolean> create(@QueryParam("name") String name,@QueryParam("type") String typez) {
		Meetup m = new Meetup(name,typez);
		return service.create(m);
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Observable<Set<String>> listByType(String typez) {
		return service.listByType(typez);
	}
	
}
