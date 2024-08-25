package Package4;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student O1,Student O2) {
        return O2.age-O1.age;//大到小和sort默认区别
    }
}
