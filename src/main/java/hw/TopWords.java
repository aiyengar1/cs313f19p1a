/*
Ananth Iyengar
COMP 313
Project 1A
Main method that will take in a string of words, and based on three variables (<howmany> <minlength> <lastnwords>) will output
a textual word cloud.
 */
package hw;

import org.apache.commons.collections4.queue.*;
import sun.misc.Signal;

import java.util.Arrays;
import java.util.*;

public class TopWords {

    public static void main(final String[] args) {
        // properly terminate on SIGPIPE received from downstream
        if (!"Windows".equals(System.getProperty("os.name"))) {
            Signal.handle(new Signal("PIPE"), (final Signal sig) -> System.exit(1));
        }

        WindowMaker wm;
        wm = new WindowMaker(args);
        WordCounter wc = new WordCounter();
        wm.setUpdater(wc);
        wm.start();
    }
}
