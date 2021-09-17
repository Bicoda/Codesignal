// Ratiorg got statues of different sizes.
// He wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
// He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

import java.util.Arrays;

final class MakeArrayConsecutive2 {

    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        return statues[statues.length - 1] - statues[0] - statues.length + 1;
    }
}