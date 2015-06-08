package com.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:demo-common.xml","classpath:demo-servlet.xml"})
public class TestUserController {
	
	@Resource
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void testLogin() throws Exception{
		this.mockMvc.perform(get("/login").param("username", "luolei").param("password", "666")).andExpect(status().isOk());
	}
	
	@Test
	public void testHello() throws Exception{
		this.mockMvc.perform(get("/hello").param("hello", "hello")).andExpect(status().isOk());
	}

}
