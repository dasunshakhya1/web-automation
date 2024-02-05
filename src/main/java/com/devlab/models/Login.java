package com.devlab.models;


import com.devlab.utils.jsonreader.JsonId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    @JsonId
    private String id;
    private String username;
    private String password;
}
