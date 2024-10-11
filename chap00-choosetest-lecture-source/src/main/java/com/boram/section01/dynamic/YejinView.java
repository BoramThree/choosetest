package com.boram.section01.dynamic;

import java.util.Scanner;

public class YejinView {
    public void display() {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("============예진 페이지============");
            System.out.println("1. if를 활용하여 판매중/판매대기 조회하기");
            System.out.println("2. choose 를 활용하여 판매중/판매대기 조회하기");

            System.out.print("원하시는 메뉴를 선택하세요: ");
            int no = sc.nextInt();

            switch (no){
                case 1:
                    applyIf();
                    break;

                case 2:
                    applyChoose();
                    break;
            }

        } while (true);




    }

    private void applyChoose() {


    }

    private void applyIf() {

        Scanner sc = new Scanner(System.in);
        MenuServiceYejin menuServiceYejin = new MenuServiceYejin();

        do {

            System.out.println("(끝내려면 exit를 입력하세요)");
            System.out.print("판매 중과 판매대기 중 마음에 드는것을 입력해주세요: ");
            String input = sc.nextLine();
            
            switch (input){
                case "exit":
                    System.out.println("이전 메뉴로 이동");
                    return;
                default:
                    menuServiceYejin.selectOrderable(input);
                    break;
            }

        } while(true);
        
        

    }
}
