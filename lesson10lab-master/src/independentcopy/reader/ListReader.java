
package independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader{
    
    @Override
    public String readln() {
        String example = "Example string";
        String StringToReturn;
        List<String> list = new ArrayList<String>();
        list.add(example);
        return list.get(0);
    }   
}
