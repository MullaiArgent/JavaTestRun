package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {

        Collection arr0 = new ArrayList();
        arr0.add(2);
        arr0.add(3);
        arr0.add(4);
        arr0.add("thundfre4");
        arr0.add(2.3);

        Iterator it = arr0.iterator();
        it.next();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
