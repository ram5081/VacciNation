package Exception;

import com.fasterxml.jackson.databind.RuntimeJsonMappingException;

public class PatientNotFoundException extends RuntimeJsonMappingException {

    public PatientNotFoundException(String message){
        super(message);
    }

}
