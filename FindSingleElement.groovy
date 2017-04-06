/**
 * Created by leo.zinger on 4/2/17.
 */
class FindSingleElement {
    int FindSingleInt(lc540Array) {
        int lo, hi
        int m

        hi = lc540Array.length
        lo = 0
        m = (hi + lo) / 2
         for (; hi != lo; m = (hi + lo) / 2) {
            println "m=$m"

            if (m == 0) {
            // special case: when there are only 1 elements in the array
            return m
            }
            else if (m == 1){  // edge case: when there are only 3 elements left to test
                if (hi == 2){
                    if (lc540Array[0] == lc540Array[1]) {
                        return 2
                    } else {
                        return 0
                    }
                }
            }
            else {

                if(lc540Array[m] == lc540Array[m + 1]) {
                    return m
                }
                else if(lc540Array[m] < lc540Array[m + 1]) {
                    println "hi=$m"
                    hi = m
                }
                else if(lc540Array[m - 1] < lc540Array[m]) {
                    println "lo=$m"
                    lo = m
                }
            }
        }
    }

        public static void main(String[] args){

        int[] lc540Array = [1,1,2,3,3,4,4,8,8]
        FindSingleElement findSingleElement = new FindSingleElement()
        int singleElement = findSingleElement.FindSingleInt(lc540Array)
        //int singleElement = 4
        println "hello"
        println singleElement
        println "Found the single element : index $singleElement. Array Value = $lc540Array"
        println lc540Array[singleElement]
    }

}

