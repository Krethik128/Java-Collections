package com.gevernova.annotations.practice;

import java.lang.reflect.Method;

public class AnnotationScanner {
    public static void main(String[] args){
        Class<FeatureSet> clazz = FeatureSet.class;
        for(Method method : clazz.getDeclaredMethods()){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important method : "+method.getName());
                System.out.println(" Level : "+ annotation.level());
            }
        }
    }
}
