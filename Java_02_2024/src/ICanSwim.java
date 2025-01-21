
//public interface ICanSwim{
//    abstract void swim(){; }
//}

interface ICanWalk{
    static void walk(){
        System.out.println("ich laufe");
    }
}

interface ICanDrucken{
    static String objektAttr = "objektAttr";
    abstract void drucken();
}
