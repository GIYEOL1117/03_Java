package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        추상화란?
        공통된 부분을 추출하고 공통되지 않고 불필요한 부분을 제거한다는 의미를 가지며, 추상화의 목적은
        유연성을 확보하기 위함이다.
        유연성 확보는 여러 곳에 적용될 수 있는 유연한 객체를 의미하며, 재사용성이 높아질 수 있게 한다는
        의미이다.
        (우리는 자연스럽게 추상화를 이루었지만 그렇게 추상화된 클래스로 유연한 객체들을 생성할 수 있다.)

        1. 협력(애플리케이션에 구현에 필요한 객체간의 상호작용)
        2. 책임(객체가 협력에 참여하기 위해 수행해야할 책임(기능))
        3. 역할(객체의 책임이 모여 하나의 역할이 된다.)*/

        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        CarRacer car = new CarRacer();
=======

>>>>>>> a05cf710a3cd630516ec01ad7f300a5cd3f67d11
        int input = 0;
        String menuText = """
                ================= 카레이싱 프로그래밍 =================
                1. 시동걸기
                2. 전진
                3. 정지
                4. 시동끄기
                9. 프로그램 종료
                메뉴 선택 :
                """;
        do{
            System.out.println(menuText);
            input = sc.nextInt();

            switch (input){
<<<<<<< HEAD
                case 1: car.startUp();
                    break;
                case 2: car.stepAccelator();
                    break;
                case 3: car.stepBreak();
                    break;
                case 4: car.turnOff();
                    break;
=======
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
>>>>>>> a05cf710a3cd630516ec01ad7f300a5cd3f67d11
                case 9:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("다시 선택하세요");
                    break;
            }

        }while(input != 9);
    }
}
