package test1;

import testpackage.Foundation;

public class AccessTest {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // Private - Not Accessible
        // System.out.println(obj.var2); // Default - Not Accessible

        // System.out.println(obj.var3); // Protected - Not Accessible
        System.out.println(obj.var4);   // Public - Accessible
    }
}