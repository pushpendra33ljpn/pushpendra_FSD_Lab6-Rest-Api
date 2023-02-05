package com.pushpendra.debateRegistration.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("nilesh"));
		System.out.println(encoder.encode("admin"));
	}
}

//$2a$10$laDRTczJmm58W.z0SJa99u.w986ebkWgvH0a3bpZGt/fexWnswVJu
//$2a$10$YL8X7gFhhK2zoIEcXh83Dugi/lIl60iJe8RPMrw9xonYyv8OOnQw6