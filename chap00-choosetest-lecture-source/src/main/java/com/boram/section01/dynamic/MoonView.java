package com.boram.section01.dynamic;

import com.boram.common.SearchCriteriaMoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MoonView {

    public static void display() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("========= 정현 SQL 학습 메뉴=========");
            System.out.println("1.if 확인하기");
            System.out.println("2.choose(when, otherwise) 확인하기");
            System.out.print("선택하실 메뉴 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    chooseMenu();
                    break;
            }

        } while (true);
    }

    private static void chooseMenu() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.원하는 식재료가 들어간 음식 찾기");
            System.out.println("9. 이전 메뉴로 돌아가기");
            System.out.print("선택하실 메뉴 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    MenuServiceMoon.searchMenuBySupCategory(inputSupCategory());
                    break;
            }

        } while (true);
    }

    private static SearchCriteriaMoon inputSupCategory() {

        Scanner sc = new Scanner(System.in);
        SearchCriteriaMoon criteria = new SearchCriteriaMoon();

        System.out.println("원하는 식재료 이름을 콤마(,)로 구분해서 입력하세요:");
        System.out.print("입력: ");
        String input = sc.nextLine();

        // 입력된 문자열을 콤마로 나누어 리스트에 추가
        List<String> nameList = Arrays.asList(input.split("\\s*,\\s*"));  // 공백 제거하고 ','로 구분
        criteria.setNameList(nameList);

        return criteria;
    }
}
