package sauceDemo.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class LoginLombokData {
    private String username;
    private String password;

    public static List<LoginLombokData> setData (DataTable table){
        List<LoginLombokData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for (Map<String, String> map: mapInfo){
            data.add(new ObjectMapper().convertValue(map, LoginLombokData.class));
        }
        return data;
    }
}
