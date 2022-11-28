package com.pl.sggw.tinder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc //TODO: WORKAROUND FIX ME
@SpringBootApplication
class TinderApplication

fun main(args: Array<String>) {
	runApplication<TinderApplication>(*args)
}
