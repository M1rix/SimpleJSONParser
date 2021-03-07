import model.People;
import model.Root;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleParser {

    private static final String TAG_NAME_MAIN = "People";

    private static final String TAG_NAME = "Name";
    private static final String TAG_MOBILE = "Mobile";
    private static final String TAG_BOOLEAN = "Boolean";
    private static final String TAG_PET = "Pet";
    private static final String TAG_ADDRESS = "Address";

    public Root parse(){

        Root root = new Root();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("test.json")){
            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            JSONArray name = (JSONArray) rootJsonObject.get(TAG_NAME_MAIN);

            List<People> peopleList = new ArrayList<>();
            for (Object item : peopleList){
                JSONObject  peopleJsonObject = (JSONObject) item;

                String namePeople = (String) peopleJsonObject.get(TAG_NAME);
                long mobilePeople = (Long) peopleJsonObject.get(TAG_MOBILE);
                boolean booleanPeople = (boolean) peopleJsonObject.get(TAG_BOOLEAN);
                String petPeople = (String) peopleJsonObject.get(TAG_PET);
                String addressPeople = (String) peopleJsonObject.get(TAG_ADDRESS);

                People people = new People(namePeople,(int)mobilePeople,booleanPeople,petPeople,addressPeople);
                peopleList.add(people);
                root.setPeople(peopleList);
            }

            return root;
        }catch (Exception exp){
            System.out.println("Parsing ERROR: "+exp.toString());
        }

        return null;
    }



}
