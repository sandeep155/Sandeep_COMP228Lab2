package exercise3;

import javax.swing.*;

public class TestStatic {
    public static void foo() {
        JOptionPane.showMessageDialog(null, "Static method with no parameter" );
    }
    public static void foo(int a) {
        JOptionPane.showMessageDialog(null, "Static method with one parameter.Parameter is:"+a );
    }
    public static void foo(int a,int b) {
        JOptionPane.showMessageDialog(null, "Static method with two parameters.Parameter are: "+a+" and " +b );
    }
    public static void main(String args[])
    {
        TestStatic.foo();
        TestStatic.foo(10);
        TestStatic.foo(10,20);
    }
}

