import java.util.*;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */

    public static String[] findCommon(String[] array1, String[] array2) {

        HashSet<String> elements = new HashSet<>();


        for (String s : array1) {
            for (String value : array2) {
                if (s.equals(value)) {
                    elements.add(s);
                }
            }
        }

        String[] result = elements.stream().toArray(String[]::new);

        return result;
    }


}


