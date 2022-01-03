package xjcbugdemoapp.app;

import xjcbugdemoapp.domain.StatesAndProvinces;

/**
 * @author carl
 */
public class PrintStatesAndProvinces {

    public static void main(String[] args) {

        for( StatesAndProvinces st : StatesAndProvinces.values() ) {
            System.out.println( st );
        }
    }
}
