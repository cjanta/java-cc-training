package _300_390._350_Encapsulation.ChildPackage;

import _300_390._350_Encapsulation.ParentPackage.Parent;

public class Child extends Parent {

    public Child() {
        super();
        this.public_ = "Childs public";
        this.protected_ = "Parents protected";
//        this.packagePrivate = "Parents packagePrivate";
//        this.private_ = "Parents private";
    }
}
