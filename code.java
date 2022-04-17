public class code {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int toFind = 4;
        boolean found = false;

        for (int n : arr) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}
