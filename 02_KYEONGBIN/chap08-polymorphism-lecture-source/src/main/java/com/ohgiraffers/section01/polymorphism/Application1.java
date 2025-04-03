package com.ohgiraffers.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        /*
        다형성
        하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
         */

        System.out.println("\nAnimal 생성 ==========");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("\nRabbit 생성 ==========");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("\nTiger 생성 ==========");
        Tiger tiger = new Tiger(); // Tiger (자료형), tiger 타입 && animal 타입 && Oobject type
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        /*

        Rabbit과 Tiger은 Animal 클래스를 상속받음
        Rabbit은 Rabbit 타입이기도 하면서 Animal 타입이기도 함 -> 이게 무슨말임?
        Tiger은 Tiger 타입이기도 하면서 Animal 타입이기도 함...

         */



//        Rabbit rabbit1 = new Animal();

        System.out.println("\n동적바인딩 확인 ==========");

        // 부모 타입으로 자식 인스턴스 주소값 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        animal1.cry();
//        animal1.jump(); // 부모꺼를 바라보고 있기 때문에 Rabbit에만 있는 jump는 기본적으로 가져올 수 없음


        /*
        객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환 하여 Rabbit과 Tiger로 형변환 해야 그들만의 값을 가져올 수 있음

        - Class type casting: 클래스 형변환
        --> 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCAstException이 발생할 수 있다
         */
        System.out.println("\n클래스타입 형변환 확인 ==========");
        ((Rabbit)animal1).jump(); // (int) 형변환 하듯이 (Rabbit)으로 형변환 해주면 그제서야 jump가 보임
        ((Tiger)animal2).bite();

//        ((Tiger)animal1).bite(); // Runtime 시에만 오류가 남
        /*
        instanceof 연산자 사용
        레퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
         */
        System.out.println("\ninstanceof 확인 ==========");
        System.out.println("animal1이 Tiger 타입인지 확인하기: " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 타입인지 확인하기: " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal 타입인지 확인하기: " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object 타입인지 확인하기: " + (animal1 instanceof Object));
        ((Animal)animal1).cry();

        if(animal1 instanceof Rabbit) {
            ((Rabbit)animal1).jump();
        }

        if(animal1 instanceof Tiger) {
            ((Tiger)animal1).bite();
        }

        /*
        클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        up-casting: 상위 타입으로 형변환
        down-casting: 하위 타입으로 형변환
        또한 작성 여부에 따라 명시적과 묵시적 두가지로 구분된다.
         */

        Animal animal3 = (Animal) new Rabbit(); // 업캐스팅 // (명시적 형변환)
        Animal animal4 = new Rabbit(); //업캐스팅 (묵시적 형변환) -> 부모 것만 볼 수 있음

        Rabbit rabbit1 = (Rabbit) animal1; //Animal -> Rabbit : 다운캐스팅 (명시적 형변환)
//        Rabbit rabbit2 = animal1 // 다운캐스팅은 묵시적 형변환 안됨!!



    }

}
