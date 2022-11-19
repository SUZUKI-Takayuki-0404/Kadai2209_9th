package exercise9th.mybatisdemo.controller;

import exercise9th.mybatisdemo.entity.Name;
import lombok.Data;

@Data
public class NameResponse {

    private int id;
    private String name;

    public NameResponse(Name name) {
        this.id = name.getId();
        this.name = name.getName();
    }

}
