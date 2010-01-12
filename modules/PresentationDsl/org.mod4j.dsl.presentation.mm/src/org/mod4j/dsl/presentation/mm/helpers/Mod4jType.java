package org.mod4j.dsl.presentation.mm.helpers;

public class Mod4jType {
    protected String baseType;
    protected String collection;
    protected String error = null;
    
    Mod4jType(){}
    
    Mod4jType(String base, String coll){
        baseType = base;
        collection = coll;
    }
    
    public boolean hasError() {
        return (error != null) && ( !error.equals(""));
    }
    
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getBaseType() {
        return baseType;
    }
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }
    public String getCollection() {
        return collection;
    }
    public void setCollection(String collection) {
        this.collection = collection;
    }
    
    public boolean matches(Mod4jType toMatchWith) {
        return baseType.equals(toMatchWith.getBaseType()) && collection.equals(toMatchWith.getCollection());
    }
    
    public String toString(){
        if( collection.equals("SINGLE")) {
            return baseType;
        } else {
            return collection.toLowerCase() + " " + baseType;
        }
    }
}
