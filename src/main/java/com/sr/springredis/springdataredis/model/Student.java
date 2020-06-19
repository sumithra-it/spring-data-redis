package com.sr.springredis.springdataredis.model;
import org.springframework.data.redis.core.RedisHash;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@RedisHash("Student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	public enum Gender{
		MALE, FEMALE
	}
	private String id;
	private String name;
	private Gender gender;
	private int grade;
}
