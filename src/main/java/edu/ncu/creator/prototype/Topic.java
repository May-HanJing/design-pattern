package edu.ncu.creator.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {

    /**
     * 题目
     */
     private Map<String,String> options;

    /**
     * 答案
     */
    private String answer;

}
