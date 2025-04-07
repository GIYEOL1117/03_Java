package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {

        /*
         * java.io 패키지의 입출력 스트림은 기본스트림과 필터스트림으로 분류할 수 있다.
         * 기본 스트림은 외부 데이터에 직접 연결되는 스트림이고
         * 필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는
         * 스트림이다. 주로 성능을 향상시키는 목적으로 사용되며 생성자를 보면 구분이 가능하다.
         * 생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼 수 있다.
         * */
        BufferedWriter bw = null; // 버퍼 공간에 다 만들어놓고 코드 실행하면 한 번에 입력하는거

        try {
            bw = new BufferedWriter(new FileWriter
                    ("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            bw.write("안녕하세요.\n");
            bw.write("반갑습니다.\n");

            //bw.flush();//버퍼공간 내용이 반영되기 위해 강제적으로 flush()를 사용해줌.그러면 내용이 보임.

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close(); //버퍼의 내용을 비우고 하니까 flush를 주석처리해도 내용이 보여짐.
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("=============================================================================");

        BufferedReader br = null;//개행문자를 만나는 한 행마다 끊어서 읽음

        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            String temp;

            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
