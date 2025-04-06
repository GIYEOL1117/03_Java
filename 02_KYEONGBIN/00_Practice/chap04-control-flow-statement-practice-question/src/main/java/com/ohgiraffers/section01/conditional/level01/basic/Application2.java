package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
         * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 홀수다.
         * */

        while (true) {
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();

            if (x.equals("q")) {
                System.out.println("Service is closing");
                break;
            }

            int i = Integer.parseInt(x);

            if (i % 2 == 0 && i != 0 && i > 0) {
                System.out.println("It is even");
            } else if (i % 2 != 0 && i > 0) {
                System.out.println("It is odd");
            } else {
                System.out.println("Please enter a positive integer");
            }


        }


    }
}
