
package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

public class ListWriter implements Writer{

    public void writeln(String line) {
        List<String> list = new ArrayList<String>();   
        list.add(line);
        System.out.println(list.get(0));
    }
}
