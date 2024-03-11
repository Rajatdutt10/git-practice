public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,4,7,9,10,23,45};
        int target = 10;
        

        Searching search = new Searching();


        System.out.println(" target is fount at index: " + search.LinerSearch(arr, target));

        System.out.println(" target is fount at index: " + search.sentinelSearch(arr, arr.length, target));
    }
}
