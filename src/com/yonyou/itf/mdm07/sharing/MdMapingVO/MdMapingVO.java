/**
 * MdMapingVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yonyou.itf.mdm07.sharing.MdMapingVO;

public class MdMapingVO  implements java.io.Serializable {
//    private java.lang.String name;
//
//    private java.lang.String entityCode;

    private java.lang.String mdmCode;

    public MdMapingVO() {
    }

    public MdMapingVO(
/*           java.lang.String name,
           java.lang.String entityCode,*/
           java.lang.String mdmCode) {
//           this.name = name;
//           this.entityCode = entityCode;
           this.mdmCode = mdmCode;
    }


    /**
     * Gets the name value for this MdMapingVO.
     * 
     * @return name
     */
//    public java.lang.String getName() {
//        return name;
//    }
//
//
//    /**
//     * Sets the name value for this MdMapingVO.
//     * 
//     * @param name
//     */
//    public void setName(java.lang.String name) {
//        this.name = name;
//    }
//
//
//    /**
//     * Gets the entityCode value for this MdMapingVO.
//     * 
//     * @return entityCode
//     */
//    public java.lang.String getEntityCode() {
//        return entityCode;
//    }
//
//
//    /**
//     * Sets the entityCode value for this MdMapingVO.
//     * 
//     * @param entityCode
//     */
//    public void setEntityCode(java.lang.String entityCode) {
//        this.entityCode = entityCode;
//    }


    /**
     * Gets the mdmCode value for this MdMapingVO.
     * 
     * @return mdmCode
     */
    public java.lang.String getMdmCode() {
        return mdmCode;
    }


    /**
     * Sets the mdmCode value for this MdMapingVO.
     * 
     * @param mdmCode
     */
    public void setMdmCode(java.lang.String mdmCode) {
        this.mdmCode = mdmCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MdMapingVO)) return false;
        MdMapingVO other = (MdMapingVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
//            ((this.name==null && other.getName()==null) || 
//             (this.name!=null &&
//              this.name.equals(other.getName()))) &&
//            ((this.entityCode==null && other.getEntityCode()==null) || 
//             (this.entityCode!=null &&
//              this.entityCode.equals(other.getEntityCode()))) &&
            ((this.mdmCode==null && other.getMdmCode()==null) || 
             (this.mdmCode!=null &&
              this.mdmCode.equals(other.getMdmCode())));
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
//        if (getName() != null) {
//            _hashCode += getName().hashCode();
//        }
//        if (getEntityCode() != null) {
//            _hashCode += getEntityCode().hashCode();
//        }
        if (getMdmCode() != null) {
            _hashCode += getMdmCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MdMapingVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/MdMapingVO", "MdMapingVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/MdMapingVO", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/MdMapingVO", "entityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mdmCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sharing.mdm07.itf.yonyou.com/MdMapingVO", "mdmCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
