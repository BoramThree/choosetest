package com.boram.section01.dynamic;

import java.util.Scanner;

public class NamView {

    public static void  display() {

        Scanner sc = new Scanner(System.in);
        MenuServiceNam menuServiceNam = new MenuServiceNam();

        do {

            System.out.println("==동적 SQL==");
            System.out.println("1. if 확인");
            System.out.println("2. choose(where,set) 확인");
            int no = sc.nextInt();

            switch(no){
                case 1:
                    ifSubMenu();
                    break;

            }


        } while (true);
    }

    private static void ifSubMenu() {

        Scanner sc = new Scanner(System.in);
        MenuServiceNam menuServiceNam = new MenuServiceNam();

        do {
            System.out.println("1. 원하는 금액 대 적합한 추천메뉴 목록 보여주기 ");
            System.out.println("원하는 메뉴를 선택해주세요 :");
            int no = sc.nextInt();

            switch (no){
                case 1 :
                    menuServiceNam.selectMenuByPrice(inputPrice());

            }
        }while (true);
    }

    private static int inputPrice() {
        System.out.println("원하는 금액대를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        return price;
    }

}

