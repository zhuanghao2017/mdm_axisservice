/**
 * IMdSharingThirdPartServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService;

public class IMdSharingThirdPartServiceLocator extends org.apache.axis.client.Service implements com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartService {

    public IMdSharingThirdPartServiceLocator() {
    }


    public IMdSharingThirdPartServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IMdSharingThirdPartServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IMdSharingThirdPartServiceSOAP11port_http
    private java.lang.String IMdSharingThirdPartServiceSOAP11port_http_address = "http://localhost/uapws/service/com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService";

    public java.lang.String getIMdSharingThirdPartServiceSOAP11port_httpAddress() {
        return IMdSharingThirdPartServiceSOAP11port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IMdSharingThirdPartServiceSOAP11port_httpWSDDServiceName = "IMdSharingThirdPartServiceSOAP11port_http";

    public java.lang.String getIMdSharingThirdPartServiceSOAP11port_httpWSDDServiceName() {
        return IMdSharingThirdPartServiceSOAP11port_httpWSDDServiceName;
    }

    public void setIMdSharingThirdPartServiceSOAP11port_httpWSDDServiceName(java.lang.String name) {
        IMdSharingThirdPartServiceSOAP11port_httpWSDDServiceName = name;
    }

    public com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServicePortType getIMdSharingThirdPartServiceSOAP11port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
        	System.out.println("getIMdSharingThirdPartServiceSOAP11port_http方法");
            endpoint = new java.net.URL(IMdSharingThirdPartServiceSOAP11port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIMdSharingThirdPartServiceSOAP11port_http(endpoint);
    }

    public com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServicePortType getIMdSharingThirdPartServiceSOAP11port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServiceSOAP11BindingStub _stub = new com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServiceSOAP11BindingStub(portAddress, this);
            _stub.setPortName(getIMdSharingThirdPartServiceSOAP11port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIMdSharingThirdPartServiceSOAP11port_httpEndpointAddress(java.lang.String address) {
        IMdSharingThirdPartServiceSOAP11port_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServiceSOAP11BindingStub _stub = new com.yonyou.itf.mdm07.sharing.IMdSharingThirdPartService.IMdSharingThirdPartServiceSOAP11BindingStub(new java.net.URL(IMdSharingThirdPartServiceSOAP11port_http_address), this);
                _stub.setPortName(getIMdSharingThirdPartServiceSOAP11port_httpWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IMdSharingThirdPartServiceSOAP11port_http".equals(inputPortName)) {
            return getIMdSharingThirdPartServiceSOAP11port_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "IMdSharingThirdPartService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/IMdSharingThirdPartService", "IMdSharingThirdPartServiceSOAP11port_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IMdSharingThirdPartServiceSOAP11port_http".equals(portName)) {
            setIMdSharingThirdPartServiceSOAP11port_httpEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
