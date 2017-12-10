package com.common.topics;

public final class ImmutableClass {
	
	final String name;

	public ImmutableClass(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
