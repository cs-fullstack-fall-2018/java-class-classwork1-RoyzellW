public class SideMain {

    public static void main(String[] args) {

//        Point xy = new Point();
//        xy.printPoint();
//
//        Bicycle Bicycle1 = new Bicycle(9,3,4);
//        System.out.print(Bicycle1);
//
        Account mattAccount =  new Account("Matt", 1000);
        Account myAccount =  new Account("My", 0);
         mattAccount.withdrawal(100);
        myAccount.deposit(100);
         System.out.println(mattAccount.balance());
        System.out.println(myAccount.balance());
    }

}
