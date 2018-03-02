/**
 * IMdSharingThirdPartServiceSOAP11BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService;

public class IMdSharingThirdPartServiceSOAP11BindingSkeleton implements com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServicePortType, org.apache.axis.wsdl.Skeleton {
    private com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServicePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getRemoteMdCount", _params, new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "OuterSystemRetVO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "getRemoteMdCount"));
        _oper.setSoapAction("urn:getRemoteMdCount");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getRemoteMdCount") == null) {
            _myOperations.put("getRemoteMdCount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getRemoteMdCount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("distributeMd", _params, new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "OuterSystemRetVO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "distributeMd"));
        _oper.setSoapAction("urn:distributeMd");
        _myOperationsList.add(_oper);
        if (_myOperations.get("distributeMd") == null) {
            _myOperations.put("distributeMd", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("distributeMd")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("loadMd", _params, new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "OuterSystemRetVO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "loadMd"));
        _oper.setSoapAction("urn:loadMd");
        _myOperationsList.add(_oper);
        if (_myOperations.get("loadMd") == null) {
            _myOperations.put("loadMd", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("loadMd")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "string1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "int2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "int3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("loadMdBatch", _params, new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "OuterSystemRetVO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "loadMdBatch"));
        _oper.setSoapAction("urn:loadMdBatch");
        _myOperationsList.add(_oper);
        if (_myOperations.get("loadMdBatch") == null) {
            _myOperations.put("loadMdBatch", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("loadMdBatch")).add(_oper);
    }

    public IMdSharingThirdPartServiceSOAP11BindingSkeleton() {
    	//webservice实现类
        this.impl = new com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.MdSharingThirdPartServiceImpl();
    }

    public IMdSharingThirdPartServiceSOAP11BindingSkeleton(com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServicePortType impl) {
        this.impl = impl;
    }
    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO getRemoteMdCount(java.lang.String string0, java.lang.String string1) throws java.rmi.RemoteException
    {
        com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO ret = impl.getRemoteMdCount(string0, string1);
        return ret;
    }

    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO distributeMd(java.lang.String string0, java.lang.String string1, java.lang.String string2, java.lang.String string3) throws java.rmi.RemoteException
    {
        com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO ret = impl.distributeMd(string0, string1, string2, string3);
        return ret;
    }

    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO loadMd(java.lang.String string0, java.lang.String string1) throws java.rmi.RemoteException
    {
        com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO ret = impl.loadMd(string0, string1);
        return ret;
    }

    public com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO loadMdBatch(java.lang.String string0, java.lang.String string1, java.lang.Integer int2, java.lang.Integer int3) throws java.rmi.RemoteException
    {
        com.yonyou.itf.mdm07.sharing.OuterSystemRetVO.OuterSystemRetVO ret = impl.loadMdBatch(string0, string1, int2, int3);
        return ret;
    }

}
