package collection.my0;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        //arrayObj[2] = "three"; //오류가 발생한다.
        for (int i = 0; i < arrayObj.length; i++) {
            System.out.println(arrayObj[i]);
        }

        ArrayList<String> al = new ArrayList<>(); //오른쪽 제네릭 타입 생략 권장
        al.add("one");
        al.add("two");
        al.add("three");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

}