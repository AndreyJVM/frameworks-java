/**
 * Автор - Константин Барзаковский
 * Telegram - @qa_w_a_y
 * https://qaway.ru/
 */

public class Triangle {

    public static final String EQUILATERAL = "equilateral triangle";
    public static final String ISOSCELES = "isosceles triangle";
    public static final String TRIANGLE = "triangle";
    public static final String NOT_TRIANGLE = "not triangle";

    public static boolean isEquilateralTriangle(String input) {
        return isTriangle(input).equals(EQUILATERAL);
    }

    public static String isTriangle(String input) {
        String[] inputAsArray = input.split(" ");

        if (inputAsArray.length != 3) {
            throw new IllegalArgumentException("Wrong arguments count. 3 arguments are expected.");
        }

        for (String arg : inputAsArray) {
            if (!arg.matches("-?\\d+")) {
                throw new IllegalArgumentException(arg + " is not a digit.");
            }
        }

        Integer[] sides = new Integer[]{
                Integer.valueOf(inputAsArray[0]),
                Integer.valueOf(inputAsArray[1]),
                Integer.valueOf(inputAsArray[2])
        };

        for (Integer arg : sides) {
            if (arg <= 0) {
                throw new IllegalArgumentException(arg + " - side of the triangle must be positive.");
            }
        }

        if (!isTriangle(sides)) {
            return "not triangle";
        }
        if (sides[0].equals(sides[1]) && sides[1].equals(sides[2]) && sides[2].equals(sides[0])) {
            return "equilateral triangle";
        } else if (sides[0].equals(sides[1]) || sides[1].equals(sides[2]) || sides[2].equals(sides[0])) {
            return "isosceles triangle";
        } else if (isTriangle(sides)) {
            return "triangle";
        }

        return "not triangle";
    }

    private static boolean isTriangle(Integer[] sides) {
        return (((long) sides[0] + sides[1]) > sides[2]) &&
                (((long) sides[1] + sides[2]) > sides[0]) &&
                ((((long) sides[2] + sides[0]) > sides[1]));
    }
}