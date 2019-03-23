package venn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set {


    private Integer[] list;

    /*public Set(List<Integer> list){
        this.list = (Integer[]) list.toArray();
    }*/

    public Set(Integer[] list) {
        this.list = list;
    }

    /**
     * Union of Set A and B
     * @param B
     * @return
     */
    public Set intersection(Set B) {

        Set A = this;
        Set.Builder builder = new Builder();
        for(int eA : A.getList()) {
            for (int eB : B.getList()) {
                if(eA == eB) {
                    System.out.println(eA + " / " + eB);
                    builder.add(eA);
                }
            }
        }

        return builder.build();
    }


    public Integer[] getList() {
        return list;
    }

    @Override
    public String toString() {
        String output = "{";
        for(int i = 0; i < list.length; i++) {
            output += list[i];
            if(i + 1 != list.length)  output += " / ";
        }
        output += " }";
        return output;
    }

    /**
     * Builder class
     */
    public class Builder {

        private ArrayList<Integer> list;

        public Builder() {
            list = new ArrayList<>();
        }
        /**
         *
         * @param e element in a set
         */
        public void add(Integer e) {
            list.add(e);
        }

        public Set build() {
            return new Set(Arrays.copyOf(
                    list.toArray(),
                    list.toArray().length,
                    Integer[].class
            ));
        }
    }
}
