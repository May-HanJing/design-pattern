package edu.ncu.creator.prototype.present;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceQuestion {

    private String name;

    private Map<String,String> choices;

    private String answer;
}
