package collections;

import com.sparta.dc.oop.zoo.Dog;
import com.sparta.dc.oop.zoo.Movable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        Dog dog = new Dog("Fido", 2021, 7, 13, "fetch");
//        List<Movable> movables = new ArrayList<>(List.of(dog));
//        moveable.add(new Dog("Fido", 2021, 12, 1, "Bones"));
//        Movable[] moveablesArr = {dog};
//        moveablesArr[0] = new Dog("Rex", 2001, 12, 1, "Bones");


        String message = "The cat in the hate comes back".trim().toLowerCase();
        HashMap<Character, Integer> lettersCount = new HashMap<>();

        for (char c : message.toCharArray()) {
            if (c != ' ') {
                lettersCount.merge(c, 1, Integer::sum);
            }
        }

        System.out.println(lettersCount);
    }
}
