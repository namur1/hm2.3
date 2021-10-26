package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.deposit(20000);
        System.out.println(user.getAmount());
        while (true) {
            try {
                user.withDraw(6000);
            } catch (LimitException a) {
                try {
                    user.withDraw((int) user.getAmount());
                }catch(LimitException i){
                    i.printStackTrace();

                }
                break;
            }
        }
    }
}
