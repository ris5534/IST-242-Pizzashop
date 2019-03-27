package edu.psu.ist;
/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Ronald Salguero
Date Developed: 3/14/19
Last Date Changed: 3/14/19
Rev: None
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    public static void main(String[] args) {

        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char CUST_PRNT = 'P';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Order order1 = new Order(1);
        Transaction trans1 = new Transaction(1, order1, PaymentType.cash);

        Order order2 = new Order(2);
        Transaction trans2 = new Transaction(2, order2, PaymentType.check);

        Menu menu1 = new Menu(1, "Plain",10);
        Menu menu2 = new Menu(2, "Meat",11);
        Menu menu3 = new Menu(3, "Extra",12);
        Menu menu4 = new Menu(4, "Veg",13);
        Menu menu5 = new Menu(5, "Supreme",14);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);
        mList.add(menu5);

        oList.add(order1);
        tList.add(trans1);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : cList.add(main.addCustomer());
                    break;
                case CUST_PRNT : Customer.printCustomer(cList);
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case ORDE_CODE : // Order.addOrders(); Add this to Order class
                    break;
                case TRAN_CODE : Transaction.listTransactions(tList);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer(){
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }
}
