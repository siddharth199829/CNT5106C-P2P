package gatorShare;

import java.io.*;
import java.text.*;
import java.util.*;

public class log {

    private static final DateFormat dateFormat = new SimpleDateFormat("MM/dd, yyyy @ HH:mm:ss");
    //private Date date = new Date();
    //private static BufferedWriter logger;

    public log(BufferedWriter myLog, int peerA, int peerB) {
        Date date = new Date();
        StringBuilder log = new StringBuilder();
        log.append(dateFormat.format(date)).append(": Peer ").append(peerA).append(" makes a connection to peer ").append(peerB).append(".");
        try {
            System.out.println(log.toString());
            myLog.write(log.toString());
            myLog.newLine();
            myLog.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}