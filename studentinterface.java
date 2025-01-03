package com.vcube.DAO;

import com.vcube.model.loginmodel;
import com.vcube.model.studentmodel;

public interface studentinterface {
	public String insertstudentdata(studentmodel s);
	public String selectstudentdata(loginmodel l);
	public String updatestudentdata(studentmodel s);

}
