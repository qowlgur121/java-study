package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() { //-> static메서드는 static변수만 접근할 수 있다.

        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod++; //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instaceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instaceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() { //static 선언해서 DecoData의 어떤 인스턴스도 생성하지 않고도 호출할 수 있다.
        System.out.println("staticValue=" + staticValue);
    }
}
