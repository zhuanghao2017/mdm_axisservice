/**
 * IMdSharingThirdPartServiceSOAP11BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.yonyou.itf.mdm07.sharing.MdMapingVO.CustomerVO;
import com.yonyou.itf.mdm07.sharing.MdMapingVO.MdMapingVO;
import com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO;

/**
 * webservice对外实现
 * 
 * @author konglk
 *
 */
public class MdSharingThirdPartServiceImpl
		implements com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServicePortType {
	public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO getRemoteMdCount(java.lang.String string0,
			java.lang.String string1) throws java.rmi.RemoteException {
		OuterSystemRetVO tempVO=new OuterSystemRetVO();
//		tempVO.setData("hello, konglingkai!");
		//tempVO.setSuccess(true);
		MdMapingVO mdMapingVO=new MdMapingVO();

		//mdMapingVO.setName("好方法");
		mdMapingVO.setMdmCode("123123123");

		MdMapingVO [] mdMapingArray= {mdMapingVO};
		tempVO.setMdMapings(mdMapingArray);
		tempVO.setMdmCodes(0, "1212123");
		return tempVO;
	}

	static int num = 0;

	public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO distributeMd(java.lang.String string0,
			java.lang.String string1, java.lang.String string2, java.lang.String string3)
			throws java.rmi.RemoteException {
		System.out.println("Enter ws distributeMd...");
		// System.out.println(string0);
		// System.out.println(string1);
		// System.out.println(string2);
		System.out.println(string3);
		Gson gson = new Gson();
		// Class<List<Map<String,Object>>> clazz = List<Map<String,Object>>.class;
		List md = gson.fromJson(string3, List.class);
		num += md.size();
		System.out.println("total numbers " + num);
		OuterSystemRetVO vo = null;
		try {
			vo = new OuterSystemRetVO();
			vo.setData("hello, konglingkai!");
			vo.setSuccess(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("出错了！！！");
		}
		return vo;
	}

	public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO loadMd(java.lang.String string0,
			java.lang.String string1) throws java.rmi.RemoteException {
		return null;
	}

	public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO loadMdBatch(java.lang.String string0,
			java.lang.String string1, java.lang.Integer int2, java.lang.Integer int3) throws java.rmi.RemoteException {
		return null;
	}

}
