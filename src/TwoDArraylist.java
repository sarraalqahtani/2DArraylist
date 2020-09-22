import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArraylist {

    public static void iterateUsingForEach(ArrayList<ArrayList<Integer>> listOfLists) {

        // Iterate the 2D list
        // and print each element
        System.out.println("[");

        for (ArrayList<Integer> row : listOfLists) {
            System.out.print("  [");

            for (int item : row) {
                System.out.print("  "
                        + item
                        + " ");
            }
            System.out.println("], ");
        }
        System.out.println("]");
    }

    /*function for creating and returning 2D ArrayList*/
    static ArrayList create2DArrayList() {
        /*Declaring 2D ArrayList*/
        ArrayList<ArrayList<Integer>> x
                = new ArrayList<ArrayList<Integer>>();

        /*one space allocated for 0th row*/
        x.add(new ArrayList<Integer>());

        /*Adding 3 to 0th row created above x(0, 0)*/
        x.get(0).add(0, 3);

        /*Creating 1st row and adding values
       (another way for adding values in 2D collections)*/
        x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));

        /*Add 366 to 1st row 0th column x(1, 0)*/
        int y = 10;
        x.get(1).add(0, y);

        /*Add 576 to 1st row 4th column x(1, 4)*/
        x.get(1).add(4, 576);

        /*Adding values to 2nd row*/
        x.add(2, new ArrayList<>(Arrays.asList(3, 84)));

        /*Adding values to 3rd row*/
        x.add(new ArrayList<Integer>(Arrays.asList(83, 6684, 776)));

        /*Adding values to 4th row*/
        x.add(new ArrayList<>(Arrays.asList(8)));

        return x;
    }

    public static void main(String args[]) {
        System.out.println("2D ArrayList :");

        /*Printing 2D ArrayList*/
        iterateUsingForEach(create2DArrayList());
    }
}


