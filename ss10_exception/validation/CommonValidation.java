package ss10_exception.validation;

import ss10_exception_phone.exception.EmptyFieldException;
import ss10_exception_phone.exception.MinLengthException;
import ss10_exception_phone.exception.NegativeNumberException;
import ss10_exception_phone.exception.NumberOfRangeException;

public class CommonValidation {
    public static void validateIsEmpty(String value, String fieldName) throws EmptyFieldException {
        if(value.isEmpty()){
            throw new EmptyFieldException(fieldName + "Khong duoc bo trong!");
        }
    }

    public static int parseInt(String value, String fieldName) {
        try {
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            throw new NumberFormatException(fieldName + "Phai la so nguyen!");
        }
    }

    public static double parseDouble(String value, String fieldName) {
        try {
            return Double.parseDouble(value);
        }catch (NumberFormatException e){
            throw new NumberFormatException(fieldName + "Phai la so thuc nguyen!");
        }
    }

    public static void validateNumberOutOfRangeException(double value, String fieldName, double minValue, double maxValue)
    throws NumberOfRangeException {
        if(value < minValue || value > maxValue){
            throw new NumberOfRangeException(String.format("%s nam ngoai gia tri hop le: [ %d, %d]", fieldName, minValue, maxValue));
        }
    }

    public static void validateMinlength(String value, String fieldName, int minLength) throws MinLengthException {
        if(value.length() < minLength){
            throw new MinLengthException(String.format("%s phai co it nhat %d ki tu!", fieldName, minLength));
        }
    }

    public static void validateIsNegativeNumber(Double value, String fieldName) throws NegativeNumberException {
        if(value < 0){
            throw new NegativeNumberException(fieldName + "khong duoc so ao!");
        }
    }
}
