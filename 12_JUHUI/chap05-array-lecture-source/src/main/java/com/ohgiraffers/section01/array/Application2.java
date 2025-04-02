package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 배열의 사용 방법
         * 1. 배열의 선언
         * 2. 배열의 크기 할당
         * 3. 배열의 인덱스 공간에 값 대입
         */
        int[] iArr;
        //char cArr[]; 둘 다 선언 가능. 대괄호가 뒤에 들어가도 되지만 권장되진 않음.

        //iArr = new int[]; // 배열은 반드시 크기를 할당해 주어야 함.
        iArr = new int[10];

        char[] cArr = new char[5];

        // 참조자료형 변수 출력 결과 = toString()의 결과 -> 자료형@16진수 주소값
         System.out.println("iArr = " + iArr.toString()); // 이런 식임.[I@36baf30c
        System.out.println("iArr = " + cArr);

        System.out.println("iArr의 10진수 주소 :" + iArr.hashCode());
        System.out.println("cArr의 10진수 주소 :" + cArr.hashCode());

        cArr = null; // 아예 지우고 싶으면 null 값으로 초기화.

    }
}
