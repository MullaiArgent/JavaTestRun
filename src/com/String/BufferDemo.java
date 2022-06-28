package com.String;

public class BufferDemo {
    public static void main(String[] args) {
        // string is immutable(heap memory)
        String a = "argent";
        String b = "23434";
        String c = "argent"; // same as 'a'(var) in gheap memory


        a += "Silver"; // not now

        System.out.println(a);

        StringBuffer stringBuffer = new StringBuffer("Army");
        stringBuffer.append("Of");
        stringBuffer.append("The");
        stringBuffer.append("Dead");
        stringBuffer.delete(6, 9);
        stringBuffer.insert(6,"The");
        boolean test = "Army".equals("Army");
    }
}
