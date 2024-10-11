package com.boram.section01.dynamic;

import java.util.Scanner;

public class HjView {
    public static void display() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("* HYEJIN RESTORANT *");
            System.out.println("1. CATEGORY SELECT");
            System.out.println("9. EXIT");
            System.out.print("SELECT MENU : ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    ifCategory();
                    break;
                case 9:
                    System.out.println("PROGRAM EXIT");
                    return;
            }

        } while (true);
    }

    private static void ifCategory() {
        Scanner sc = new Scanner(System.in);

        HjService hjService = new HjService();

        do {
            System.out.println("1. 한식 / 양식 / 그외");
            System.out.println("9. 이전 메뉴");
            System.out.print("원하는 메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    HjService.selectCategory(inputNo());
                    break;
                case 9:
                    System.out.println("EXIT");
                    return;
            }
        } while (true);
    }

    private static int inputNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 음식의 종류 입력 : ");
        int inputNo = sc.nextInt();

        return inputNo;
    }
}
