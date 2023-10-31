package racingcar.util;

import java.util.HashSet;

import static racingcar.util.FixedNumber.ASCII_ZERO;
import static racingcar.util.FixedNumber.ASCII_NINE;

public class Invalidate {
    public static void checkNameLength(String[] cars) throws IllegalArgumentException {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].length() > 5) {
                throw new IllegalArgumentException("이름의 길이가 다섯 글자가 넘습니다.");
            }
        }
    }

    public static void checkNameGap(String[] cars) throws IllegalArgumentException {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].contains(" ")) {
                throw new IllegalArgumentException("이름에 공백이 들어갑니다.");
            }
        }
    }

    public static void checkNameDuplicate(String[] cars) throws IllegalArgumentException {
        HashSet<String> carList = new HashSet<>();

        for (int i = 0; i < cars.length; i++) {
            if (carList.contains(cars[i])) {
                throw new IllegalArgumentException("중복된 이름이 있습니다.");
            }

            carList.add(cars[i]);
        }
    }

    public static void checkNumber(String number) throws IllegalArgumentException {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < ASCII_ZERO || number.charAt(i) > ASCII_NINE) {
                throw new IllegalArgumentException("숫자가 아닙니다.");
            }
        }
    }
}
