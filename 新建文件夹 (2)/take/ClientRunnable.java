package com.take;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClientRunnable implements Runnable {

    Socket socket = null;
    ArrayList<Socket> sockets;
    Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
    public ClientRunnable(Socket socket,ArrayList<Socket> list,Map<String,Socket> socketHashMap){
        this.socket = socket;
        this.sockets = list;
        this.socketHashMap = socketHashMap;

    }

    @Override
    public void run() {
        while (true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String xiaoxi = null;

                xiaoxi = bufferedReader.readLine();

                //������˭���͵�
                Set<String> keys = socketHashMap.keySet();
                String name = "";
                for(String s:keys){
                    Socket so = socketHashMap.get(s);
                    if(socket==so){
                        name = s;
                    }
                }
                System.out.println("�ͻ��˷�������Ϊ" + xiaoxi);
                String s = name+"˵��" + xiaoxi;
                for(Socket socket1:sockets) {
                    PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
                    printWriter.write(s + "\n");
                    printWriter.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}