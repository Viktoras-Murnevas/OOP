package com.company;

public class AccountApplication {
    public static void main(String[] args) {

        Account acc1 = new Account("123", "a", 100);
        Account acc2 = new Account("234", "b", 50);

//        System.out.println(acc1);                          // Jei nera override to string printina linka i memory
//        System.out.println(acc1.getBalance());
//        System.out.println(acc2);                          // Jei nera override to string printina linka i memory
//        System.out.println(acc2.getBalance());
//        System.out.println(acc1.credit(20));               // credit prideda pinigus ir duoda updated balance
//        System.out.println(acc1.credit(10));
        acc1.credit(20);
        acc1.credit(10);
        System.out.println(acc1.getBalance());

        acc2.credit(10);
        System.out.println(acc2.getBalance());

//        System.out.println(acc1.debit(500));               // debit paiima pinigus and returns balance
        acc1.debit(500);

        acc2.transferTo(acc1, 70);

        acc1.debit(30);
        System.out.println(acc1.getBalance());

        acc1.transferTo(acc2, 10);
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

    }
}
