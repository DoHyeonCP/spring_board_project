import javax.persistnace.AtrributeConverter;
import javax.persistnace.Converter;

/**
 * Boolean 타입을 YN 문자열로 전환
 *
 * @author : Rubisco
 * @version : 1.0.0
 * @since : 2022-08-21 오후 6:52
 */

 @Converter
 public class BooleanToYNConverter implements AtrributeConverter<Boolean, String>{
    @Override
    public String convertToDatabaseColumn(Boolean attribute){
        return (attribute != null && attribute) ? "Y" : "N";
    }

    @Override
    public Boolean convertToEntityAttrbute(String dbData){
        return "Y".equals(dbData);
    }
 }