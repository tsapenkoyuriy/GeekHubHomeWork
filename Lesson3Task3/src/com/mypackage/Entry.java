package com.mypackage;

import sun.security.pkcs11.P11Util;

public class Entry {
    public Entry(Object key, Object value){
        this.key = key;
        this.value = value;
    }

    private Object key;
    private Object value;

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getKey() {
        return key;
    }
}
