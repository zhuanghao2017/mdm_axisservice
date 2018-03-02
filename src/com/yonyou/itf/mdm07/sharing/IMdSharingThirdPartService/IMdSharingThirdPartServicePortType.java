/**
 * IMdSharingThirdPartServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService;

public interface IMdSharingThirdPartServicePortType extends java.rmi.Remote {
    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO getRemoteMdCount(java.lang.String string0, java.lang.String string1) throws java.rmi.RemoteException;
    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO distributeMd(java.lang.String string0, java.lang.String string1, java.lang.String string2, java.lang.String string3) throws java.rmi.RemoteException;
    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO loadMd(java.lang.String string0, java.lang.String string1) throws java.rmi.RemoteException;
    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO loadMdBatch(java.lang.String string0, java.lang.String string1, java.lang.Integer int2, java.lang.Integer int3) throws java.rmi.RemoteException;
}
