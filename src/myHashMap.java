import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class myHashMap {

    HashMap<String, String> car = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    String wantModel;
    String wantMake;
    boolean haveModel = false;

    public void run(){

        car.put("Beetle", "Volkswagen");
        car.put("Toyota", "Tundra");

        System.out.println("What car are you looking for?");
        wantModel = scanner.nextLine();
        // String model = scanner.nextLine();

        for(Map.Entry<String, String> iterator : car.entrySet()) {  
            if(wantModel.equals(iterator.getKey())) {
                haveModel = true;
                wantMake = iterator.getValue();
            }
        }

        if(haveModel == true){
            System.out.println("Looking for a "+wantModel +"?\n Our "+wantMake + "selection is this way!");
        } else if (haveModel == false){
            System.out.println("We don't carry "+wantModel +"s here." );
        }

        // String key = iterator.getKey();
        // String value = iterator.getValue();
        // System.out.println("Looking for a "+key +"?\n Our "+value + "selection is this way.");
    


}
}
