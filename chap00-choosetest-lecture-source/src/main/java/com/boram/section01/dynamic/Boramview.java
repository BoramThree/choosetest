package com.boram.section01.dynamic;

import java.util.Scanner;

public class Boramview {

    public void display() {
        Scanner sc = new Scanner(System.in);
        HjView hjView = new HjView();

        do {

            System.out.println("===================페이지 연결==================");
            System.out.println("1. 남규님 페이지");
            System.out.println("2. 예진님 페이지");
            System.out.println("3. 정현님 페이지");
            System.out.println("4. 경훈님 페이지");
            System.out.println("5. 혜진님 페이지");

            System.out.print("접속하실 페이지를 골라주세요: ");

            int num = sc.nextInt();

            switch (num){
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    break;

                case 5:
                    hjView.display();
                    break;

            }

        } while (true);


    }
}





