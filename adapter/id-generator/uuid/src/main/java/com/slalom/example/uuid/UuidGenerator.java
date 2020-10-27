package com.slalom.example.uuid;

import com.slalom.example.domain.port.IdGenerator;

import java.util.UUID;

public class UuidGenerator implements IdGenerator {

	@Override
	public String generate() {
		return UUID.randomUUID().toString();
	}
}
