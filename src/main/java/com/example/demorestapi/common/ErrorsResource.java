package com.example.demorestapi.common;

import com.example.demorestapi.index.IndexController;
import org.springframework.hateoas.EntityModel;
import org.springframework.validation.Errors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class ErrorsResource extends EntityModel<Errors> {

	private final Errors errors;

	public ErrorsResource(Errors errors) {
		this.errors = errors;
	}

	public static EntityModel<Errors> modelOf(Errors errors) {
		EntityModel<Errors> errorsModel = EntityModel.of(errors);
		errorsModel.add(linkTo(methodOn(IndexController.class).index()).withRel("index"));
		return errorsModel;
	}

}
