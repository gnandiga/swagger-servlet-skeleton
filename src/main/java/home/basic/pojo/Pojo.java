package home.basic.pojo;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "A sample pojo")
public class Pojo
{
    String key;
    String value;

    public String getKey()
    {
        return key;
    }

    @ApiModelProperty(value = "Key", required=true)
    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    @ApiModelProperty(value = "Value", required=true)
    public void setValue(String value)
    {
        this.value = value;
    }
}
