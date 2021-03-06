/*
 * Copyright (c) 2018 tirco.cloud. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found named CC-1.0.txt.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.trico.salyut.token;

import com.trico.salyut.annotation.Attribute;
import com.trico.salyut.annotation.TokenMark;
import com.trico.salyut.exception.SalyutException;
import org.openqa.selenium.JavascriptExecutor;

/**
 * <b>js</b>
 *
 * <p>docs link:
 * <a>https://www.trico.cloud/tricoDoc/js/index.html</a>
 * @author shenyin
 */
@TokenMark(name = "js")
public class Js extends SToken{
	@Attribute(name = "exp" ,exprScan = true, unique = true)
	private String exp = null;

	@Override
	public void action() throws SalyutException{
		super.action();
		setResult(((JavascriptExecutor) atTab.driver).executeScript(exp));
	}
}
