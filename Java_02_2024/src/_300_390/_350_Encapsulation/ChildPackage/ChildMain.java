package _300_390._350_Encapsulation.ChildPackage;

import _300_390._350_Encapsulation.ParentPackage.Parent;

public class ChildMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.public_);
//        System.out.println(parent.protected_);
//        System.out.println(parent.packagePrivate);
//        System.out.println(parent.private_);

        System.out.println(child.public_);
//        System.out.println(child.protected_);
//        System.out.println(child.packagePrivate);
//        System.out.println(child.private_);
    }
}
