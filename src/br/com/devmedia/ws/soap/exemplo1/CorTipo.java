/**
 * CorTipo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devmedia.ws.soap.exemplo1;

public class CorTipo implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CorTipo(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PRETO = "PRETO";
    public static final java.lang.String _BRANCO = "BRANCO";
    public static final java.lang.String _VERMELHO = "VERMELHO";
    public static final java.lang.String _VERDE = "VERDE";
    public static final java.lang.String _ROXO = "ROXO";
    public static final java.lang.String _PRATA = "PRATA";
    public static final CorTipo PRETO = new CorTipo(_PRETO);
    public static final CorTipo BRANCO = new CorTipo(_BRANCO);
    public static final CorTipo VERMELHO = new CorTipo(_VERMELHO);
    public static final CorTipo VERDE = new CorTipo(_VERDE);
    public static final CorTipo ROXO = new CorTipo(_ROXO);
    public static final CorTipo PRATA = new CorTipo(_PRATA);
    public java.lang.String getValue() { return _value_;}
    public static CorTipo fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CorTipo enumeration = (CorTipo)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CorTipo fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorTipo.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://exemplo1.soap.ws.devmedia.com.br/", "corTipo"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
