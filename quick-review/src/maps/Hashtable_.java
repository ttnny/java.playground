package maps;

import java.util.Hashtable;

public class Hashtable_ {
    public static void main(String[] args) {
        // Declare
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        // Hashtable vs HashMap:
        //
        //  Similar:
        //  - Fail-fast iteration
        //  - Unpredictable iteration order
        //
        //  Different:
        //  - HashMap doesn't provide any Enumeration, while Hashtable provides not fail-fast Enumeration
        //  - Hashtable doesn't allow null keys and null values, while HashMap do allow one null key and any number of null values
        //  - Hashtable‘s methods are synchronized while HashMaps‘s methods are not
        //
        // Source: https://www.baeldung.com/java-hash-table
    }
}