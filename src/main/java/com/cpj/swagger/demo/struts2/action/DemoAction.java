/*
 *
 * Copyright (c) 2011, 2016 CPJ and/or its affiliates. All rights reserved.
 * 
 */
package com.cpj.swagger.demo.struts2.action;

import org.apache.struts2.convention.annotation.Namespace;

import com.cpj.swagger.annotation.API;
import com.cpj.swagger.annotation.APIs;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author yonghuan
 */
@APIs("/demo")
@Namespace("/demo")
public class DemoAction extends ActionSupport {
	
	@API(value="demo1", summary="示例1")
	public void demo1() throws Exception {
		
	}
	
	@API(value="demo2", summary="示例2")
	public void demo2() throws Exception {
		
	}
	
	@API(value="demo3", summary="示例3")
	public void demo3() throws Exception {
		
	}
}
