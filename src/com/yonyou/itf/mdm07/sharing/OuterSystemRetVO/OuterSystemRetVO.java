/**
 * OuterSystemRetVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yonyou.itf.mdm07.sharing.OuterSystemRetVO;

public class OuterSystemRetVO  implements java.io.Serializable {
    private java.lang.String[] mdmCodes;

    private java.lang.String data;

    private java.lang.String errorMsg;

    private com.yonyou.itf.mdm07.sharing.MdMapingVO.MdMapingVO[] mdMapings;

    private java.lang.String dataState;

    private java.lang.Boolean success;

    public OuterSystemRetVO() {
    }

    public OuterSystemRetVO(
           java.lang.String[] mdmCodes,
           java.lang.String data,
           java.lang.String errorMsg,
           com.yonyou.itf.mdm07.sharing.MdMapingVO.MdMapingVO[] mdMapings,
           java.lang.String dataState,
           java.lang.Boolean success) {
           this.mdmCodes = mdmCodes;
           this.data = data;
           this.errorMsg = errorMsg;
           this.mdMapings = mdMapings;
           this.dataState = dataState;
           this.success = success;
    }


    /**
     * Gets the mdmCodes value for this OuterSystemRetVO.
     * 
     * @return mdmCodes
     */
    public java.lang.String[] getMdmCodes() {
        return mdmCodes;
    }


    /**
     * Sets the mdmCodes value for this OuterSystemRetVO.
     * 
     * @param mdmCodes
     */
    public void setMdmCodes(java.lang.String[] mdmCodes) {
        this.mdmCodes = mdmCodes;
    }

    public java.lang.String getMdmCodes(int i) {
        return this.mdmCodes[i];
    }

    public void setMdmCodes(int i, java.lang.String _value) {
        this.mdmCodes[i] = _value;
    }


    /**
     * Gets the data value for this OuterSystemRetVO.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this OuterSystemRetVO.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the errorMsg value for this OuterSystemRetVO.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this OuterSystemRetVO.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * Gets the mdMapings value for this OuterSystemRetVO.
     * 
     * @return mdMapings
     */
    public com.yonyou.itf.mdm07.sharing.MdMapingVO.MdMapingVO[] getMdMapings() {
        return mdMapings;
    }


    /**
     * Sets the mdMapings value for this OuterSystemRetVO.
     * 
     * @param mdMapings
     */
    public void setMdMapings(com.yonyou.itf.mdm07.sharing.MdMapingVO.MdMapingVO[] mdMapings) {
        this.mdMapings = mdMapings;
    }

    public com.yonyou.itf.mdm07.sharing.MdMapingVO.MdMapingVO getMdMapings(int i) {
        return this.mdMapings[i];
    }

    public void setMdMapings(int i, com.yonyou.itf.mdm07.sharing.MdMapingVO.MdMapingVO _value) {
        this.mdMapings[i] = _value;
    }


    /**
     * Gets the dataState value for this OuterSystemRetVO.
     * 
     * @return dataState
     */
    public java.lang.String getDataState() {
        return dataState;
    }


    /**
     * Sets the dataState value for this OuterSystemRetVO.
     * 
     * @param dataState
     */
    public void setDataState(java.lang.String dataState) {
        this.dataState = dataState;
    }


    /**
     * Gets the success value for this OuterSystemRetVO.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this OuterSystemRetVO.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OuterSystemRetVO)) return false;
        OuterSystemRetVO other = (OuterSystemRetVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mdmCodes==null && other.getMdmCodes()==null) || 
             (this.mdmCodes!=null &&
              java.util.Arrays.equals(this.mdmCodes, other.getMdmCodes()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg()))) &&
            ((this.mdMapings==null && other.getMdMapings()==null) || 
             (this.mdMapings!=null &&
              java.util.Arrays.equals(this.mdMapings, other.getMdMapings()))) &&
            ((this.dataState==null && other.getDataState()==null) || 
             (this.dataState!=null &&
              this.dataState.equals(other.getDataState()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMdmCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMdmCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMdmCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        if (getMdMapings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMdMapings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMdMapings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataState() != null) {
            _hashCode += getDataState().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OuterSystemRetVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "OuterSystemRetVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdmCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "mdmCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdMapings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "mdMapings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/MdMapingVO", "MdMapingVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "dataState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/OuterSystemRetVO", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
