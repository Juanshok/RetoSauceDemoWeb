package sauceDemo.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class CheckoutLombokData {
    private String firstName;
    private String lastName;
    private String postalCode;

    public static List<CheckoutLombokData> setData (DataTable table){
        List<CheckoutLombokData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for (Map<String, String> map: mapInfo){
            data.add(new ObjectMapper().convertValue(map, CheckoutLombokData.class));
        }
        return data;
    }
}
