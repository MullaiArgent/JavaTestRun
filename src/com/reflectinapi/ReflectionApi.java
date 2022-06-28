package com.reflectinapi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TestReflectionAPI{
    {
        System.out.println("Instance Block");
    }
    static {
        System.out.println("Static Block");
    }
    private void show(){
        System.out.println("Important Info");
    }
}

public class ReflectionApi {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException,  InstantiationException,  NoSuchMethodException,
            InvocationTargetException {
// Step. 1 : Load
        Class var = Class.forName("com.reflectinapi.TestReflectionAPI");
// Step. 2 : Instance of the Load Class
        TestReflectionAPI testReflectionAPI = (TestReflectionAPI) var.newInstance();
// Step. 3 : getDeclaredMethod
        Method method = var.getDeclaredMethod("show", null);
// Step. 4 : Modify
        method.setAccessible(true);
// Step. 5 : Invoke
        method.invoke(testReflectionAPI, null); // Private method is Accessed

    }
}
