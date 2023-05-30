public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.findCost("Theater 1","Movie 1","Section 1","T1","Guest"));
        System.out.println(manager.findCost("Theater 2","Movie 2","Section 2","T1","Guest"));
        System.out.println(manager.findCost("Theater 1","Movie 1","Section 1","T2","Guest"));
        System.out.println(manager.findCost("Theater 1","Movie 1","Section 1","T5","Guest"));
        System.out.println(manager.findCost("Theater 2","Movie 2","Section 2","T2","Guest"));
    }
}