public class LinearSearch {
 public static void main(String[] args){

int[] arr = {3,7,2,9,5};
int target = 2;
boolean found = false;

for (int i = 0; i < arr.length; i++){
    if (arr[i] == target) {
        found = true;
        break ;
    }
    }
if (found) {
    System.out.println  ("Element found");

} else{
    System.out.println ("Element not found");
}
}
 }