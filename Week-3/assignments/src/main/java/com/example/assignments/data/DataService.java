package com.example.assignments.data;

import org.springframework.stereotype.Service;

@Service
public class DataService {
    public String accumulate(String numStr){

        // case 1: Lack of Parameter
        if(numStr == null){
            return "Lack of Parameter";
        }

        try{

            int num = Integer.parseInt(numStr);
            
            // case 2: Valid Parameter
            if(num > 0){
                return String.valueOf(((1 + num) * num) / 2);
            }else{

                // case 3: Parameter <= 0
                return "Parameter should be positive integer";
            }

        }catch(NumberFormatException e){

            // case 4: Wrong Parameter
            return "Wrong Parameter";
        }

    }
}
